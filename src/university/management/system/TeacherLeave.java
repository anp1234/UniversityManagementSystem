/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package university.management.system;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.*;
import com.toedter.calendar.JDateChooser;
import java.sql.ResultSet;
import java.sql.*;
import java.awt.event.*;








/**
 *
 * @author acer
 */
public class TeacherLeave extends JFrame implements ActionListener{
    Choice crollno;
    JComboBox cduration;
    
    JDateChooser date;
    JButton submit,cancel;
    
    
    
    
    TeacherLeave()
    {
        
        JLabel heading=new JLabel("Teacher Leave");
        
        heading.setBounds(150, 30, 200, 40);
        heading.setFont(new Font("Raleway",Font.BOLD,20));
        
        add(heading);
        
        
        JLabel text1=new JLabel(" Employee Id:");
        text1.setBounds(50,100,200,30);
        text1.setFont(new Font("serif",Font.PLAIN,18));
        add(text1);
        
       crollno=new Choice();
       crollno.setBounds(50, 140, 200, 30);
       crollno.setFont(new Font("Raleway",Font.PLAIN,14));
       add(crollno);
       
       String query="select *from teacher";
       try
       {
           Conn c=new Conn();
           ResultSet rs=c.s.executeQuery(query);
           
            while(rs.next())
            {
                crollno.add(rs.getString("employee_id"));
                
                
            }
           
       }
       catch(SQLException e)
       {System.out.println(e);}
        
        
        JLabel text2=new JLabel(" Select Date for Leave:");
        text2.setBounds(50,180,200,30);
        text2.setFont(new Font("serif",Font.PLAIN,18));
        add(text2);
        
        
       date=new JDateChooser();
       date.setBounds(50, 230, 200, 30);
       add(date);
       
       
       JLabel duration=new JLabel("Application Duration");
       duration.setBounds(50,280,200,30);
       duration.setFont(new Font("serif",Font.PLAIN,18));
       add(duration);
       
       String duration_values[]={"Fullday" , "Halfday"};
       cduration=new JComboBox(duration_values);
       cduration.setFont(new Font("Raleway",Font.BOLD,14));
       
       cduration.setBounds(50,320,200,30);
       
       add(cduration);
       
       
       
       
       submit =new JButton("Submit");
       submit.setBounds(100,420,100,30);
       submit.setBackground(Color.black);
       submit.setForeground(Color.white);
       submit.addActionListener(this);
       add(submit);
       
       
       cancel =new JButton("Cancel");
       cancel.setBounds(220,420,100,30);
       cancel.setBackground(Color.black);
       cancel.setForeground(Color.white);
       cancel.addActionListener(this);
       add(cancel); 
       
      
       
        
        
        
        
        
        
        setTitle("Student Leave Application");
        setLayout(null);
        
        setVisible(true);
        getContentPane().setBackground(Color.white);
        setLocation(400,80);
        setSize(450,550);
        
        
    }
    
    
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==submit)
        {
            String srollno=crollno.getSelectedItem();
            String sdate=((JTextField)date.getDateEditor().getUiComponent()).getText();
            String sduration=(String)cduration.getSelectedItem();
            String query="insert into teacher_leave values('"+srollno+"','"+sdate+"','"+sduration+"')";
            
            try
            {
                Conn c=new Conn();
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Your application leave is registerd");
                setVisible(false);
                
                
            }
            catch(Exception e)
            {System.out.println(e);}
            
            
            
            
        }
        else if (ae.getSource()==cancel)
        {
            setVisible(false);
            
            
        }
    }
    
    public static void main(String args[])
    {
        new TeacherLeave();
        
    }
    
}

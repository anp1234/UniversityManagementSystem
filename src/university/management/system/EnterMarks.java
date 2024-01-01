/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package university.management.system;
import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.*;
import java.awt.event.*;



/**
 *
 * @author acer
 */
public class EnterMarks extends JFrame implements ActionListener{
    
    Choice crollno;
    JComboBox semester;
    JTextField s1,s2,s3,s4,s5;
    JTextField m1,m2,m3,m4,m5;
    JButton submit,cancel;
    
    EnterMarks()
    {
        JLabel heading=new JLabel("Enter the marks");
        heading.setBounds(200,30,320,30);
        heading.setFont(new Font("serif",Font.BOLD,24));
        add(heading);
        
        JLabel text1=new JLabel("Search Student Id:");
        text1.setBounds(50,100,200,30);
        text1.setFont(new Font("Raleway",Font.ROMAN_BASELINE,16));
        add(text1);
        
        JLabel text2=new JLabel("Semester:");
        text2.setBounds(50,150,200,30);
        text2.setFont(new Font("Raleway",Font.ROMAN_BASELINE,16));
        add(text2);
        
        
        crollno=new Choice();
        crollno.setBounds(260,104,200,30);
        crollno.setFont(new Font("Raleway",Font.BOLD,14));
        add(crollno);
        
        Conn c=new Conn();
        
        try
        {
        ResultSet rs=c.s.executeQuery("select * from student order by rollno asc");
        while(rs.next())
        {
            crollno.add(rs.getString("rollno"));
        }
        }
        catch(Exception e)
        {System.out.println(e);}
        
        
        String semester_values[]={"I","II","III","IV","V","VI","VII","VIII","IX","X"};
        semester=new JComboBox(semester_values);
        semester.setBounds(260,154,200,30);
        semester.setFont(new Font("Raleway",Font.BOLD,14));
        add(semester);
        
        
        
        JLabel text3=new JLabel("Enter Subjects");
        text3.setBounds(110,220,100,30);
        text3.setFont(new Font("Raleway",Font.BOLD,14));
        add(text3);
        
        JLabel text4=new JLabel("Enter Marks");
        text4.setBounds(340,220,100,30);
        text4.setFont(new Font("Raleway",Font.BOLD,14));
        add(text4);
        
        
        s1=new JTextField();
        s1.setBounds(50, 250, 200,30);
        s1.setFont(new Font("san-serif",Font.ROMAN_BASELINE,14));
        add(s1);
        
        
        s2=new JTextField();
        s2.setBounds(50, 285, 200,30);
        s2.setFont(new Font("san-serif",Font.ROMAN_BASELINE,14));
        add(s2);
        
        s3=new JTextField();
        s3.setBounds(50, 320, 200,30);
        s3.setFont(new Font("san-serif",Font.ROMAN_BASELINE,14));
        add(s3);
        
        s4=new JTextField();
        s4.setBounds(50, 355, 200,30);
        s4.setFont(new Font("san-serif",Font.ROMAN_BASELINE,14));
        add(s4);
        
        
        s5=new JTextField();
        s5.setBounds(50, 390, 200,30);
        s5.setFont(new Font("san-serif",Font.ROMAN_BASELINE,14));
        add(s5);
        
        
        m1=new JTextField();
        m1.setBounds(300, 250, 200,30);
        m1.setFont(new Font("san-serif",Font.ROMAN_BASELINE,14));
        add(m1);
        
        
        m2=new JTextField();
        m2.setBounds(300, 285, 200,30);
        m2.setFont(new Font("san-serif",Font.ROMAN_BASELINE,14));
        add(m2);
        
        m3=new JTextField();
        m3.setBounds(300, 320, 200,30);
        m3.setFont(new Font("san-serif",Font.ROMAN_BASELINE,14));
        add(m3);
        
        m4=new JTextField();
        m4.setBounds(300, 355, 200,30);
        m4.setFont(new Font("san-serif",Font.ROMAN_BASELINE,14));
        add(m4);
        
        
        m5=new JTextField();
        m5.setBounds(300, 390, 200,30);
        m5.setFont(new Font("san-serif",Font.ROMAN_BASELINE,14));
        add(m5);
        
        submit=new JButton("Submit");
        submit.setBounds(150,450,100,30);
        submit.setBackground(Color.black);
        submit.setForeground(Color.white);
        submit.addActionListener(this);
        add(submit);
        
        
        cancel=new JButton("Cancel");
        cancel.setBounds(300,450,100,30);
        cancel.setBackground(Color.black);
        cancel.setForeground(Color.white);
        cancel.addActionListener(this);
        add(cancel);
        
        
        
        
        
        
        setTitle("Exam Marks Entry");
        setLayout(null);
        setVisible(true);
        setSize(600,550);
        setLocation(380,70);
        getContentPane().setBackground(Color.white);
    }
    
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==submit)
        {
            Conn c=new Conn();
            String ss1=s1.getText();
            String ss2=s2.getText();
            String ss3=s3.getText();
            String ss4=s4.getText();
            String ss5=s5.getText();
            
            String mm1=m1.getText();
            String mm2=m2.getText();
            String mm3=m3.getText();
            String mm4=m4.getText();
            String mm5=m5.getText();
            String ssemester=(String)semester.getSelectedItem();
            String srollno=crollno.getSelectedItem();
            
            
            
            try 
            {
                c.s.executeUpdate("insert into marks values ('"+srollno+"','"+ssemester+"','"+ss1+"','"+ss2+"','"+ss3+"','"+ss4+"','"+ss5+"','"+mm1+"','"+mm2+"','"+mm3+"','"+mm4+"','"+mm5+"')");
                JOptionPane.showMessageDialog(null,"Marks updated successfully");
                setVisible(false);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
        
        else if(ae.getSource()==cancel)
        {
            setVisible(false);
        }
    }
    
    
    public static void main(String args[])
    {
        new EnterMarks();
    }
    
}

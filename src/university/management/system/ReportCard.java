/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package university.management.system;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;
import java.sql.ResultSet;



/**
 *
 * @author acer
 */
public class ReportCard extends JFrame implements ActionListener{
    String rollnumber;
    String s1,s2,s3,s4,s5,m1,m2,m3,m4,m5,semester;
    JButton back;
    ReportCard(String rollno)
            
    {
        
        this.rollnumber=rollno;
        JLabel heading=new JLabel("ABC University");
        heading.setBounds(150,50,200,30);
        heading.setFont(new Font("serif",Font.BOLD,24));
        add(heading);
        
        JLabel heading1=new JLabel("Student Examination Result");
        heading1.setBounds(130,85,230,30);
        heading1.setFont(new Font("san-serif",Font.BOLD,16));
        add(heading1);
        
        
        JLabel text1=new JLabel("Roll No:");
        text1.setBounds(50,125,100,30);
        text1.setFont(new Font("san-serif",Font.ROMAN_BASELINE,16));
        
        add(text1);
        
        
        JLabel text2=new JLabel("Semester:");
        text2.setBounds(50,160,100,30);
        text2.setFont(new Font("san-serif",Font.ROMAN_BASELINE,16));
        add(text2);
        
        
        JLabel text3=new JLabel("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        text3.setBounds(0,192,500,10);
        add(text3);
        
        
        try
        {
            
           Conn c=new Conn();
           ResultSet rs= c.s.executeQuery("select * from marks where rollno='"+rollnumber+"'");
           while(rs.next())
           {
           semester=rs.getString("semester");
           s1=rs.getString("subject1");
           s2=rs.getString("subject2");
           s3=rs.getString("subject3");
           s4=rs.getString("subject4");
           s5=rs.getString("subject5");
           
           m1=rs.getString("marks1");
           m2=rs.getString("marks2");
           m3=rs.getString("marks3");
           m4=rs.getString("marks4");
           m5=rs.getString("marks5");
           }
           
                     
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        
        JLabel rollvalue=new JLabel(rollnumber);
        rollvalue.setBounds(200,125,100,30);
        rollvalue.setFont(new Font("san-serif",Font.BOLD,16));
        add(rollvalue);
        
        JLabel semestervalue=new JLabel(semester+"-Semseter");
        semestervalue.setBounds(200,160,100,30);
        semestervalue.setFont(new Font("san-serif",Font.BOLD,16));
        add(semestervalue);
        
        
        
        JLabel subject1=new JLabel(s1);
        subject1.setBounds(50,200,100,30);
        subject1.setFont(new Font("Raleway",Font.BOLD,14));
        add(subject1);
        
        JLabel subject2=new JLabel(s2);
        subject2.setBounds(50,250,100,30);
        subject2.setFont(new Font("Raleway",Font.BOLD,14));
        add(subject2);
        
        JLabel subject3=new JLabel(s3);
        subject3.setBounds(50,300,100,30);
        subject3.setFont(new Font("Raleway",Font.BOLD,14));
        add(subject3);
        
        JLabel subject4=new JLabel(s4);
        subject4.setBounds(50,350,100,30);
        subject4.setFont(new Font("Raleway",Font.BOLD,14));
        add(subject4);
        
        JLabel subject5=new JLabel(s5);
        subject5.setBounds(50,400,100,30);
        subject5.setFont(new Font("Raleway",Font.BOLD,14));
        add(subject5);
        
        
        
        JLabel marks1=new JLabel(m1);
        marks1.setBounds(300,200,100,30);
        marks1.setFont(new Font("Raleway",Font.BOLD,14));
        add(marks1);
        
        JLabel marks2=new JLabel(m2);
        marks2.setBounds(300,250,100,30);
        marks2.setFont(new Font("Raleway",Font.BOLD,14));
        add(marks2);
        
        JLabel marks3=new JLabel(m3);
        marks3.setBounds(300,300,100,30);
        marks3.setFont(new Font("Raleway",Font.BOLD,14));
        add(marks3);
        
        JLabel marks4=new JLabel(m4);
        marks4.setBounds(300,350,100,30);
        marks4.setFont(new Font("Raleway",Font.BOLD,14));
        add(marks4);
        
        JLabel marks5=new JLabel(m5);
        marks5.setBounds(300,400,100,30);
        marks5.setFont(new Font("Raleway",Font.BOLD,14));
        add(marks5);
    
        
      
        
       back=new JButton("Back");
       back.setBounds(200,470,100,30);
       back.setBackground(Color.BLACK);
       back.setForeground(Color.WHITE);
       back.addActionListener(this);
       add(back);
       
       
        
        
        
        
        
        
        
        
        
        
        
        
        setLayout(null);
        setVisible(true);
        setTitle("Report Card");
        setSize(500,550);
        setLocation(400,50);
        getContentPane().setBackground(Color.WHITE);
        
        
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==back)
        {
            setVisible(false);
        }
    }
    
    
    public static void main(String args[])
    {
        new ReportCard("");
        
    }
    
}

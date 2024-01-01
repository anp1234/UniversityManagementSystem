/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package university.management.system;
import javax.swing.*;
import java.awt.*;
import com.toedter.calendar.JDateChooser;
import java.util.*;
import java.awt.event.*;
import java.sql.*;







/**
 *
 * @author acer
 */
public class AddTeacher  extends JFrame implements ActionListener{
    JButton submit,cancel;
    JTextField name,address,email,classxii,fname,phone,classx,citizenship;
    JLabel teacherid;
    
    JDateChooser dob;
    JComboBox qualification,department;
    Random ran=new Random();
    long first4=Math.abs(ran.nextLong()%9000L+1000L);
    
    
    
    AddTeacher()
    {
        
        
        JLabel text=new JLabel("New Teacher Details");
        text.setBounds(320, 20, 500, 50);
        text.setFont(new Font("serif",Font.BOLD,28));
        add(text);
        
        JLabel text1=new JLabel("Name:");
        text1.setFont(new Font("Raleway",Font.BOLD,18));
        text1.setBounds(50, 100, 100, 30);
        add(text1);
        
        name=new JTextField();
        name.setBounds(200, 100, 150, 30);
        add(name);
        
        JLabel text2=new JLabel("Employee Id:");
        text2.setFont(new Font("Raleway",Font.BOLD,18));
        text2.setBounds(50, 180, 150, 30);
        add(text2);
        
        
        teacherid=new JLabel("101"+first4);
        teacherid.setBounds(200,180,150,30);
        teacherid.setFont(new Font("Raleway",Font.BOLD,18));
        add(teacherid);
        
        
        
        
        
//        rollno=new JTextField();
//        rollno.setBounds(150, 180, 150, 30);
//        add(rollno);
         
        
        
        JLabel text3=new JLabel("Address:");
        text3.setFont(new Font("Raleway",Font.BOLD,18));
        text3.setBounds(50, 260, 100, 30);
        add(text3);
        
        address=new JTextField();
        address.setBounds(200, 260, 150, 30);
        add(address);
        
        JLabel text4=new JLabel("Email Id:");
        text4.setFont(new Font("Raleway",Font.BOLD,18));
        text4.setBounds(50, 340, 100, 30);
        add(text4);
        
        
        email=new JTextField();
        email.setBounds(200, 340, 150, 30);
        add(email);
        
        
        
        JLabel text5=new JLabel("XII(%/GPA):");
        text5.setFont(new Font("Raleway",Font.BOLD,18));
        text5.setBounds(50, 420, 200, 30);
        add(text5);
        
        classxii=new JTextField();
        classxii.setBounds(200,420,150,30);
        add(classxii);
        
        
        
        
        JLabel text6=new JLabel("Qualifiaction");
        text6.setFont(new Font("Raleway",Font.BOLD,18));
        text6.setBounds(50, 500, 150, 30);
        add(text6);
        
        String courses[]={"B.Tech","BA","BSc","M.Tech","MA","MSc","PhD"};
        qualification=new JComboBox(courses);
        qualification.setBounds(200,500,150,30);
        add(qualification);
        
        
        JLabel text7=new JLabel("Father's Name");
        text7.setFont(new Font("Raleway",Font.BOLD,18));
        text7.setBounds(430,100,200, 30);
        add(text7);
        
        
        fname=new JTextField();
        fname.setBounds(600,100,200,30);
        add(fname);
        
        JLabel text8=new JLabel("Date of Birth");
        text8.setFont(new Font("Raleway",Font.BOLD,18));
        text8.setBounds(430, 180, 200, 30);
        add(text8);
        
        dob=new JDateChooser();
        dob.setBounds(600,180,200,30);
        add(dob);
        
        
        
        JLabel text9=new JLabel("Phone");
        text9.setFont(new Font("Raleway",Font.BOLD,18));
        text9.setBounds(430, 260, 100, 30);
        add(text9);
        
        phone=new JTextField();
        phone.setBounds(600,260,200,30);
        add(phone);
        
        JLabel text10=new JLabel("Class X(%/GPA)");
        text10.setFont(new Font("Raleway",Font.BOLD,18));
        text10.setBounds(430, 340, 200, 30);
        add(text10);
        
        classx=new JTextField();
        classx.setBounds(600,340,200,30);
        add(classx);
        
        
        
        JLabel text11=new JLabel("Citizenship No");
        text11.setFont(new Font("Raleway",Font.BOLD,18));
        text11.setBounds(430, 420, 200, 30);
        add(text11);
        
        citizenship =new JTextField();
        citizenship.setBounds(600,420,200,30);
        add(citizenship);
        
        
        
        JLabel text12=new JLabel("Department");
        text12.setFont(new Font("Raleway",Font.BOLD,18));
        text12.setBounds(430, 500, 150, 30);
        add(text12);
        
        
        String branches[]={"Computer Science","Electronics","Electrical Eng","Civil Eng","Business","Mathematics","Physics","Chemistry","Economics","Sociology"};
        department=new JComboBox(branches);
        department.setBounds(600,500,200,30);
        add(department);
        
        
        
        
        submit=new JButton("Submit");
        submit.setBounds(300,570,100,30);
        submit.setBackground(Color.black);
        submit.setForeground(Color.white);
        submit.addActionListener(this);
        add(submit);
        
        cancel=new JButton("Cancel");
        cancel.setBounds(450,570,100,30);
        cancel.setBackground(Color.black);
        cancel.setForeground(Color.white);
        cancel.addActionListener(this);
        add(cancel);
        
        
        
        
        
        
        
        
        
        
        

//        
//       
//        
//        
//        
//        
//       
//       
//       
//       
//        
//        
//       

//        
//       
//        
//        
//        
//        
        
        
        
        
        setLayout(null);
        setVisible(true);
        setSize(900,700);
        setLocation(240,20);
        
        
    }
    
    
    
    
    public static void main(String args[])
    {
        new AddTeacher();
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
       
        if (ae.getSource()==submit)
        {
            String sname=name.getText();
            String steacherid=teacherid.getText();
            String saddress=address.getText();
            String semail=email.getText();
            String sclassxii=classxii.getText();
            String squalification=(String)qualification.getSelectedItem();
            String sfname=fname.getText();
            String sphone =phone.getText();
            String sclassx=classx.getText();
            String sdepartment=(String)department.getSelectedItem();
            String sdob=((JTextField)dob.getDateEditor().getUiComponent()).getText();
            String scitizenship=citizenship.getText();
            
            
            
            
            
            
            
            String query="insert into teacher values('"+sname+"','"+steacherid+"','"+saddress+"','"+semail+"','"+sclassxii+"','"+squalification+"','"+sfname+"','"+sdob+"','"+sphone+"','"+sclassx+"','"+scitizenship+"','"+sdepartment+"') ";
            
            
            
            try
            {
             Conn c=new Conn();
             c.s.executeUpdate(query);
             JOptionPane.showMessageDialog(null,"Teacher Details successfully inserted");
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
    
    
}

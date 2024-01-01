/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package university.management.system;
import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author acer
 */
public class UpdateTeacher extends JFrame implements ActionListener {
    JButton submit,cancel,updates;
    JTextField name,address,email,classxii,fname,phone,classx,citizenship;
    JLabel teacherid;
    String tname,taddress,temail,tclassxii,tfname,tphone,tclassx,tcitizenship,tdob,tcourse,tbranch,trollno;
    JDateChooser dob;
    JComboBox course,branch;
    Choice crollno;
    
    
    
    
    UpdateTeacher()
    {
 JLabel update=new JLabel("Search By Employee Id:");
update.setBounds(50,50,170,30);
update.setFont(new Font("Raleway",Font.ITALIC,14));
add(update);


        crollno=new Choice();
        crollno.setBounds(230,54,150,30);
        add(crollno);
        
        updates =new JButton("Search");
        updates.setBounds(450, 50 , 100, 30);
        updates.setForeground(Color.white);
        updates.setBackground(Color.black);
        updates.addActionListener(this);
        add(updates);
        
        
        
        
        
        
        
        
        
        
        
        
        try
        {
            Conn c=new Conn();
           ResultSet rs= c.s.executeQuery("select * from teacher order by employee_id asc");
           while(rs.next())
           {
               crollno.add(rs.getString("employee_id"));
           }
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
            
        
      
        
                
                
//        JLabel text=new JLabel("Update Student Details");
//        text.setBounds(320, 20, 500, 50);
//        text.setFont(new Font("serif",Font.BOLD,28));
//        add(text);
        
        JLabel text1=new JLabel("Name:");
        text1.setFont(new Font("Raleway",Font.BOLD,18));
        text1.setBounds(50, 100, 100, 30);
        add(text1);
        
        name=new JTextField(tname);
        name.setBounds(200, 100, 150, 30);
        add(name);
        
        JLabel text2=new JLabel("Roll No:");
        text2.setFont(new Font("Raleway",Font.BOLD,18));
        text2.setBounds(50, 180, 100, 30);
        add(text2);
    
        teacherid=new JLabel();
        teacherid.setBounds(200,180,150,30);
        teacherid.setFont(new Font("Raleway",Font.BOLD,18));
        add(teacherid);
    
        JLabel text3=new JLabel("Address:");
        text3.setFont(new Font("Raleway",Font.BOLD,18));
        text3.setBounds(50, 260, 100, 30);
        add(text3);
        
        address=new JTextField(taddress);
        address.setBounds(200, 260, 150, 30);
        add(address);
        
        JLabel text4=new JLabel("Email Id:");
        text4.setFont(new Font("Raleway",Font.BOLD,18));
        text4.setBounds(50, 340, 100, 30);
        add(text4);
        
        
        email=new JTextField(temail);
        email.setBounds(200, 340, 150, 30);
        add(email);
        
        
        
        JLabel text5=new JLabel("XII(%/GPA):");
        text5.setFont(new Font("Raleway",Font.BOLD,18));
        text5.setBounds(50, 420, 200, 30);
        add(text5);
        
        classxii=new JTextField(tclassxii);
        classxii.setBounds(200,420,150,30);
        add(classxii);
        
        
        
        
        JLabel text6=new JLabel("Qualification");
        text6.setFont(new Font("Raleway",Font.BOLD,18));
        text6.setBounds(50, 500, 200, 30);
        add(text6);
        
        String courses[]={"B.Tech","BA","BSc","M.Tech","MA","MSc","PhD"};
        course=new JComboBox(courses);
        course.setBounds(200,500,150,30);
        add(course);
        
        
        JLabel text7=new JLabel("Father's Name");
        text7.setFont(new Font("Raleway",Font.BOLD,18));
        text7.setBounds(430,100,200, 30);
        add(text7);
        
        
        fname=new JTextField(tfname);
        fname.setBounds(650,100,200,30);
        add(fname);
        
        JLabel text8=new JLabel("Date of Birth");
        text8.setFont(new Font("Raleway",Font.BOLD,18));
        text8.setBounds(430, 180, 200, 30);
        add(text8);
        
        dob=new JDateChooser();
        dob.setBounds(650,180,200,30);
        add(dob);
        
        
        
        JLabel text9=new JLabel("Phone");
        text9.setFont(new Font("Raleway",Font.BOLD,18));
        text9.setBounds(430, 260, 100, 30);
        add(text9);
        
        phone=new JTextField(tphone);
        phone.setBounds(650,260,200,30);
        add(phone);
        
        JLabel text10=new JLabel("Class X(%/GPA)");
        text10.setFont(new Font("Raleway",Font.BOLD,18));
        text10.setBounds(430, 340, 200, 30);
        add(text10);
        
        classx=new JTextField(tclassx);
        classx.setBounds(650,340,200,30);
        add(classx);
        
        
        JLabel text11=new JLabel("Citizenship No");
        text11.setFont(new Font("Raleway",Font.BOLD,18));
        text11.setBounds(430, 420, 200, 30);
        add(text11);
        
        citizenship =new JTextField(tcitizenship);
        citizenship.setBounds(650,420,200,30);
        add(citizenship);
        
        
        
        JLabel text12=new JLabel("Department");
        text12.setFont(new Font("Raleway",Font.BOLD,18));
        text12.setBounds(430, 500, 200, 30);
        add(text12);
        
        
        String branches[]={"Computer Science","Electronics","Electrical Eng","Civil Eng","Business","Mathematics","Physics","Chemistry","Economics","Sociology"};
        branch=new JComboBox(branches);
        branch.setBounds(650,500,200,30);
        add(branch);
        
                
        submit=new JButton("Update");
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
        
     
        
    
    
    
    
        setLayout(null);
        setVisible(true);
        setSize(900,700);
        setLocation(240,20);
        
    

        
        
        
        
    
    }
    
    
    
    
  
    public static void main(String args[])
    {
        new UpdateTeacher();
        
        
        
        
        
        
        
       
        
    }

    @Override
    public void actionPerformed(ActionEvent ae)
    {
          if (ae.getSource()==updates)
          {
              String selected_teacher_id=crollno.getSelectedItem();
              Conn   c =new Conn();
              try {
                  
                  ResultSet rs=c.s.executeQuery("select * from teacher where employee_id='"+selected_teacher_id+"'");
                  
                  
              while(rs.next())
              {
                  
                  
              name.setText(rs.getString("name"));
              address.setText(rs.getString("address"));
              email.setText(rs.getString("email"));
              phone.setText(rs.getString("phone"));
              classxii.setText(rs.getString("xii_marks"));
              classx.setText(rs.getString("x_marks"));
              citizenship.setText(rs.getString("citizenship"));
              teacherid.setText(rs.getString("employee_id"));
              fname.setText(rs.getString("fathers_name"));
              
              
              }
                  
              } catch (SQLException ex) {
                 Logger.getLogger(UpdateStudent.class.getName()).log(Level.SEVERE, null, ex);
              }
              
              
               
              
               }
          
          
          
          else if(ae.getSource()==submit)
          {
              Conn c=new Conn();
              
            
            String sname=name.getText();
            String steacherid=teacherid.getText();
            String saddress=address.getText();
            String semail=email.getText();
            String sclassxii=classxii.getText();
            String scourse=(String)course.getSelectedItem();
            String sfname=fname.getText();
            String sphone =phone.getText();
            String sclassx=classx.getText();
            String sbranch=(String)branch.getSelectedItem();
            String sdob=((JTextField)dob.getDateEditor().getUiComponent()).getText();
            String scitizenship=citizenship.getText();
            String query="insert into teacher values('"+sname+"','"+steacherid+"','"+saddress+"','"+semail+"','"+sclassxii+"','"+scourse+"','"+sfname+"','"+sdob+"','"+sphone+"','"+sclassx+"','"+scitizenship+"','"+sbranch+"') ";
            try
            {
                
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Successfully Updated");
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

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package university.management.system;
import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.sql.ResultSet;





/**
 *
 * @author acer
 */
public class Login extends JFrame implements ActionListener {
    JButton login, cancel,sign;
    JTextField usernameTextField;
    JPasswordField passwordField;
    
    
    
    Login()
            
    {
        
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
         Image i2=i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        JLabel image=new JLabel(i1);
        image.setBounds(350,30,200,200);
        add(image);
        
        
        
        JLabel username=new JLabel("Username:");
        username.setBounds(50,30,100,30);
        add(username);
        
        
        usernameTextField=new JTextField();
        usernameTextField.setBounds(150, 30, 150, 30);
        add(usernameTextField);
        
        
        
        JLabel password=new JLabel("Password:");
        password.setBounds(50,70,100,30);
        add(password);
        
        passwordField=new JPasswordField();
        passwordField.setBounds(150, 70, 150, 30);
        add(passwordField);
        
        
        login=new JButton("Login");
        login.setBounds(50,150,100,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);
        
        
        
        
        cancel=new JButton("Cancel");
        cancel.setBounds(180,150,100,30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        add(cancel);
        
//        sign=new JButton("Signup");
//        sign.setBounds(55,200,220,30);
//        sign.setBackground(Color.BLACK);
//        sign.setForeground(Color.WHITE);
//        add(sign);
//        
        
        
        
        
        
        
        
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        setTitle("Login Page");
        setVisible(true);
        setSize(600,300);
        setLocation(420,200 );
    }
    public void actionPerformed(ActionEvent ae)
    {
        
        if(ae.getSource()==login)
        {
            String username=usernameTextField.getText();
            String password=passwordField.getText();
         
            String query="select * from login where username='"+username+"' and password='"+password+"'";
            
            
            if (username.equals(""))
            {
                JOptionPane.showMessageDialog(null,"Plese enter the details");
                
            }
            
            else{
            try
            {
                Conn c=new Conn();
                ResultSet rs=(ResultSet) c.s.executeQuery(query);
                if(rs.next())
                {
                    setVisible(false);
                    new Project();
                    JOptionPane.showMessageDialog(null, "You are successfully signed in");
                    
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Invalid username or password");
                }
                
                c.s.close();
            }
            
            catch(Exception e)
            {
                System.out.println(e);
            }
            }
            
            
            
            
            
            
            
//            setVisible(false);
        }
        
        
        if(ae.getSource()==cancel)
        {
            setVisible(false);
        }
    }
    
    
    public static void main(String args[])
    {
        new Login();
    }
    
}

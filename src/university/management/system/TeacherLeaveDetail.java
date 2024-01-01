/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package university.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.sql.ResultSet;
import java.sql.*;
import net.proteanit.sql.DbUtils;





/**
 *
 * @author acer
 */
public class TeacherLeaveDetail extends JFrame implements ActionListener{
    Choice crollno;
    JButton search,update,add,print,cancel;
    JTable table;
    
    
    TeacherLeaveDetail()
    {
        JLabel heading=new JLabel("Search by Employee Id:");
        heading.setBounds(20,50,150,30);
        add(heading);
        
        crollno=new Choice();
        crollno.setBounds(170,54,150,30);
        add(crollno);
        
        try
        {
            Conn c=new Conn();
            ResultSet rs=c.s.executeQuery("select * from teacher_leave");
            while(rs.next())
            {
            
                crollno.add(rs.getString("employee_id"));
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        search=new JButton("Search");
        search.setBounds(20, 120, 100, 30);
        search.addActionListener(this);
        add(search);
        
         update=new JButton("Update");
        update.setBounds(100, 120, 100, 30);
        update.addActionListener(this);
        add(update);
        
        
          add=new JButton("Add");
        add.setBounds(180, 120, 100, 30);
        add.addActionListener(this);
        
        add(add);
        
          print=new JButton("Print");
        print.setBounds(260, 120, 100, 30);
        print.addActionListener(this);
        
        add(print);
        
        
         cancel=new JButton("Cancel");
        cancel.setBounds(340, 120, 100, 30);
        cancel.addActionListener(this);
        add(cancel);
        
        
        table =new JTable();
        JScrollPane jsp=new JScrollPane(table);
        jsp.setBounds(0,200,900,600);
        add(jsp);
        
        
        try
        {
            Conn c=new Conn();
            ResultSet rs=c.s.executeQuery("select *from teacher_leave");
            
            table.setModel(DbUtils.resultSetToTableModel(rs));
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        
        
        
        
        
        setTitle("Teacher Leave Details");
        
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setVisible(true);
        setSize(900,700);
        setLocation(240,20);
        
    }
    
    
   

    @Override
    
    public void actionPerformed(ActionEvent ae) 
    {
         if(ae.getSource()==print)
        {
        try{
            
            table.print();
            
        
        }
        catch(Exception e)
            
        {
            System.out.println(e);
            
        }
    }
        else if (ae.getSource()==cancel)
        {
            setVisible(false);
            new Project();
            
           
        }
        
        
        else if (ae.getSource()==add)
        {
            setVisible(false);
           
            
           
        }
        
        else if (ae.getSource()==update)
        {
            setVisible(false);
//            new UpdateStudent();
            
           
        }
        else if (ae.getSource()==search)
        {

                String query="select * from teacher_leave where employee_id='"+crollno.getSelectedItem()+"'";
                try
                {
                   Conn c=new Conn();
                   ResultSet rs= c.s.executeQuery(query);
                   table.setModel(DbUtils.resultSetToTableModel(rs));
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
           
        }

    }
    
     public static void main(String args[])
    {
        new TeacherLeaveDetail();
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package university.management.system;
import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;
import java.sql.*;
import net.proteanit.sql.DbUtils;
import java.awt.event.*;
import java.awt.print.PrinterException;





/**
 *
 * @author acer
 */
public class TeacherDetail extends JFrame implements ActionListener{
    Choice crollno;
    JTable table;
    JButton search, update,print,add,cancel,delete;
    String delete_row;
    
    
    
    TeacherDetail()
    {
        
        JLabel heading=new JLabel("Search by Employee Id:");
        heading.setBounds(20,50,150,30);
        add(heading);
        
        crollno=new Choice();
        crollno.setBounds(170,54,150,30);
        add(crollno);
        
        
        try{
            Conn c=new Conn();
            
            ResultSet rs=c.s.executeQuery("select * from teacher");
            while(rs.next())
            {
                crollno.add(rs.getString("employee_id"));
                
            }
            
            
        }
        catch(SQLException e)
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
        
        delete=new JButton("Delete");
        delete.setBounds(260, 120, 100, 30);
        delete.addActionListener(this);
        add(delete);
        
        print=new JButton("Print");
        print.setBounds(340, 120, 100, 30);
        print.addActionListener(this);
        
        add(print);
        
        
        cancel=new JButton("Cancel");
        cancel.setBounds(420, 120, 100, 30);
        cancel.addActionListener(this);
        add(cancel);
        
        
        
        
        table=new JTable();
        JScrollPane jsp=new JScrollPane(table);
        jsp.setBounds(0,200,900,600);
        add(jsp);
        
        
        try{
            Conn c=new Conn();
            
            ResultSet rs=c.s.executeQuery("select * from teacher");
            table.setModel(DbUtils.resultSetToTableModel(rs));
           
            
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        
        
        table.addMouseListener(new MouseAdapter()
                
        {
            public void mouseClicked(MouseEvent me)
                {
                    int row=table.getSelectedRow();
                    delete_row=table.getModel().getValueAt(row, 1).toString();
                    
                    
                }
                }
        );
        
        
        
        
        
        
        
        
        
        setTitle("Teacher Details");
        
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
        catch(PrinterException e)
            
        {
            System.out.println(e);
            
        }
    }
        else if (ae.getSource()==cancel)
        {
            setVisible(false);
          
            
           
        }
        
        
        else if (ae.getSource()==add)
        {
            setVisible(false);
            new AddTeacher();
            
           
        }
        
        else if (ae.getSource()==update)
        {
            setVisible(false);
//            new UpdateStudent();
            
           
        }
        else if (ae.getSource()==search)
        {

                String query="select * from teacher where employee_id='"+crollno.getSelectedItem()+"'";
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
        
        else if (ae.getSource()==delete)
        {
            try
            {
                Conn c=new Conn();
                c.s.executeUpdate("delete from teacher where employee_id='"+delete_row+"'");
                c.s.executeUpdate("delete from teacher_leave where employee_id='"+delete_row+"'");
                JOptionPane.showMessageDialog(null, "Successfully deleted ");
                setVisible(false);
                new TeacherDetail();
                
            }
            catch(Exception e)
            {System.out.println(e);}
        }
        
        
    }
    
    
    public static void main(String args[])
    {
        new TeacherDetail();
        
    }

    
            
    
}


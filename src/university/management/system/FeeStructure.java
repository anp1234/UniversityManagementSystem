/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package university.management.system;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;


/**
 *
 * @author acer
 */
public class FeeStructure extends JFrame{
    JTable table;
    
    
    
    FeeStructure()
    {
        JLabel heading=new JLabel("Fee Structure");
        
        heading.setBounds(370,50,200,50);
        heading.setFont(new Font("serif",Font.BOLD,25));
        add(heading);
        
        table=new JTable();
        JScrollPane jsp=new JScrollPane(table);
        jsp.setBounds(0,150, 915, 600);
        add(jsp);
        
        
        try
        {
            Conn c=new Conn();
            ResultSet rs=c.s.executeQuery("select * from fee");
            while(rs.next())
            {
                table.setModel(DbUtils.resultSetToTableModel(rs));
                
                
            }
            
        }
        catch(Exception e)
        {System.out.println(e);}
        
        
        
        
        
        
        setLayout(null);
        setVisible(true);
        setSize(920,600);
        setLocation(200,50);
        getContentPane().setBackground(Color.WHITE);
        
    }
    
    
    
    
    public static void main(String args[])
    {
        new FeeStructure();
        
    }
}

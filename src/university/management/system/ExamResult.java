/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package university.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author acer
 */
public class ExamResult extends JFrame implements ActionListener {
    JTextField rollno;
    JButton result,cancel;
    JTable table;
    
    
    ExamResult()
    {
        
        JLabel text1=new JLabel("Student Roll No:");
        text1.setBounds(50,50,200,30);
        text1.setFont(new Font("serif",Font.BOLD,24));
        add(text1);
        
        rollno=new JTextField();
        rollno.setBounds(50,100,200,30);
        rollno.setFont(new Font("san-serif",Font.ROMAN_BASELINE,16));
        add(rollno);
        
        result=new JButton("Result");
        result.setBounds(300,96,100,30);
        result.setBackground(Color.black);
        result.setForeground(Color.white);
        result.setFont(new Font("Raleway",Font.BOLD,16));
        result.addActionListener(this);
        add(result);
        
        
        cancel=new JButton("Cancel");
        cancel.setBounds(450,96,100,30);
        cancel.setBackground(Color.black);
        cancel.setForeground(Color.white);
        cancel.setFont(new Font("Raleway",Font.BOLD,16));
        cancel.addActionListener(this);
        add(cancel);
        
        table=new JTable();
        JScrollPane jsp=new JScrollPane(table);
        jsp.setBounds(5,180,900,695);
        add(jsp);
        
        
        
       
        try
        {
          Conn c=new Conn();
          ResultSet rs=c.s.executeQuery("select *from student");
          table.setModel(DbUtils.resultSetToTableModel(rs));
          
          
         
          
          
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        table.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent me )
            {
                int row=table.getSelectedRow();
                rollno.setText(table.getModel().getValueAt(row, 1).toString());
                
            }
            
        });
        
        
        
        
        
        
        
        
        setTitle("Exam Result");
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setVisible(true);
        setSize(900,700);
        setLocation(240,20);
        
    }
    
   
    
    public void actionPerformed(ActionEvent ae)    
    {
        if(ae.getSource()==cancel)
        {
            setVisible(false);
//            
        }
        else if(ae.getSource()==result)
        {
            setVisible(false);
            String rollnumber=rollno.getText();
            
            
            new ReportCard(rollnumber);
        }
    }
    
    
    
    
    
    
    public static void main(String args[])
    {
        new ExamResult();
    }

    

   
    
}

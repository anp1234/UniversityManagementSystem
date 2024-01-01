/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package university.management.system;
import java.sql.*;


/**
 *
 * @author acer
 */
public class Conn {
    
    Connection c;
    Statement s;
    
    
    Conn()
    {
        try
        {
        Class.forName("com.mysql.cj.jdbc.Driver");
        c=DriverManager.getConnection("jdbc:mysql://localhost:3306/universitymanagementsystem","root","Cootpit$7");
        s=c.createStatement();
        
        
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    
    
    
   

    
}

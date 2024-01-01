/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package university.management.system;
import javax.swing.*;
import java.awt.*;

    

/**
 *
 * @author acer
 */
public class Splash extends JFrame implements Runnable{
    Thread t;
    
    Splash()
    {
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/univresity.jpg"));
        Image i2=i1.getImage().getScaledInstance(900,650,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        add(image);
        
        
        ImageIcon m1=new ImageIcon(ClassLoader.getSystemResource("icons/giphy.gif"));
        Image m2=m1.getImage().getScaledInstance(300 ,200,Image.SCALE_DEFAULT);
        ImageIcon m3=new ImageIcon(m2);
        JLabel gif=new JLabel(m3);
        gif.setBounds(300, 200, 300 , 200);
        image.add(gif);
        
        
        t=new Thread(this);
        t.start();
        
        
        
        setVisible(true);
        setSize(900,650);
        setLocation(170,20);
        
//        try
//        {
//            Thread.sleep(10);
//        }
//        catch(Exception e)
//        {
//            System.out.println(e);
//        }
        
        
        
    }
    @Override
    public void run() {
   
    try
    {
        Thread.sleep(7000);
        setVisible(false);
        
       new Login();
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
    
    }
    
    
    
    
    
    public static void main(String args[])
    {
        new Splash();
        
    }

    
    
}





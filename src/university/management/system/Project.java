/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package university.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;




/**
 *
 * @author acer
 */
public class Project  extends JFrame implements ActionListener{
    
    Project()
    {        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/univresity.jpg"));
        JLabel image=new JLabel(i1);
        image.setBounds(0, 0, 1280, 800);
        add(image);
        
        JMenuBar mb=new JMenuBar();
        setJMenuBar(mb);
        //information
        JMenu newInformation=new JMenu("New Information");
        
        mb.add(newInformation);
        
        JMenuItem studentInfo=new JMenuItem("Add Student");
        studentInfo.addActionListener(this);
        newInformation.add(studentInfo);
        
        
        JMenuItem facultyInfo=new JMenuItem("Add Faculty");
        facultyInfo.addActionListener(this);
        newInformation.add(facultyInfo);
        
        //details
        JMenu details=new JMenu("View Details");
        mb.add(details);
        
        JMenuItem studentDetails=new JMenuItem("Student Details");
        studentDetails.addActionListener(this);
        details.add(studentDetails);
        
        
        JMenuItem facultyDetails=new JMenuItem("Faculty Details");
        facultyDetails.addActionListener(this);
        details.add(facultyDetails);
        
        
        //leave
        
        JMenu leave=new JMenu("Apply Leave");
        mb.add(leave);
        
        JMenuItem studentLeave=new JMenuItem("Student Leave");
        studentLeave.addActionListener(this);
        leave.add(studentLeave);
        
        
        JMenuItem facultyLeave=new JMenuItem("Faculty Leave");
        facultyLeave.addActionListener(this);
        leave.add(facultyLeave);
        
        //leave Details
        
        JMenu leaveDetails=new JMenu("Leave Details");
        mb.add(leaveDetails);
        
        JMenuItem studentLeaveDetails=new JMenuItem("Student Leave Details");
        studentLeaveDetails.addActionListener(this);
        leaveDetails.add(studentLeaveDetails);
        
        
        JMenuItem facultyLeaveDetails=new JMenuItem("Faculty Leave Details");
        facultyLeaveDetails.addActionListener(this);
        leaveDetails.add(facultyLeaveDetails);
        
        
        //examination
        
        JMenu exam=new JMenu("Examination");
        mb.add(exam);
        
        JMenuItem examinationResults=new JMenuItem("Examination Results");
        examinationResults.addActionListener(this);
        exam.add(examinationResults);
        
        JMenuItem marks=new JMenuItem("Enter Marks");
        marks.addActionListener(this);
        exam.add(marks);
        
        
        //updateDetails
        
        JMenu updateDetails=new JMenu("Update Information");
        mb.add(updateDetails);
        
        JMenuItem updateStudentDetails=new JMenuItem("Update Student");
        updateStudentDetails.addActionListener(this);
        updateDetails.add(updateStudentDetails);
        
        
        JMenuItem updateFacultyDetails=new JMenuItem("Update Faculty");
        updateFacultyDetails.addActionListener(this);
        updateDetails.add(updateFacultyDetails);
        
        
        //fee structure
        
        
        JMenu fee=new JMenu("Fee Details");
        mb.add(fee);
        
        JMenuItem feeStructure=new JMenuItem("Fee Structure");
        feeStructure.addActionListener(this);
        fee.add(feeStructure);
        
        
//        JMenuItem feeForm=new JMenuItem("Fee Form");
//        feeForm.addActionListener(this);
//        fee.add(feeForm);
//        
        
        //utility
        
        JMenu utility=new JMenu("Utility");
        mb.add(utility);
        
        JMenuItem notepad=new JMenuItem("Notepad");
        notepad.addActionListener(this);
        utility.add(notepad);
        
        
        JMenuItem calculator=new JMenuItem("Calculator");
        calculator.addActionListener(this);
        utility.add(calculator);
        
        
        //exit
         JMenu exit=new JMenu("Exit");
        mb.add(exit);
        
        JMenuItem ex=new JMenuItem("Exit");
        ex.addActionListener(this);
        exit.add(ex);
        
        
        
        
        
        
        JLabel heading=new JLabel("University Management System");
        heading.setBounds(100, 200, 700, 60);
        heading.setFont(new Font("serif",Font.ROMAN_BASELINE,50));
        image.add(heading);
        
        
        
        
        
        
        
        
  
       
        
        
        
        
        
        
        
        
        
        
       
        
        
        
        
        
        
        
        
        
        setTitle("University Management System");
        setLayout(null);
        setVisible(true);
        setSize(1280,800);
        setLocation(3,10);
        
        
    }
    
    
      @Override
    public void actionPerformed(ActionEvent ae) {
        
        String mg=ae.getActionCommand();
        
        
        
         if(mg.equals("Add Student"))
        {
           
            new AddStudent();
            
            
            
        }
        
          if(mg.equals("Add Faculty"))
        {
            
            new AddTeacher();
            
            
        }
        
        if(mg.equals("Exit"))
        {
            setVisible(false);
        }
        
         if (mg.equals("Calculator"))
        {
            try{
            Runtime.getRuntime().exec("calc.exe");
            }
            catch(Exception e)
            {
               System.out.println(e);
            }
        }
        
        
        if(mg.equals("Notepad"))
        {
             try{
            Runtime.getRuntime().exec("notepad.exe");
            }
            catch(Exception e)
            {
               System.out.println(e);
            }
        }
        
        
          
          if(mg.equals("Student Details"))
        {
            
            new StudentDetail();
            
            
        }
          
           if(mg.equals("Faculty Details"))
        {
            
            new TeacherDetail();
            
            
        }
           
           
            if(mg.equals("Student Leave"))
        {
            
            new StudentLeave();
            
            
        }
               
            if(mg.equals("Faculty Leave"))
        {
            
            new TeacherLeave();
            
            
        }
          if(mg.equals("Faculty Leave Details"))
        {
            
            new TeacherLeaveDetail();
            
            
        }
          
           if(mg.equals("Student Leave Details"))
        {
            
            new StudentLeaveDetail();
            
            
        }
           
            if(mg.equals("Update Faculty"))
        {
            
            new UpdateTeacher();
            
            
        }
            if(mg.equals("Update Student"))
        {
            
            new UpdateStudent();
            
            
        }
            
            
             if(mg.equals("Enter Marks"))
        {
            
            new EnterMarks();
            
            
        }
             
             if(mg.equals("Examination Results"))
        {
            
            new ExamResult();
            
            
        }
             
             
             
                 if(mg.equals("Fee Structure"))
        {
            
            new FeeStructure();
            
            
        }
           
 
           
 
          
          
        
        
        
        
            }
    
    
    public static void main(String args[])
    {
        new Project();
        
    }

  
}

package studentportal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.sql.*;
import java.io.File;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.graphics.image.LosslessFactory;

public class Semmarks extends JFrame implements ActionListener{
     JButton cancel,print;
     String roll,sem;
    Semmarks(String roll,String sem){
        this.roll=roll;
        this.sem=sem;
          setSize(700, 600);
        setLocation(500, 100);
        setLayout(null);
        
        getContentPane().setBackground(new Color(247, 247, 240));
        
        JLabel heading = new JLabel("Semister Results:");
        heading.setBounds(170, 10, 500, 25);
        heading.setFont(new Font("Tahoma", Font.BOLD, 20));
        add(heading);
        
        JLabel name = new JLabel();
        name.setBounds(60, 70, 300, 20);
        name.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(name);
        
        JLabel lblrollno = new JLabel("Roll Number:          "+ roll );
        lblrollno.setBounds(350, 70, 500, 20);
        lblrollno.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(lblrollno);
        
        JLabel branch = new JLabel("Branch:");
        branch.setBounds(60, 110, 300, 20);
        branch.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(branch);
        
        JLabel lblsemester = new JLabel("Semister:               "+sem);
        lblsemester.setBounds(350, 110, 500, 20);
        lblsemester.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(lblsemester);
        
        
        JLabel sub = new JLabel("Subjects");
        sub.setBounds(100, 160, 500, 20);
        sub.setFont(new Font("Tahoma", Font.BOLD, 18));
        add(sub);
        
        JLabel mark = new JLabel("Marks");
        mark.setBounds(250, 160, 500, 20);
        mark.setFont(new Font("Tahoma", Font.BOLD, 18));
        add(mark);
        
        JLabel grade = new JLabel("Grades");
        grade.setBounds(380, 160, 500, 20);
        grade.setFont(new Font("Tahoma", Font.BOLD, 18));
        add(grade);
        
        JLabel point = new JLabel("Points");
        point.setBounds(500, 160, 500, 20);
        point.setFont(new Font("Tahoma", Font.BOLD, 18));
        add(point);
        
        
        JLabel sub1 = new JLabel();
        sub1.setBounds(100, 200, 500, 20);
        sub1.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(sub1);
        
        JLabel sub2 = new JLabel();
        sub2.setBounds(100, 230, 500, 20);
        sub2.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(sub2);
        
        JLabel sub3 = new JLabel();
        sub3.setBounds(100, 260, 500, 20);
        sub3.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(sub3);
        
        JLabel sub4 = new JLabel();
        sub4.setBounds(100, 290, 500, 20);
        sub4.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(sub4);
        
        JLabel sub5 = new JLabel();
        sub5.setBounds(100, 320, 500, 20);
        sub5.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(sub5);
        
        JLabel sub6 = new JLabel();
        sub6.setBounds(100, 350, 500, 20);
        sub6.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(sub6);
        
        JLabel sub7 = new JLabel();
        sub7.setBounds(100, 380, 500, 20);
        sub7.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(sub7);
        
        JLabel sub8 = new JLabel();
        sub8.setBounds(100, 410, 500, 20);
        sub8.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(sub8);
        
        JLabel sub9 = new JLabel("SGPA:");
        sub9.setBounds(100, 440, 500, 20);
        sub9.setFont(new Font("Tahoma", Font.BOLD, 18));
        add(sub9);
        
        /*JLabel sub10 = new JLabel("CGPA");
        sub10.setBounds(100, 470, 500, 20);
        sub10.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(sub10);
        */
        
        
        try {
            Conn c1=new Conn();
            ResultSet rs = c1.s.executeQuery("select * from student where Roll_No = '"+roll+"'  ");
           while(rs.next())
           {
               name.setText("Name:  "+rs.getString("Name"));
               branch.setText("Branch:  "+rs.getString("Branch"));
           }
            
           if(sem=="1st Semester"){
                Conn c = new Conn();
            
            ResultSet rs1 = c.s.executeQuery("select * from sem where Roll_No = '"+roll+"' and Semister ='"+sem+"' ");
            while(rs1.next()) {
                sub1.setText(rs1.getString("sub1"));
                sub2.setText(rs1.getString("sub2"));
                sub3.setText(rs1.getString("sub3"));
                sub4.setText(rs1.getString("sub4"));
                sub5.setText(rs1.getString("sub5"));
                sub6.setText(rs1.getString("sub6"));
                sub7.setText(rs1.getString("lab1"));
                sub8.setText(rs1.getString("lab2"));
                
            }
            
            ResultSet rs2 = c.s.executeQuery("select * from semm where Roll_No = '"+roll+"' and Semister ='"+sem+"'  ");
            while(rs2.next()) {
                sub1.setText(sub1.getText() + "            " + rs2.getString("m1"));
                sub2.setText(sub2.getText() + "            " + rs2.getString("m2"));
                sub3.setText(sub3.getText() + "                " + rs2.getString("m3"));
                sub4.setText(sub4.getText() + "                 " + rs2.getString("m4"));
                sub5.setText(sub5.getText() + "                  " + rs2.getString("m5"));
                sub6.setText(sub6.getText() + "                  " + rs2.getString("m6"));
                sub7.setText(sub7.getText() + "      " + rs2.getString("mlab1"));
                sub8.setText(sub8.getText() + "      " + rs2.getString("mlab2"));
                
               // lblsemester.setText("Semester:              " + rs2.getString("Semister"));
            }
            
             ResultSet rs3 = c.s.executeQuery("select * from grades where Roll_No = '"+roll+"' and Semister ='"+sem+"'  ");
            while(rs3.next()) {
                sub1.setText(sub1.getText() + "                        "+ rs3.getString("g1"));
                sub2.setText(sub2.getText() + "                        " + rs3.getString("g2"));
                sub3.setText(sub3.getText() + "                        " + rs3.getString("g3"));
                sub4.setText(sub4.getText() + "                        " + rs3.getString("g4"));
                sub5.setText(sub5.getText() + "                        " + rs3.getString("g5"));
                sub6.setText(sub6.getText() + "                        " + rs3.getString("g6"));
                sub7.setText(sub7.getText() + "                        " + rs3.getString("g7"));
                sub8.setText(sub8.getText() + "                        " + rs3.getString("g8"));
                
               // lblsemester.setText("Semester:              " + rs2.getString("Semister"));
            }
            
             ResultSet rs4 = c.s.executeQuery("select * from points where Roll_No = '"+roll+"' and Semister ='"+sem+"'  ");
            while(rs4.next()) {
                sub1.setText(sub1.getText() + "               " + rs4.getString("p1"));
                sub2.setText(sub2.getText() + "               " + rs4.getString("p2"));
                sub3.setText(sub3.getText() + "                 " + rs4.getString("p3"));
                sub4.setText(sub4.getText() + "               " + rs4.getString("p4"));
                sub5.setText(sub5.getText() + "                 " + rs4.getString("p5"));
                sub6.setText(sub6.getText() + "               " + rs4.getString("p6"));
                sub7.setText(sub7.getText() + "                " + rs4.getString("p7"));
                sub8.setText(sub8.getText() + "                 " + rs4.getString("p8"));
                sub9.setText("SGPA                                                                "+rs4.getString("SGPA"));
              //  sub10.setText("CGPA                                  "+rs4.getString("CGPA"));
                
               // lblsemester.setText("Semester:              " + rs2.getString("Semister"));
            }
            
           }
           
           else if(sem=="2nd Semester"){
                Conn c = new Conn();
            
            ResultSet rs1 = c.s.executeQuery("select * from sem where Roll_No = '"+roll+"' and Semister ='"+sem+"' ");
            while(rs1.next()) {
                sub1.setText(rs1.getString("sub1"));
                sub2.setText(rs1.getString("sub2"));
                sub3.setText(rs1.getString("sub3"));
                sub4.setText(rs1.getString("sub4"));
                sub5.setText(rs1.getString("sub5"));
                sub6.setText(rs1.getString("sub6"));
                sub7.setText(rs1.getString("lab1"));
                sub8.setText(rs1.getString("lab2"));
                
            }
            
            ResultSet rs2 = c.s.executeQuery("select * from semm where Roll_No = '"+roll+"' and Semister ='"+sem+"'  ");
            while(rs2.next()) {
                sub1.setText(sub1.getText() + "            " + rs2.getString("m1"));
                sub2.setText(sub2.getText() + "                       " + rs2.getString("m2"));
                sub3.setText(sub3.getText() + "                        " + rs2.getString("m3"));
                sub4.setText(sub4.getText() + "                        " + rs2.getString("m4"));
                sub5.setText(sub5.getText() + "                            " + rs2.getString("m5"));
                sub6.setText(sub6.getText() + "                      " + rs2.getString("m6"));
                sub7.setText(sub7.getText() + "                " + rs2.getString("mlab1"));
                sub8.setText(sub8.getText() + "                  " + rs2.getString("mlab2"));
                
               // lblsemester.setText("Semester:              " + rs2.getString("Semister"));
            }
            
             ResultSet rs3 = c.s.executeQuery("select * from grades where Roll_No = '"+roll+"' and Semister ='"+sem+"'  ");
            while(rs3.next()) {
                sub1.setText(sub1.getText() + "              "+ rs3.getString("g1"));
                sub2.setText(sub2.getText() + "              " + rs3.getString("g2"));
                sub3.setText(sub3.getText() + "               " + rs3.getString("g3"));
                sub4.setText(sub4.getText() + "               " + rs3.getString("g4"));
                sub5.setText(sub5.getText() + "               " + rs3.getString("g5"));
                sub6.setText(sub6.getText() + "               " + rs3.getString("g6"));
                sub7.setText(sub7.getText() + "               " + rs3.getString("g7"));
                sub8.setText(sub8.getText() + "               " + rs3.getString("g8"));
                
               // lblsemester.setText("Semester:              " + rs2.getString("Semister"));
            }
            
             ResultSet rs4 = c.s.executeQuery("select * from points where Roll_No = '"+roll+"' and Semister ='"+sem+"'  ");
            while(rs4.next()) {
                sub1.setText(sub1.getText() + "                " + rs4.getString("p1"));
                sub2.setText(sub2.getText() + "                " + rs4.getString("p2"));
                sub3.setText(sub3.getText() + "                " + rs4.getString("p3"));
                sub4.setText(sub4.getText() + "                " + rs4.getString("p4"));
                sub5.setText(sub5.getText() + "                   " + rs4.getString("p5"));
                sub6.setText(sub6.getText() + "                 " + rs4.getString("p6"));
                sub7.setText(sub7.getText() + "                 " + rs4.getString("p7"));
                sub8.setText(sub8.getText() + "                 " + rs4.getString("p8"));
                sub9.setText("SGPA                                                            "+rs4.getString("SGPA"));
              //  sub10.setText("CGPA                                  "+rs4.getString("CGPA"));
                
               // lblsemester.setText("Semester:              " + rs2.getString("Semister"));
            }
           }
           
           else if(sem=="3rd Semester"){
                Conn c = new Conn();
            
            ResultSet rs1 = c.s.executeQuery("select * from sem where Roll_No = '"+roll+"' and Semister ='"+sem+"' ");
            while(rs1.next()) {
                sub1.setText(rs1.getString("sub1"));
                sub2.setText(rs1.getString("sub2"));
                sub3.setText(rs1.getString("sub3"));
                sub4.setText(rs1.getString("sub4"));
                sub5.setText(rs1.getString("sub5"));
                sub6.setText(rs1.getString("sub6"));
                sub7.setText(rs1.getString("lab1"));
                sub8.setText(rs1.getString("lab2"));
                
            }
            
            ResultSet rs2 = c.s.executeQuery("select * from semm where Roll_No = '"+roll+"' and Semister ='"+sem+"'  ");
            while(rs2.next()) {
                sub1.setText(sub1.getText() + "                       " + rs2.getString("m1"));
                sub2.setText(sub2.getText() + "                       " + rs2.getString("m2"));
                sub3.setText(sub3.getText() + "                        " + rs2.getString("m3"));
                sub4.setText(sub4.getText() + "                       " + rs2.getString("m4"));
                sub5.setText(sub5.getText() + "                         " + rs2.getString("m5"));
                sub6.setText(sub6.getText() + "               " + rs2.getString("m6"));
                sub7.setText(sub7.getText() + "                 " + rs2.getString("mlab1"));
                sub8.setText(sub8.getText() + "                   " + rs2.getString("mlab2"));
                
               // lblsemester.setText("Semester:              " + rs2.getString("Semister"));
            }
            
             ResultSet rs3 = c.s.executeQuery("select * from grades where Roll_No = '"+roll+"' and Semister ='"+sem+"'  ");
            while(rs3.next()) {
                sub1.setText(sub1.getText() + "                     "+ rs3.getString("g1"));
                sub2.setText(sub2.getText() + "                     " + rs3.getString("g2"));
                sub3.setText(sub3.getText() + "                     " + rs3.getString("g3"));
                sub4.setText(sub4.getText() + "                     " + rs3.getString("g4"));
                sub5.setText(sub5.getText() + "                     " + rs3.getString("g5"));
                sub6.setText(sub6.getText() + "                     " + rs3.getString("g6"));
                sub7.setText(sub7.getText() + "                     " + rs3.getString("g7"));
                sub8.setText(sub8.getText() + "                     " + rs3.getString("g8"));
                
               // lblsemester.setText("Semester:              " + rs2.getString("Semister"));
            }
            
             ResultSet rs4 = c.s.executeQuery("select * from points where Roll_No = '"+roll+"' and Semister ='"+sem+"'  ");
            while(rs4.next()) {
                sub1.setText(sub1.getText() + "                 " + rs4.getString("p1"));
                sub2.setText(sub2.getText() + "                 " + rs4.getString("p2"));
                sub3.setText(sub3.getText() + "                 " + rs4.getString("p3"));
                sub4.setText(sub4.getText() + "                 " + rs4.getString("p4"));
                sub5.setText(sub5.getText() + "                " + rs4.getString("p5"));
                sub6.setText(sub6.getText() + "                 " + rs4.getString("p6"));
                sub7.setText(sub7.getText() + "                 " + rs4.getString("p7"));
                sub8.setText(sub8.getText() + "                 " + rs4.getString("p8"));
               sub9.setText("SGPA                                                               "+rs4.getString("SGPA"));
              //  sub10.setText("CGPA                                  "+rs4.getString("CGPA"));
                
               // lblsemester.setText("Semester:              " + rs2.getString("Semister"));
            }
            
           }
           
           else if(sem=="4th Semester"){
                Conn c = new Conn();
            
            ResultSet rs1 = c.s.executeQuery("select * from sem where Roll_No = '"+roll+"' and Semister ='"+sem+"' ");
            while(rs1.next()) {
                sub1.setText(rs1.getString("sub1"));
                sub2.setText(rs1.getString("sub2"));
                sub3.setText(rs1.getString("sub3"));
                sub4.setText(rs1.getString("sub4"));
                sub5.setText(rs1.getString("sub5"));
                sub6.setText(rs1.getString("sub6"));
                sub7.setText(rs1.getString("lab1"));
                sub8.setText(rs1.getString("lab2"));
                
            }
            
            ResultSet rs2 = c.s.executeQuery("select * from semm where Roll_No = '"+roll+"' and Semister ='"+sem+"'  ");
            while(rs2.next()) {
                sub1.setText(sub1.getText() + "                          " + rs2.getString("m1"));
                sub2.setText(sub2.getText() + "                       " + rs2.getString("m2"));
                sub3.setText(sub3.getText() + "      " + rs2.getString("m3"));
                sub4.setText(sub4.getText() + "                       " + rs2.getString("m4"));
                sub5.setText(sub5.getText() + "                          " + rs2.getString("m5"));
                sub6.setText(sub6.getText() + "                         " + rs2.getString("m6"));
                sub7.setText(sub7.getText() + "                   " + rs2.getString("mlab1"));
                sub8.setText(sub8.getText() + "                 " + rs2.getString("mlab2"));
                
               // lblsemester.setText("Semester:              " + rs2.getString("Semister"));
            }
            
             ResultSet rs3 = c.s.executeQuery("select * from grades where Roll_No = '"+roll+"' and Semister ='"+sem+"'  ");
            while(rs3.next()) {
                sub1.setText(sub1.getText() + "                 "+ rs3.getString("g1"));
                sub2.setText(sub2.getText() + "                 " + rs3.getString("g2"));
                sub3.setText(sub3.getText() + "                 " + rs3.getString("g3"));
                sub4.setText(sub4.getText() + "                 " + rs3.getString("g4"));
                sub5.setText(sub5.getText() + "                " + rs3.getString("g5"));
                sub6.setText(sub6.getText() + "                 " + rs3.getString("g6"));
                sub7.setText(sub7.getText() + "                 " + rs3.getString("g7"));
                sub8.setText(sub8.getText() + "                 " + rs3.getString("g8"));
                
               // lblsemester.setText("Semester:              " + rs2.getString("Semister"));
            }
            
             ResultSet rs4 = c.s.executeQuery("select * from points where Roll_No = '"+roll+"' and Semister ='"+sem+"'  ");
            while(rs4.next()) {
                sub1.setText(sub1.getText() + "                " + rs4.getString("p1"));
                sub2.setText(sub2.getText() + "                " + rs4.getString("p2"));
                sub3.setText(sub3.getText() + "                " + rs4.getString("p3"));
                sub4.setText(sub4.getText() + "                  " + rs4.getString("p4"));
                sub5.setText(sub5.getText() + "                " + rs4.getString("p5"));
                sub6.setText(sub6.getText() + "                  " + rs4.getString("p6"));
                sub7.setText(sub7.getText() + "                " + rs4.getString("p7"));
                sub8.setText(sub8.getText() + "                " + rs4.getString("p8"));
                sub9.setText("SGPA                                                             "+rs4.getString("SGPA"));
              //  sub10.setText("CGPA                                  "+rs4.getString("CGPA"));
                
               // lblsemester.setText("Semester:              " + rs2.getString("Semister"));
            }
            
           }
           
           else if(sem=="5th Semester"){
                Conn c = new Conn();
            
            ResultSet rs1 = c.s.executeQuery("select * from sem where Roll_No = '"+roll+"' and Semister ='"+sem+"' ");
            while(rs1.next()) {
                sub1.setText(rs1.getString("sub1"));
                sub2.setText(rs1.getString("sub2"));
                sub3.setText(rs1.getString("sub3"));
                sub4.setText(rs1.getString("sub4"));
                sub5.setText(rs1.getString("sub5"));
                sub6.setText(rs1.getString("sub6"));
                sub7.setText(rs1.getString("lab1"));
                sub8.setText(rs1.getString("lab2"));
                
            }
            
            ResultSet rs2 = c.s.executeQuery("select * from semm where Roll_No = '"+roll+"' and Semister ='"+sem+"'  ");
            while(rs2.next()) {
                sub1.setText(sub1.getText() + "                       " + rs2.getString("m1"));
                sub2.setText(sub2.getText() + "                       " + rs2.getString("m2"));
                sub3.setText(sub3.getText() + "                       " + rs2.getString("m3"));
                sub4.setText(sub4.getText() + "                        " + rs2.getString("m4"));
                sub5.setText(sub5.getText() + "                          " + rs2.getString("m5"));
                sub6.setText(sub6.getText() + "                        " + rs2.getString("m6"));
                sub7.setText(sub7.getText() + "                 " + rs2.getString("mlab1"));
                sub8.setText(sub8.getText() + "                    " + rs2.getString("mlab2"));
                
               // lblsemester.setText("Semester:              " + rs2.getString("Semister"));
            }
            
             ResultSet rs3 = c.s.executeQuery("select * from grades where Roll_No = '"+roll+"' and Semister ='"+sem+"'  ");
            while(rs3.next()) {
                sub1.setText(sub1.getText() + "                  "+ rs3.getString("g1"));
                sub2.setText(sub2.getText() + "                  " + rs3.getString("g2"));
                sub3.setText(sub3.getText() + "                  " + rs3.getString("g3"));
                sub4.setText(sub4.getText() + "                  " + rs3.getString("g4"));
                sub5.setText(sub5.getText() + "                  " + rs3.getString("g5"));
                sub6.setText(sub6.getText() + "                  " + rs3.getString("g6"));
                sub7.setText(sub7.getText() + "                  " + rs3.getString("g7"));
                sub8.setText(sub8.getText() + "                  " + rs3.getString("g8"));
                
               // lblsemester.setText("Semester:              " + rs2.getString("Semister"));
            }
            
             ResultSet rs4 = c.s.executeQuery("select * from points where Roll_No = '"+roll+"' and Semister ='"+sem+"'  ");
            while(rs4.next()) {
                sub1.setText(sub1.getText() + "                   " + rs4.getString("p1"));
                sub2.setText(sub2.getText() + "                  " + rs4.getString("p2"));
                sub3.setText(sub3.getText() + "                  " + rs4.getString("p3"));
                sub4.setText(sub4.getText() + "                    " + rs4.getString("p4"));
                sub5.setText(sub5.getText() + "                    " + rs4.getString("p5"));
                sub6.setText(sub6.getText() + "                  " + rs4.getString("p6"));
                sub7.setText(sub7.getText() + "                  " + rs4.getString("p7"));
                sub8.setText(sub8.getText() + "                    " + rs4.getString("p8"));
                sub9.setText("SGPA                                                              "+rs4.getString("SGPA"));
              //  sub10.setText("CGPA                                  "+rs4.getString("CGPA"));
                
               // lblsemester.setText("Semester:              " + rs2.getString("Semister"));
            }
            
           }
           
           else if(sem=="6th Semester"){
                Conn c = new Conn();
            
            ResultSet rs1 = c.s.executeQuery("select * from sem where Roll_No = '"+roll+"' and Semister ='"+sem+"' ");
            while(rs1.next()) {
                sub1.setText(rs1.getString("sub1"));
                sub2.setText(rs1.getString("sub2"));
                sub3.setText(rs1.getString("sub3"));
                sub4.setText(rs1.getString("sub4"));
                sub5.setText(rs1.getString("sub5"));
                sub6.setText(rs1.getString("sub6"));
                sub7.setText(rs1.getString("lab1"));
                sub8.setText(rs1.getString("lab2"));
                
            }
            
            ResultSet rs2 = c.s.executeQuery("select * from semm where Roll_No = '"+roll+"' and Semister ='"+sem+"'  ");
            while(rs2.next()) {
                sub1.setText(sub1.getText() + "                          " + rs2.getString("m1"));
                sub2.setText(sub2.getText() + "                       " + rs2.getString("m2"));
                sub3.setText(sub3.getText() + "         " + rs2.getString("m3"));
                sub4.setText(sub4.getText() + "         " + rs2.getString("m4"));
                sub5.setText(sub5.getText() + "        " + rs2.getString("m5"));
                sub6.setText(sub6.getText() + "          " + rs2.getString("m6"));
                sub7.setText(sub7.getText() + "                        " + rs2.getString("mlab1"));
                sub8.setText(sub8.getText() + "                       " + rs2.getString("mlab2"));
                
               // lblsemester.setText("Semester:              " + rs2.getString("Semister"));
            }
             ResultSet rs3 = c.s.executeQuery("select * from grades where Roll_No = '"+roll+"' and Semister ='"+sem+"'  ");
            while(rs3.next()) {
                sub1.setText(sub1.getText() + "                "+ rs3.getString("g1"));
                sub2.setText(sub2.getText() + "                " + rs3.getString("g2"));
                sub3.setText(sub3.getText() + "                " + rs3.getString("g3"));
                sub4.setText(sub4.getText() + "                " + rs3.getString("g4"));
                sub5.setText(sub5.getText() + "                " + rs3.getString("g5"));
                sub6.setText(sub6.getText() + "                " + rs3.getString("g6"));
                sub7.setText(sub7.getText() + "                " + rs3.getString("g7"));
                sub8.setText(sub8.getText() + "                " + rs3.getString("g8"));
                
               // lblsemester.setText("Semester:              " + rs2.getString("Semister"));
            }
            
             ResultSet rs4 = c.s.executeQuery("select * from points where Roll_No = '"+roll+"' and Semister ='"+sem+"'  ");
            while(rs4.next()) {
                sub1.setText(sub1.getText() + "                 " + rs4.getString("p1"));
                sub2.setText(sub2.getText() + "                 " + rs4.getString("p2"));
                sub3.setText(sub3.getText() + "                " + rs4.getString("p3"));
                sub4.setText(sub4.getText() + "                " + rs4.getString("p4"));
                sub5.setText(sub5.getText() + "                " + rs4.getString("p5"));
                sub6.setText(sub6.getText() + "                " + rs4.getString("p6"));
                sub7.setText(sub7.getText() + "                 " + rs4.getString("p7"));
                sub8.setText(sub8.getText() + "                " + rs4.getString("p8"));
                sub9.setText("SGPA                                                           "+rs4.getString("SGPA"));
              //  sub10.setText("CGPA                                  "+rs4.getString("CGPA"));
                
               // lblsemester.setText("Semester:              " + rs2.getString("Semister"));
            }
            
           }
           
           else if(sem=="7th Semester"){
                Conn c = new Conn();
            
            ResultSet rs1 = c.s.executeQuery("select * from sem where Roll_No = '"+roll+"' and Semister ='"+sem+"' ");
            while(rs1.next()) {
                sub1.setText(rs1.getString("sub1"));
                sub2.setText(rs1.getString("sub2"));
                sub3.setText(rs1.getString("sub3"));
                sub4.setText(rs1.getString("sub4"));
                sub5.setText(rs1.getString("sub5"));
                sub6.setText(rs1.getString("sub6"));
                sub7.setText(rs1.getString("lab1"));
                sub8.setText(rs1.getString("lab2"));
                
            }
            
            ResultSet rs2 = c.s.executeQuery("select * from semm where Roll_No = '"+roll+"' and Semister ='"+sem+"'  ");
            while(rs2.next()) {
                sub1.setText(sub1.getText() + "                          " + rs2.getString("m1"));
                sub2.setText(sub2.getText() + "                          " + rs2.getString("m2"));
                sub3.setText(sub3.getText() + "                          " + rs2.getString("m3"));
                sub4.setText(sub4.getText() + "                    " + rs2.getString("m4"));
                sub5.setText(sub5.getText() + "    " + rs2.getString("m5"));
                sub6.setText(sub6.getText() + "     " + rs2.getString("m6"));
                sub7.setText(sub7.getText() + "                   " + rs2.getString("mlab1"));
                sub8.setText(sub8.getText() + "                     " + rs2.getString("mlab2"));
                
               // lblsemester.setText("Semester:              " + rs2.getString("Semister"));
            }
            
             ResultSet rs3 = c.s.executeQuery("select * from grades where Roll_No = '"+roll+"' and Semister ='"+sem+"'  ");
            while(rs3.next()) {
                sub1.setText(sub1.getText() + "                "+ rs3.getString("g1"));
                sub2.setText(sub2.getText() + "                " + rs3.getString("g2"));
                sub3.setText(sub3.getText() + "                " + rs3.getString("g3"));
                sub4.setText(sub4.getText() + "                " + rs3.getString("g4"));
                sub5.setText(sub5.getText() + "                " + rs3.getString("g5"));
                sub6.setText(sub6.getText() + "                " + rs3.getString("g6"));
                sub7.setText(sub7.getText() + "                " + rs3.getString("g7"));
                sub8.setText(sub8.getText() + "                " + rs3.getString("g8"));
                
               // lblsemester.setText("Semester:              " + rs2.getString("Semister"));
            }
            
             ResultSet rs4 = c.s.executeQuery("select * from points where Roll_No = '"+roll+"' and Semister ='"+sem+"'  ");
            while(rs4.next()) {
                sub1.setText(sub1.getText() + "                  " + rs4.getString("p1"));
                sub2.setText(sub2.getText() + "                  " + rs4.getString("p2"));
                sub3.setText(sub3.getText() + "                  " + rs4.getString("p3"));
                sub4.setText(sub4.getText() + "                  " + rs4.getString("p4"));
                sub5.setText(sub5.getText() + "                  " + rs4.getString("p5"));
                sub6.setText(sub6.getText() + "                  " + rs4.getString("p6"));
                sub7.setText(sub7.getText() + "                  " + rs4.getString("p7"));
                sub8.setText(sub8.getText() + "                  " + rs4.getString("p8"));
                sub9.setText("SGPA                                                              "+rs4.getString("SGPA"));
              //  sub10.setText("CGPA                                  "+rs4.getString("CGPA"));
                
               // lblsemester.setText("Semester:              " + rs2.getString("Semister"));
            }
            
           }
           
           else if(sem=="8th Semester"){
                Conn c = new Conn();
            
            ResultSet rs1 = c.s.executeQuery("select * from midones where Roll_No = '"+roll+"' and Semister ='"+sem+"' ");
            while(rs1.next()) {
                sub1.setText(rs1.getString("sub1"));
              /*  sub2.setText(rs1.getString("sub2"));
                sub3.setText(rs1.getString("sub3"));
                sub4.setText(rs1.getString("sub4"));
                sub5.setText(rs1.getString("sub5"));
                sub6.setText(rs1.getString("sub6"));
                sub7.setText(rs1.getString("lab1"));
                sub8.setText(rs1.getString("lab2"));
                */
            }
            
            ResultSet rs2 = c.s.executeQuery("select * from midonem where Roll_No = '"+roll+"' and Semister ='"+sem+"'  ");
            while(rs2.next()) {
                sub1.setText(sub1.getText() + "                  " + rs2.getString("m1"));
                 sub9.setText("SGPA               "+rs2.getString("m1"));
              /*  sub2.setText(sub2.getText() + "                       " + rs2.getString("m2"));
                sub3.setText(sub3.getText() + "                        " + rs2.getString("m3"));
                sub4.setText(sub4.getText() + "                        " + rs2.getString("m4"));
                sub5.setText(sub5.getText() + "                            " + rs2.getString("m5"));
                sub6.setText(sub6.getText() + "                      " + rs2.getString("m6"));
                sub7.setText(sub7.getText() + "                " + rs2.getString("mlab1"));
                sub8.setText(sub8.getText() + "               " + rs2.getString("mlab2"));
               */ 
               // lblsemester.setText("Semester:              " + rs2.getString("Semister"));
            }
             ResultSet rs3 = c.s.executeQuery("select * from grades where Roll_No = '"+roll+"' and Semister ='"+sem+"'  ");
            while(rs3.next()) {
                sub1.setText(sub1.getText() + "            "+ rs3.getString("g1"));
                sub2.setText(sub2.getText() + "            " + rs3.getString("g2"));
                sub3.setText(sub3.getText() + "                " + rs3.getString("g3"));
                sub4.setText(sub4.getText() + "                 " + rs3.getString("g4"));
                sub5.setText(sub5.getText() + "                  " + rs3.getString("g5"));
                sub6.setText(sub6.getText() + "                  " + rs3.getString("g6"));
                sub7.setText(sub7.getText() + "      " + rs3.getString("g7"));
                sub8.setText(sub8.getText() + "      " + rs3.getString("g8"));
                
               // lblsemester.setText("Semester:              " + rs2.getString("Semister"));
            }
            
             ResultSet rs4 = c.s.executeQuery("select * from points where Roll_No = '"+roll+"' and Semister ='"+sem+"'  ");
            while(rs4.next()) {
                sub1.setText(sub1.getText() + "            " + rs4.getString("p1"));
                sub2.setText(sub2.getText() + "            " + rs4.getString("p2"));
                sub3.setText(sub3.getText() + "                " + rs4.getString("p3"));
                sub4.setText(sub4.getText() + "                 " + rs4.getString("p4"));
                sub5.setText(sub5.getText() + "                  " + rs4.getString("p5"));
                sub6.setText(sub6.getText() + "                  " + rs4.getString("p6"));
                sub7.setText(sub7.getText() + "      " + rs4.getString("p7"));
                sub8.setText(sub8.getText() + "      " + rs4.getString("p8"));
                sub9.setText("SGPA                                   "+rs4.getString("SGPA"));
              //  sub10.setText("CGPA                                  "+rs4.getString("CGPA"));
                
               // lblsemester.setText("Semester:              " + rs2.getString("Semister"));
            }
           }
           
        } catch (Exception e) {
            e.printStackTrace();
        }
      
        
        print = new JButton("Print");
        print.setBounds(150, 500, 120, 25);
        print.setBackground(Color.BLACK);
        print.setForeground(Color.WHITE);
        print.addActionListener(this);
        print.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(print);
        
        cancel = new JButton("Back");
        cancel.setBounds(350, 500, 120, 25);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        cancel.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(cancel);
        
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==print){
             BufferedImage image = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_RGB);
            Graphics2D g2d = image.createGraphics();
            paint(g2d);
            g2d.dispose();
            
            int newWidth = 500;  
            int newHeight = 600;  
            BufferedImage resizedImage = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_RGB);
            Graphics2D g = resizedImage.createGraphics();
            g.drawImage(image, 0,0, newWidth, newHeight, null);
            g.dispose();
            
             String desktopPath = System.getProperty("user.home") + File.separator ;
             String fileName = JOptionPane.showInputDialog(null, "Enter the file name for the PDF with .pdf:", "Save PDF", JOptionPane.PLAIN_MESSAGE);
      
            String pdfPath =desktopPath + fileName;
            // String pdfPath = desktopPath + fileName + ".pdf";
            
            
             PDDocument document = new PDDocument();
             PDPage page = new PDPage(PDRectangle.A4);
             document.addPage(page);
                  
            try{
           
            PDPageContentStream contentStream = new PDPageContentStream(document, page);
            contentStream.drawImage(LosslessFactory.createFromImage(document, resizedImage), 50, 200, resizedImage.getWidth(), resizedImage.getHeight());
            contentStream.close();

            document.save(pdfPath);
            document.close();
            System.out.println("PDF created successfully using PDFBox: " + pdfPath);
            }
            catch(Exception e){
                System.out.println(e);
            }
            
        }
        else if(ae.getSource()==cancel){
            setVisible(false);
            new Soptions().setVisible(true);
        }
    }
        
    
    
    public static void main(String args[]) {
        new Semmarks("","");
    }
    
}

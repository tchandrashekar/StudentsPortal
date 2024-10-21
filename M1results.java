package studentportal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class M1results extends JFrame implements ActionListener{
     JButton cancel;
     String roll;
     String sem;
    M1results(String roll,String sem){
        this.roll=roll;
        this.sem=sem;
          setSize(500, 600);
        setLocation(500, 100);
        setLayout(null);
        
        getContentPane().setBackground(new Color(247, 247, 240));
        
        JLabel heading = new JLabel("MID-1 Results:");
        heading.setBounds(170, 10, 500, 25);
        heading.setFont(new Font("Tahoma", Font.BOLD, 20));
        add(heading);
        
        JLabel lblrollno = new JLabel("Roll Number:          "+ roll );
        lblrollno.setBounds(60, 70, 500, 20);
        lblrollno.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(lblrollno);
        
        JLabel lblsemester = new JLabel("Semister:               "+sem);
        lblsemester.setBounds(60, 110, 500, 20);
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
        
        
        
        try {
           if(sem=="1st Semester"){
                Conn c = new Conn();
            
            ResultSet rs1 = c.s.executeQuery("select * from midones where Roll_No = '"+roll+"' and Semister ='"+sem+"' ");
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
            
            ResultSet rs2 = c.s.executeQuery("select * from midonem where Roll_No = '"+roll+"' and Semister ='"+sem+"'  ");
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
           }
           
           else if(sem=="2nd Semester"){
                Conn c = new Conn();
            
            ResultSet rs1 = c.s.executeQuery("select * from midones where Roll_No = '"+roll+"' and Semister ='"+sem+"' ");
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
            
            ResultSet rs2 = c.s.executeQuery("select * from midonem where Roll_No = '"+roll+"' and Semister ='"+sem+"'  ");
            while(rs2.next()) {
                sub1.setText(sub1.getText() + "            " + rs2.getString("m1"));
                sub2.setText(sub2.getText() + "                       " + rs2.getString("m2"));
                sub3.setText(sub3.getText() + "                        " + rs2.getString("m3"));
                sub4.setText(sub4.getText() + "                        " + rs2.getString("m4"));
                sub5.setText(sub5.getText() + "                            " + rs2.getString("m5"));
                sub6.setText(sub6.getText() + "                      " + rs2.getString("m6"));
                sub7.setText(sub7.getText() + "                " + rs2.getString("mlab1"));
                sub8.setText(sub8.getText() + "               " + rs2.getString("mlab2"));
                
               // lblsemester.setText("Semester:              " + rs2.getString("Semister"));
            }
           }
           
           else if(sem=="3rd Semester"){
                Conn c = new Conn();
            
            ResultSet rs1 = c.s.executeQuery("select * from midones where Roll_No = '"+roll+"' and Semister ='"+sem+"' ");
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
            
            ResultSet rs2 = c.s.executeQuery("select * from midonem where Roll_No = '"+roll+"' and Semister ='"+sem+"'  ");
            while(rs2.next()) {
                sub1.setText(sub1.getText() + "                       " + rs2.getString("m1"));
                sub2.setText(sub2.getText() + "                       " + rs2.getString("m2"));
                sub3.setText(sub3.getText() + "                        " + rs2.getString("m3"));
                sub4.setText(sub4.getText() + "                       " + rs2.getString("m4"));
                sub5.setText(sub5.getText() + "                         " + rs2.getString("m5"));
                sub6.setText(sub6.getText() + "               " + rs2.getString("m6"));
                sub7.setText(sub7.getText() + "                      " + rs2.getString("mlab1"));
                sub8.setText(sub8.getText() + "                 " + rs2.getString("mlab2"));
                
               // lblsemester.setText("Semester:              " + rs2.getString("Semister"));
            }
           }
           
           else if(sem=="4th Semester"){
                Conn c = new Conn();
            
            ResultSet rs1 = c.s.executeQuery("select * from midones where Roll_No = '"+roll+"' and Semister ='"+sem+"' ");
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
            
            ResultSet rs2 = c.s.executeQuery("select * from midonem where Roll_No = '"+roll+"' and Semister ='"+sem+"'  ");
            while(rs2.next()) {
                sub1.setText(sub1.getText() + "                          " + rs2.getString("m1"));
                sub2.setText(sub2.getText() + "                       " + rs2.getString("m2"));
                sub3.setText(sub3.getText() + "      " + rs2.getString("m3"));
                sub4.setText(sub4.getText() + "                       " + rs2.getString("m4"));
                sub5.setText(sub5.getText() + "                         " + rs2.getString("m5"));
                sub6.setText(sub6.getText() + "                         " + rs2.getString("m6"));
                sub7.setText(sub7.getText() + "                   " + rs2.getString("mlab1"));
                sub8.setText(sub8.getText() + "                 " + rs2.getString("mlab2"));
                
               // lblsemester.setText("Semester:              " + rs2.getString("Semister"));
            }
           }
           
           else if(sem=="5th Semester"){
                Conn c = new Conn();
            
            ResultSet rs1 = c.s.executeQuery("select * from midones where Roll_No = '"+roll+"' and Semister ='"+sem+"' ");
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
            
            ResultSet rs2 = c.s.executeQuery("select * from midonem where Roll_No = '"+roll+"' and Semister ='"+sem+"'  ");
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
           }
           
           else if(sem=="6th Semester"){
                Conn c = new Conn();
            
            ResultSet rs1 = c.s.executeQuery("select * from midones where Roll_No = '"+roll+"' and Semister ='"+sem+"' ");
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
            
            ResultSet rs2 = c.s.executeQuery("select * from midonem where Roll_No = '"+roll+"' and Semister ='"+sem+"'  ");
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
           }
           
           else if(sem=="7th Semester"){
                Conn c = new Conn();
            
            ResultSet rs1 = c.s.executeQuery("select * from midones where Roll_No = '"+roll+"' and Semister ='"+sem+"' ");
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
            
            ResultSet rs2 = c.s.executeQuery("select * from midonem where Roll_No = '"+roll+"' and Semister ='"+sem+"'  ");
            while(rs2.next()) {
                sub1.setText(sub1.getText() + "                          " + rs2.getString("m1"));
                sub2.setText(sub2.getText() + "   " + rs2.getString("m2"));
                sub3.setText(sub3.getText() + "                           " + rs2.getString("m3"));
                sub4.setText(sub4.getText() + "                     " + rs2.getString("m4"));
                sub5.setText(sub5.getText() + "    " + rs2.getString("m5"));
                sub6.setText(sub6.getText() + "     " + rs2.getString("m6"));
                sub7.setText(sub7.getText() + "                   " + rs2.getString("mlab1"));
                sub8.setText(sub8.getText() + "                     " + rs2.getString("mlab2"));
                
               // lblsemester.setText("Semester:              " + rs2.getString("Semister"));
            }
           }
           
           else if(sem=="8th Semester"){
                Conn c = new Conn();
            
            ResultSet rs1 = c.s.executeQuery("select * from midones where Roll_No = '"+roll+"' and Semister ='"+sem+"' ");
            while(rs1.next()) {
                sub1.setText(rs1.getString("sub1"));
                
                
            }
            
            ResultSet rs2 = c.s.executeQuery("select * from midonem where Roll_No = '"+roll+"' and Semister ='"+sem+"'  ");
            while(rs2.next()) {
                sub1.setText(sub1.getText() + "                " + rs2.getString("m1"));
               
                
               // lblsemester.setText("Semester:              " + rs2.getString("Semister"));
            }
           }
           
        } catch (Exception e) {
            e.printStackTrace();
        }
      
        cancel = new JButton("Back");
        cancel.setBounds(250, 500, 120, 25);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        cancel.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(cancel);
        
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Soptions().setVisible(true);
    }
        
    
    
    public static void main(String args[]){
        new M1results("","");
    }
    
}

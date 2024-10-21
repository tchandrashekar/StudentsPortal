package studentportal;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.sql.ResultSet;
import javax.swing.*;


public class Soptions extends JFrame implements ActionListener{
    JButton astudent,amarks1,amarks2,amarks3,amarks4,amarks5,amarks;
    JTextField Roll;
    JComboBox cbsemester;
    Soptions(){
        
         setLayout(null);
        
        JLabel text=new JLabel("Student Options");
        text.setFont(new Font("Osward",Font.BOLD ,30));
        text.setBounds(150,30,400,40);
        add(text);
        
        JLabel roll=new JLabel("RollNo: ");
       roll.setFont(new Font("Raleway",Font.BOLD,17));
        roll.setBounds(100,80,400,40);
        add(roll);
        
        Roll =new JTextField();
        Roll.setBounds(250,90,150,20);
        add(Roll);
        
        JLabel lblsemester = new JLabel("Semester");
        lblsemester.setFont(new Font("Raleway",Font.BOLD,17));
        lblsemester.setBounds(100, 110, 150, 30);
        add(lblsemester);
        
        String semester[] = {"1st Semester", "2nd Semester", "3rd Semester", "4th Semester", "5th Semester", "6th Semester", "7th Semester", "8th Semester" };
        cbsemester = new JComboBox(semester);
        cbsemester.setBounds(250, 115, 150, 20);
        cbsemester.setBackground(Color.WHITE);
        add(cbsemester);
        
       astudent =new JButton("Mid-1 Results");
        astudent.setBounds(100,150,150,50);
        astudent.setBackground(new Color(192, 248, 252)); 
        astudent.addActionListener(this);
        add(astudent);
        
        amarks1 =new JButton("Mid-2 Results");
        amarks1.setBounds(300,150,150,50);
        amarks1.setBackground(new Color(192, 248, 252)); 
        amarks1.addActionListener(this);
        add(amarks1);
        
        amarks2 =new JButton("Semister Results");
        amarks2.setBounds(100,250,150,50);
        amarks2.setBackground(new Color(192, 248, 252));
        amarks2.addActionListener(this);
        add(amarks2);
        
         amarks3 =new JButton("Attendance");
        amarks3.setBounds(300,250,150,50);
        amarks3.setBackground(new Color(192, 248, 252));
        amarks3.addActionListener(this);      
        add(amarks3);
        
        
         amarks4 =new JButton("Fee Payment");
        amarks4.setBounds(100,350,150,50);
        amarks4.setBackground(new Color(192, 248, 252));
        amarks4.addActionListener(this);      
        add(amarks4);
        
         amarks5 =new JButton("Hall Ticket");
        amarks5.setBounds(300,350,150,50);
        amarks5.setBackground(new Color(192, 248, 252));
        amarks5.addActionListener(this);      
        add(amarks5);
        
         amarks =new JButton("Consoldate Results");   
        amarks.setBounds(180,450,200,50);
        amarks.setBackground(new Color(192, 248, 252));
        amarks.addActionListener(this);
        add(amarks);
        
        
        
        getContentPane().setBackground(new Color(247, 247, 240));
        setSize(600,600);
        setLocation(400,150);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
    
     public void actionPerformed(ActionEvent ae){
      String roll=Roll.getText();
      String sem=(String)cbsemester.getSelectedItem();
     
       if(ae.getSource()== astudent){
            setVisible(false);
            new M1results(roll,sem).setVisible(true);  
       }
       else if(ae.getSource()==amarks1){
           setVisible(false);
           new M2results(roll,sem).setVisible(true);
       }
       else if(ae.getSource()==amarks2){
           setVisible(false);
           new Semmarks(roll,sem).setVisible(true);
       }
       else if(ae.getSource()==amarks3){
           StringBuilder data = new StringBuilder();
           try{
                 Conn c = new Conn();
           
                ResultSet rs = c.s.executeQuery("select * from attendance where Roll_No = '"+roll+"' and Semister ='"+sem+"'  ");
               
                while (rs.next()) {
                data.append("Your Attendance is : ").append(rs.getString("attendance")).append("%")
                    .append("\n");
            }
                  JOptionPane.showMessageDialog(null, data.toString(), "Attendance", JOptionPane.PLAIN_MESSAGE);
              
                
           }
           catch(Exception e){
               System.out.println(e);
           }
       }
        else if(ae.getSource()==amarks4){
           setVisible(false);
           new Feepayment(roll,sem).setVisible(true);
       }
        else if(ae.getSource()==amarks5){
           setVisible(false);
           new Hallticket(roll,sem).setVisible(true);
       }

       else if(ae.getSource()==amarks){
           setVisible(false);
           new Consoldatememo(roll).setVisible(true);
       }
     }
    
    public static void main(String args[]){
        new Soptions();
    }
    
}


package studentportal;

import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Examdates extends JFrame implements ActionListener{
    
    JComboBox cbsemester;
    JTextField f1,f2,f3,f4,f5,f6,f7,f8;
    JDateChooser date1,date2,date3,date4,date5,date6,date7,date8;
    JButton save,back;
    
    Examdates(){
        setLayout(null);
        
        JLabel text1=new JLabel("Exam Dates");
        text1.setFont(new Font("Raleway",Font.BOLD,20));
        text1.setBounds(230,30,150,30);
        add(text1);
        
         JLabel lblsemester = new JLabel("Semester");
        lblsemester.setFont(new Font("Raleway",Font.BOLD,17));
        lblsemester.setBounds(100, 70, 150, 30);
        add(lblsemester);
        
        String semester[] = {"1st Semester", "2nd Semester", "3rd Semester", "4th Semester", "5th Semester", "6th Semester", "7th Semester", "8th Semester" };
        cbsemester = new JComboBox(semester);
        cbsemester.setBounds(250, 75, 150, 20);
        cbsemester.setBackground(Color.WHITE);
        add(cbsemester);
        
        JLabel text2 = new JLabel("Subjects");
        text2.setFont(new Font("Raleway",Font.BOLD,17));
        text2.setBounds(100, 130, 150, 30);
        add(text2);
        
        JLabel text3 = new JLabel("Dates");
        text3.setFont(new Font("Raleway",Font.BOLD,17));
        text3.setBounds(350, 130, 150, 30);
        add(text3);
        
         f1=new JTextField();
        f1.setFont(new Font("Raleway",Font.PLAIN,17));
        f1.setBounds(100,170,200,25);
        add(f1);
        
        date1=new JDateChooser();
        date1.setBounds(300,170,200,25);
        add(date1);
        
         f2=new JTextField();
        f2.setFont(new Font("Raleway",Font.PLAIN,17));
        f2.setBounds(100,200,200,25);
        add(f2);
         date2=new JDateChooser();
        date2.setBounds(300,200,200,25);
        add(date2);
        
         f3=new JTextField();
        f3.setFont(new Font("Raleway",Font.PLAIN,17));
        f3.setBounds(100,230,200,25);
        add(f3);
        
         date3=new JDateChooser();
        date3.setBounds(300,230,200,25);
        add(date3);
        
         f4=new JTextField();
        f4.setFont(new Font("Raleway",Font.PLAIN,17));
        f4.setBounds(100,260,200,25);
        add(f4);
        
         date4=new JDateChooser();
        date4.setBounds(300,260,200,25);
        add(date4);
        
        
        
         f5=new JTextField();
        f5.setFont(new Font("Raleway",Font.PLAIN,17));
        f5.setBounds(100,290,200,25);
        add(f5);
        
         date5=new JDateChooser();
        date5.setBounds(300,290,200,25);
        add(date5);
        
         f6=new JTextField();
        f6.setFont(new Font("Raleway",Font.PLAIN,17));
        f6.setBounds(100,320,200,25);
        add(f6);
        
         date6=new JDateChooser();
        date6.setBounds(300,320,200,25);
        add(date6);
        
         f7=new JTextField();
        f7.setFont(new Font("Raleway",Font.PLAIN,17));
        f7.setBounds(100,350,200,25);
        add(f7);
        
         date7=new JDateChooser();
        date7.setBounds(300,350,200,25);
        add(date7);
        
         f8=new JTextField();
        f8.setFont(new Font("Raleway",Font.PLAIN,17));
        f8.setBounds(100,380,200,25);
        add(f8);
        
         date8=new JDateChooser();
        date8.setBounds(300,380,200,25);
        add(date8);
        
        save = new JButton("Save");
        save.setBounds(130, 480, 150, 25);
        save.setBackground(Color.BLACK);
        save.setForeground(Color.WHITE);
        save.addActionListener(this);
        save.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(save);
        
        back = new JButton("Back");
        back.setBounds(320, 480, 150, 25);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        back.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(back);
        
        getContentPane().setBackground(new Color(247, 247, 240));
        setSize(600,600);
        setLocation(400,150);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
     public void actionPerformed(ActionEvent ae){
       if(ae.getSource()==save){
            
            String sem=(String)cbsemester.getSelectedItem();
            String s1=(String)f1.getText();
            String s2=(String)f2.getText();
            String s3=(String)f3.getText();
            String s4=(String)f4.getText();
            String s5=(String)f5.getText();
            String s6=(String)f6.getText();
            String s7=(String)f7.getText();
            String s8=(String)f8.getText();
         //   String s9=(String)tfsub9.getText();
           // String s10=(String)tfsub10.getText();
            
            String d1=((JTextField)date1.getDateEditor().getUiComponent()).getText();
            String d2=((JTextField)date2.getDateEditor().getUiComponent()).getText();
            String d3=((JTextField)date3.getDateEditor().getUiComponent()).getText();
            String d4=((JTextField)date4.getDateEditor().getUiComponent()).getText();
            String d5=((JTextField)date5.getDateEditor().getUiComponent()).getText();
            String d6=((JTextField)date6.getDateEditor().getUiComponent()).getText();
            String d7=((JTextField)date7.getDateEditor().getUiComponent()).getText();
            String d8=((JTextField)date8.getDateEditor().getUiComponent()).getText();
            
            try{
           
                Conn c1=new Conn();
                String query1="insert into exams values('"+sem+"','"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+s7+"','"+s8+"')";
                
                String query2="insert into examd values('"+sem+"','"+d1+"','"+d2+"','"+d3+"','"+d4+"','"+d5+"','"+d6+"','"+d7+"','"+d8+"')";
                
                c1.s.executeUpdate(query1);
                c1.s.executeUpdate(query2);
                JOptionPane.showMessageDialog(null,"Successfully updated");
               
            
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            
       }
       else if(ae.getSource()==back){
           setVisible(false);
           new Foptions().setVisible(true);
       }
        
    }
    
    public static void main(String args[]){
        new Examdates();
    }
    
}

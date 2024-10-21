package studentportal;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;


public class sattendance extends JFrame implements ActionListener{
    JTextField Roll,nclasses,nattended;
    JComboBox cbsemester,month;
    JButton calculate,update,cancel;
    sattendance(){
        
        setLayout(null);
        
        JLabel text=new JLabel("Student Attendance");
        text.setFont(new Font("Osward",Font.BOLD ,30));
        text.setBounds(150,30,400,40);
        add(text);
        
        JLabel roll=new JLabel("RollNo: ");
       roll.setFont(new Font("Raleway",Font.BOLD,17));
        roll.setBounds(100,80,400,40);
        add(roll);
        
        Roll =new JTextField();
        Roll.setBounds(300,90,150,20);
        add(Roll);
        
        JLabel lblsemester = new JLabel("Semester:");
        lblsemester.setFont(new Font("Raleway",Font.BOLD,17));
        lblsemester.setBounds(100, 110, 150, 30);
        add(lblsemester);
        
        
        String semester[] = {"1st Semester", "2nd Semester", "3rd Semester", "4th Semester", "5th Semester", "6th Semester", "7th Semester", "8th Semester" };
        cbsemester = new JComboBox(semester);
        cbsemester.setBounds(300, 115, 150, 20);
        cbsemester.setBackground(Color.WHITE);
        add(cbsemester);
        
        JLabel mon = new JLabel("Month:");
        mon.setFont(new Font("Raleway",Font.BOLD,17));
        mon.setBounds(100, 140, 150, 30);
        add(mon);
               
        
        String monn[] = {"January", "February", "March", "April", "May", "June", "July", "August","September","October","November","December" };
        month = new JComboBox(monn);
        month.setBounds(300, 145, 150, 20);
        month.setBackground(Color.WHITE);
        add(month);
        
         JLabel noclass=new JLabel("No.of classes Held:");
        noclass.setFont(new Font("Raleway",Font.BOLD,17));
        noclass.setBounds(100,170,250,30);
        add(noclass);
        
        nclasses =new JTextField();
        nclasses.setFont(new Font("Raleway",Font.BOLD,15));
        nclasses.setBounds(300,175,150,20);
        add(nclasses);
        
         JLabel aclass=new JLabel("No.of classes Attended:");
        aclass.setFont(new Font("Raleway",Font.BOLD,17));
        aclass.setBounds(100,200,250,30);
        add(aclass);
        
        nattended =new JTextField();
        nattended.setFont(new Font("Raleway",Font.BOLD,15));
        nattended.setBounds(300,205,150,20);
        add(nattended);
        
        calculate =new JButton("Calculate");
        calculate.setBounds(150, 300, 120, 25);
        calculate.setBackground(Color.BLACK);
        calculate.setForeground(Color.WHITE);
        calculate.addActionListener(this);
        calculate.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(calculate);
        
        
        update =new JButton("Update");
        update.setBounds(300, 300, 120, 25);
        update.setBackground(Color.BLACK);
        update.setForeground(Color.WHITE);
        update.addActionListener(this);
        update.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(update);
        
         cancel = new JButton("Back");
        cancel.setBounds(220, 350, 120, 25);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        cancel.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(cancel);
        
        
         getContentPane().setBackground(new Color(247, 247, 240));
        setSize(600,600);
        setLocation(500,200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
      public void actionPerformed(ActionEvent ae){
          String nclass=(String)nclasses.getText();
          String aclass=(String)nattended.getText();
          
          if(ae.getSource()==calculate){
              int nc=Integer.parseInt(nclass);
              int na=Integer.parseInt(aclass);
              Double result=(na/(nc*1.0))*100;
              JOptionPane.showMessageDialog(null,"Successfully updated: "+result +"%");
              
              
          }
          else if(ae.getSource()==update){
              int nc=Integer.parseInt(nclass);
              int na=Integer.parseInt(aclass);
              Double result=(na/(nc*1.0))*100;
              String re=""+result;
              String roll=(String)Roll.getText();
              String sem=(String)cbsemester.getSelectedItem();
              String mon=(String)month.getSelectedItem();
              String noc=(String)nclasses.getText();
              String noa=(String)nattended.getText();
              
               try{
           
                Conn c1=new Conn();
               String query1="insert into attendance values('"+roll+"','"+sem+"','"+mon+"','"+noc+"','"+noa+"','"+re+"')";
   
                c1.s.executeUpdate(query1);
                JOptionPane.showMessageDialog(null,"Successfully updated");
               
            
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
              
              
          }
          else if(ae.getSource()==cancel){
              setVisible(false);
              new Foptions().setVisible(true);
          }
          
          
      }
    public static void main(String args[]){
        new sattendance();
    }
    
}

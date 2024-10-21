package studentportal;

import com.toedter.calendar.JDateChooser;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Feepayment extends JFrame implements ActionListener {
    JDateChooser  date;
    JTextField f1,f2;
    JComboBox type;
    JButton pay,back;
    String roll,sem;
    Feepayment(String roll,String sem){
        this.roll=roll;
        this.sem=sem;
        setLayout(null);
        
        JLabel text=new JLabel("Fee Payment");
        text.setFont(new Font("Raleway",Font.BOLD,20));
        text.setBounds(220,30,200,30);
        add(text);
        
         JLabel text1=new JLabel("Rollno:");
        text1.setFont(new Font("Raleway",Font.BOLD,17));
        text1.setBounds(100,70,200,30);
        add(text1);
        
        f1=new JTextField();
        f1.setFont(new Font("Raleway",Font.BOLD,17));
        f1.setBounds(200,70,250,30);
        add(f1);
        
         JLabel dob=new JLabel("Date:");
        dob.setFont(new Font("Raleway",Font.BOLD ,17));
        dob.setBounds(100,110,150,30);
        add(dob);
        date=new JDateChooser();
        date.setBounds(200,110,250,30);
        add(date);
        
        JLabel lblsemester = new JLabel("Type:");
        lblsemester.setFont(new Font("Raleway",Font.BOLD,17));
        lblsemester.setBounds(100, 150, 150, 30);
        add(lblsemester);
        
        String ty[] = {"Tution Fee", "Exam Fee", "Library Fee", "Transport Fee", "Other" };
        type = new JComboBox(ty);
        type.setBounds(200, 150, 250, 30);
        type.setBackground(Color.WHITE);
        add(type);
        
         JLabel text3=new JLabel("Pay Fee:");
        text3.setFont(new Font("Raleway",Font.BOLD,17));
        text3.setBounds(100,190,200,30);
        add(text3);
        
        f2=new JTextField();
        f2.setFont(new Font("Raleway",Font.BOLD,17));
        f2.setBounds(200,190,250,30);
        add(f2);
        
        ImageIcon i3=new ImageIcon("C:\\Users\\tanne\\OneDrive\\Documents\\NetBeansProjects\\StudentPortal\\src\\icons\\qrcode.png");
        JLabel label=new JLabel(i3);
        label.setBounds(200,250,i3.getIconWidth(),i3.getIconHeight());
        add(label);
        
        pay = new JButton("Pay");
        pay.setBounds(130, 480, 150, 25);
        pay.setBackground(Color.BLACK);
        pay.setForeground(Color.WHITE);
        pay.addActionListener(this);
        pay.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(pay);
        
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
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
    }
    
      public void actionPerformed(ActionEvent ae){
          if(ae.getSource()==pay){
             // String roll=(String)f1.getText();
              String datee=((JTextField)date.getDateEditor().getUiComponent()).getText();
              String ptype=(String)type.getSelectedItem();
              String amount=(String)f2.getText();
              
              try{
                  Conn c=new Conn();
                    String query1="insert into fee values('"+roll+"','"+sem+"','"+datee+"','"+ptype+"','"+amount+"')";
   
                c.s.executeUpdate(query1);
                JOptionPane.showMessageDialog(null,"Successfully Fee Paid");
               
                  
                  
                  
                  
              }
              catch(Exception e){
                  System.out.println(e);
              }
              
          }
          else if(ae.getSource()==back){
              setVisible(false);
              new Soptions().setVisible(true);
          }
          
      }
    
    public static void main(String args[]){
        new Feepayment("","");
    }
    
}

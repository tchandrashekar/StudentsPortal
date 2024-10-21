package studentportal;

import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


public class FacultyLogin extends JFrame implements ActionListener{
    
    JButton login,signup,clear;
    JTextField facultyid;
    JPasswordField password;
    
     FacultyLogin(){

        setTitle("Faculty Login Page");
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel label=new JLabel(i3);
        label.setBounds(560,100,200,200);
        add(label);
        
        JLabel text=new JLabel("Faculty Login Page");
        text.setFont(new Font("Osward",Font.BOLD ,35));
        text.setBounds(200,40,400,50);
        add(text);
        
        JLabel cardno=new JLabel("Faculty ID:");
        cardno.setFont(new Font("Raleway",Font.BOLD ,28));
        cardno.setBounds(120,150,150,40);
        add(cardno);
        
        facultyid=new JTextField();
        facultyid.setBounds(300,150,250,40);
        facultyid.setFont(new Font("Arial",Font.BOLD ,14));
        add(facultyid);
        
        JLabel pin=new JLabel("Password:");
        pin.setFont(new Font("Raleway",Font.BOLD ,28));
        pin.setBounds(120,220,400,40);
        add(pin);
        
        password=new JPasswordField();
        password.setBounds(300,220,250,40);
        password.setFont(new Font("Arial",Font.BOLD ,14));
        add(password);
        
        login=new JButton("Sign in");
        login.setBounds(300,300,100,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);
        
        clear=new JButton("Clear");
        clear.setBounds(450,300,100,30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);
        
        signup=new JButton("Sign Up");
        signup.setBounds(300,350,250,30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);
        
        
        
        getContentPane().setBackground(new Color(247, 247, 240));
        
        setSize(800,500);
        setVisible(true);
        setLocation(350,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
    }
       public void actionPerformed(ActionEvent ae)
     {
         if(ae.getSource() == clear)
         {
             facultyid.setText("");
             password.setText("");
         }
         else if(ae.getSource()==login)
         {
             Conn conn=new Conn();
             String cardnumber=facultyid.getText();
             String pinnumber=password.getText();
             String query="select Faculty_id,password from faculty where Faculty_id = '"+cardnumber+"' and password='"+pinnumber+"'  ";
             try{
                 ResultSet rs=conn.s.executeQuery(query);
                 if(rs.next())
                 {
                     setVisible(false);
                     new Foptions().setVisible(true);
                 }
                 else{
                     JOptionPane.showMessageDialog(null,"Incorrect card number or pin");
                 }
             }
             catch(Exception e){
                 System.out.println(e);
             }
         }
         else if(ae.getSource()==signup){
             setVisible(false);
             new SignupOne().setVisible(true);
            
         }
     }
    
    
    public static void main(String args[])
    {
        new FacultyLogin();
    }
}

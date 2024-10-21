package studentportal;

import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
import java.util.Random;

public class AddStudent extends JFrame implements ActionListener{
    
    JTextField nameField,fnameField,emailField,addressField,Tenth,Inter,Aadhar,Roll;
    JDateChooser date;
    JRadioButton male,female;
    JComboBox Category,Branch;
    JButton submit,back;
    
    AddStudent(){
        setLayout(null);
        
        JLabel title=new JLabel("Student Details:");
        title.setFont(new Font("Raleway",Font.BOLD ,20));
        title.setBounds(300,10,150,30);
        add(title);
        
         JLabel name=new JLabel("Name:");
        name.setFont(new Font("Raleway",Font.BOLD ,20));
        name.setBounds(100,50,150,30);
        add(name);
        nameField=new JTextField();
        nameField.setFont(new Font("Raleway",Font.BOLD,14));
        nameField.setBounds(300,50,300,30);
        add(nameField);
        
        JLabel fname=new JLabel("Father's Name:");
        fname.setFont(new Font("Raleway",Font.BOLD ,20));
        fname.setBounds(100,100,150,30);
        add(fname);
        fnameField=new JTextField();
        fnameField.setFont(new Font("Raleway",Font.BOLD,14));
        fnameField.setBounds(300,100,300,30);
        add(fnameField);
        
        JLabel dob=new JLabel("Date Of Birth:");
        dob.setFont(new Font("Raleway",Font.BOLD ,20));
        dob.setBounds(100,150,150,30);
        add(dob);
        date=new JDateChooser();
        date.setBounds(300,150,300,30);
        add(date);
        
        JLabel gender=new JLabel("Gender:");
        gender.setFont(new Font("Raleway",Font.BOLD ,20));
        gender.setBounds(100,200,150,30);
        add(gender);
        male=new JRadioButton("Male");
        male.setBounds(300,200,100,30);
        male.setBackground(Color.WHITE);
        add(male);
        female=new JRadioButton("Female");
        female.setBounds(500,200,100,30);
        female.setBackground(Color.WHITE);
        add(female);
        ButtonGroup gendergroup=new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        
        JLabel email=new JLabel("Email:");
        email.setFont(new Font("Raleway",Font.BOLD ,20));
        email.setBounds(100,250,150,30);
        add(email);
        emailField=new JTextField();
        emailField.setFont(new Font("Raleway",Font.BOLD,14));
        emailField.setBounds(300,250,300,30);
        add(emailField);
        
        JLabel address=new JLabel("Address:");
        address.setFont(new Font("Raleway",Font.BOLD ,20));
        address.setBounds(100,300,150,30);
        add(address);
        addressField=new JTextField();
        addressField.setFont(new Font("Raleway",Font.BOLD,14));
        addressField.setBounds(300,300,300,30);
        add(addressField);
        
        JLabel tenth=new JLabel("10th %:");
        tenth.setFont(new Font("Raleway",Font.BOLD ,20));
        tenth.setBounds(100,350,150,30);
        add(tenth);
        Tenth=new JTextField();
        Tenth.setFont(new Font("Raleway",Font.BOLD,14));
        Tenth.setBounds(300,350,300,30);
        add(Tenth);
        
        JLabel twelve=new JLabel("12th/Diploma:");
        twelve.setFont(new Font("Raleway",Font.BOLD ,20));
        twelve.setBounds(100,400,150,30);
        add(twelve);
        Inter=new JTextField();
        Inter.setFont(new Font("Raleway",Font.BOLD,14));
        Inter.setBounds(300,400,300,30);
        add(Inter);
        
        JLabel aadhar=new JLabel("Aadhar No:");
        aadhar.setFont(new Font("Raleway",Font.BOLD ,20));
        aadhar.setBounds(100,450,150,30);
        add(aadhar);
        Aadhar=new JTextField();
        Aadhar.setFont(new Font("Raleway",Font.BOLD,14));
        Aadhar.setBounds(300,450,300,30);
        add(Aadhar);
        
        JLabel cat=new JLabel("Category:");
        cat.setFont(new Font("Raleway",Font.BOLD ,20));
        cat.setBounds(100,500,150,30);
        add(cat);
        
        String valCategory[] = {"General","OBC","SC","ST","Other"};
        Category=new JComboBox(valCategory);
        Category.setBounds(300,500,300,30);
        Category.setBackground(Color.WHITE);
        add(Category);
        
        
        JLabel branch=new JLabel("Branch:");
        branch.setFont(new Font("Raleway",Font.BOLD ,20));
        branch.setBounds(100,550,150,30);
        add(branch);
        
        String boptions[] = {"CSE","ECE","MECH","CIVIL","EEE"};
        Branch=new JComboBox(boptions);
        Branch.setBounds(300,550,300,30);
        Branch.setBackground(Color.WHITE);
        add(Branch);
        
        JLabel roll=new JLabel("Roll No:");
        roll.setFont(new Font("Raleway",Font.BOLD ,20));
        roll.setBounds(100,600,150,30);
        add(roll);
        Roll=new JTextField();
        Roll.setFont(new Font("Raleway",Font.BOLD,14));
        Roll.setBounds(300,600,300,30);
        add(Roll);
        
        submit=new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Raleway",Font.BOLD,14));
        submit.setBounds(250,670,100,30);
        submit.addActionListener(this);
        add(submit);
        
        back=new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setFont(new Font("Raleway",Font.BOLD,14));
        back.setBounds(400,670,100,30);
        back.addActionListener(this);
        add(back);
        
        
        getContentPane().setBackground(new Color(247, 247, 240));
        setSize(800,800);
        setLocation(400,50);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
   public void actionPerformed(ActionEvent ae){
       if(ae.getSource()==submit){
            String name=nameField.getText();
            String fname=fnameField.getText();
            String dob=((JTextField)date.getDateEditor().getUiComponent()).getText();
            String gender=null;
            if(male.isSelected()){
                gender="Male";
            }
            else if(female.isSelected())
            {
                gender="Female";
            }
            String email=emailField.getText();
            String address=addressField.getText();
            String tenth=Tenth.getText();
            String inter=(String)Inter.getText();
            String aadhar=(String)Aadhar.getText();
            String scategory=(String)Category.getSelectedItem();
            String branch=(String)Branch.getSelectedItem();
            String roll=(String)Roll.getText();
            try{
            if(name.equals("")){
                JOptionPane.showMessageDialog(null,"Name is Required"); 
            }
            else{
                Conn c1=new Conn();
                String query="insert into student values('"+roll+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+address+"','"+tenth+"','"+inter+"','"+aadhar+"','"+scategory+"','"+branch+"')";
                c1.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Name"+name+"\n pin:"+roll);
               
            }
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
        new AddStudent();
    }
    
}

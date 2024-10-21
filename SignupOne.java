package studentportal;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;


public class SignupOne extends JFrame implements ActionListener{
    int randomNumber;
    JTextField nameField,emailField,addressField,aadhar,Password;
    JButton submit,back;
    JRadioButton male,female,single,married,other;
    JComboBox Category,Occupation,Education;
    JDateChooser date;
    
    
    
    SignupOne(){
        setLayout(null);
      
       
     
        
        JLabel personalDetails=new JLabel("Faculty Details");
        personalDetails.setFont(new Font("Raleway",Font.BOLD ,22));
        personalDetails.setBounds(290,30,400,45);
        add(personalDetails);
        
        JLabel name=new JLabel("Name:");
        name.setFont(new Font("Raleway",Font.BOLD ,20));
        name.setBounds(100,100,150,30);
        add(name);
        nameField=new JTextField();
        nameField.setFont(new Font("Raleway",Font.BOLD,14));
        nameField.setBounds(300,100,300,30);
        add(nameField);
        
       
        
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
        female.setBounds(400,200,100,30);
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
        
        JLabel martial=new JLabel("Martial Status:");
        martial.setFont(new Font("Raleway",Font.BOLD ,20));
        martial.setBounds(100,300,150,30);
        add(martial);
        single=new JRadioButton("Single");
        single.setBounds(300,300,100,30);
        single.setBackground(Color.WHITE);
        add(single);
        married=new JRadioButton("Married");
        married.setBounds(400,300,100,30);
        married.setBackground(Color.WHITE);
        add(married);
        other=new JRadioButton("Other");
        other.setBounds(500,300,100,30);
        other.setBackground(Color.WHITE);
        add(other);
        ButtonGroup statusgroup=new ButtonGroup();
        statusgroup.add(single);
        statusgroup.add(married);
        statusgroup.add(other);
        
        JLabel address=new JLabel("Address:");
        address.setFont(new Font("Raleway",Font.BOLD ,20));
        address.setBounds(100,350,150,30);
        add(address);
        addressField=new JTextField();
        addressField.setFont(new Font("Raleway",Font.BOLD,14));
        addressField.setBounds(300,350,300,30);
        add(addressField);
        
        JLabel city=new JLabel("Aadhar Number:");
        city.setFont(new Font("Raleway",Font.BOLD ,20));
        city.setBounds(100,400,250,30);
        add(city);
        aadhar=new JTextField();
        aadhar.setFont(new Font("Raleway",Font.BOLD,14));
        aadhar.setBounds(300,400,300,30);
        add(aadhar);
        
        
        JLabel fname=new JLabel("Category:");
        fname.setFont(new Font("Raleway",Font.BOLD ,20));
        fname.setBounds(100,450,150,30);
        add(fname);
       
        String valCategory[] = {"General","OBC","SC","ST","Other"};
        Category=new JComboBox(valCategory);
        Category.setBounds(300,450,300,30);
        Category.setBackground(Color.WHITE);
        add(Category);
        
        JLabel education=new JLabel("Educational");
        education.setFont(new Font("Raleway",Font.BOLD ,20));
        education.setBounds(100,500,150,30);
        add(education);
        JLabel eemail=new JLabel("Qualification:");
        eemail.setFont(new Font("Raleway",Font.BOLD ,20));
        eemail.setBounds(100,520,150,30);
        add(eemail);
        
        String educationval[] = {"Non-Graduation","Graduate","Post-Graduation","Doctrate","Other"};
        Education=new JComboBox(educationval);
        Education.setBounds(300,510,300,30);
        Education.setBackground(Color.WHITE);
        add(Education);
        
        JLabel Role=new JLabel("Role:");
        Role.setFont(new Font("Raleway",Font.BOLD ,20));
        Role.setBounds(100,560,150,30);
        add(Role);
        
        String occupationval[] = {"Principal","HOD","lecturer","Assitant lecturer","Other"};
        Occupation=new JComboBox(occupationval);
        Occupation.setBounds(300,560,300,30);
        Occupation.setBackground(Color.WHITE);
        add(Occupation);
        
        JLabel password=new JLabel("Generate ");
        password.setFont(new Font("Raleway",Font.BOLD ,20));
        password.setBounds(100,600,150,30);
        add(password);
        JLabel ppassword=new JLabel("Password:");
        ppassword.setFont(new Font("Raleway",Font.BOLD ,20));
        ppassword.setBounds(100,620,150,30);
        add(ppassword);
        Password=new JTextField();
        Password.setFont(new Font("Raleway",Font.BOLD,14));
        Password.setBounds(300,615,300,30);
        add(Password);
        
        
        
        submit=new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Raleway",Font.BOLD,14));
        submit.setBounds(250,680,100,30);
        submit.addActionListener(this);
        add(submit);
        
        back=new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setFont(new Font("Raleway",Font.BOLD,14));
        back.setBounds(450,680,100,30);
        back.addActionListener(this);
        add(back);
        
        getContentPane().setBackground(new Color(247, 247, 240));
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
   
    public void actionPerformed(ActionEvent ae){
       if(ae.getSource()==submit){
         Random random=new Random();
        // randomNumber = 1000000 + ran.nextInt(9000000);
        String facultyid=""+Math.abs((random.nextLong()%9000L)+1000L);
        
        String name=nameField.getText();
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
        String martial=null;
        if(single.isSelected())
        {
            martial="Single";
        }
        else if(married.isSelected())
        {
            martial="Married";
        }
        else if(other.isSelected())
        {
            martial="Other";
        }
       
        String address=addressField.getText();
        String saadhar=aadhar.getText();
        String scategory=(String)Category.getSelectedItem();
        String seducation=(String)Education.getSelectedItem();
        String srole=(String)Occupation.getSelectedItem();
        String spassword=(String)Password.getText();
        
        try{
            if(name.equals("")){
                JOptionPane.showMessageDialog(null,"Name is Required"); 
            }
            else{
                Conn c1=new Conn();
                String query="insert into faculty values('"+facultyid+"','"+name+"','"+dob+"','"+gender+"','"+email+"','"+martial+"','"+address+"','"+saadhar+"','"+scategory+"','"+seducation+"','"+srole+"','"+spassword+"')";
                c1.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Card Number"+facultyid+"\n pin:"+spassword);
               
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
       }
       else if(ae.getSource()==back){
           setVisible(false);
           new FacultyLogin().setVisible(true);
       }
        
    }
    
   public static void main(String args[]){
       new SignupOne();
   }
            
    
}

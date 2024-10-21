package studentportal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MidOne extends JFrame implements ActionListener {
    
     JComboBox cbsemester;
    JTextField Roll, tfsub1, tfsub2,tfsub3,tfsub4,tfsub5,tfsub6, tfsub7,tfsub8,tfmarks1,tfmarks2,tfmarks3,tfmarks4,tfmarks5,tfmarks6,tfmarks7,tfmarks8;
    JButton cancel, submit;
    
    
    MidOne(){
        
        setLayout(null);
        
        JLabel heading = new JLabel("Enter MID-1 Marks of Student");
        heading.setBounds(150, 0, 500, 50);
        heading.setFont(new Font("Tahoma", Font.BOLD, 20));
        add(heading);
        
        
        
        JLabel lblrollnumber = new JLabel("Enter Roll Number:");
        lblrollnumber.setFont(new Font("Raleway",Font.BOLD,14));
        lblrollnumber.setBounds(100, 70, 200, 30);
        add(lblrollnumber);
        
        Roll=new JTextField();
        Roll.setFont(new Font("Raleway",Font.BOLD,14));
        Roll.setBounds(300,70,250,30);
        add(Roll);
        
        JLabel lblsemester = new JLabel("Select Semester");
        lblsemester.setFont(new Font("Raleway",Font.BOLD,14));
        lblsemester.setBounds(100, 110, 150, 30);
        add(lblsemester);
        
        String semester[] = {"1st Semester", "2nd Semester", "3rd Semester", "4th Semester", "5th Semester", "6th Semester", "7th Semester", "8th Semester" };
        cbsemester = new JComboBox(semester);
        cbsemester.setBounds(300, 110, 250, 30);
        cbsemester.setBackground(Color.WHITE);
        add(cbsemester);
        
         JLabel lblentersubject = new JLabel("Enter Subject");
         lblentersubject.setFont(new Font("Raleway",Font.BOLD,14));
        lblentersubject.setBounds(150, 150, 200, 40);
        add(lblentersubject);
        
        JLabel lblentermarks = new JLabel("Enter Marks");
        lblentermarks.setFont(new Font("Raleway",Font.BOLD,14));
        lblentermarks.setBounds(350, 150, 200, 40);
        add(lblentermarks);
        
        tfsub1 = new JTextField();
        tfsub1.setBounds(100, 200, 200, 25);
        add(tfsub1);
        
        tfsub2 = new JTextField();
        tfsub2.setBounds(100, 230, 200, 25);
        add(tfsub2);
        
        tfsub3 = new JTextField();
        tfsub3.setBounds(100, 260, 200, 25);
        add(tfsub3);
        
        tfsub4 = new JTextField();
        tfsub4.setBounds(100, 290, 200, 25);
        add(tfsub4);
        
        tfsub5 = new JTextField();
        tfsub5.setBounds(100, 320, 200, 25);
        add(tfsub5);
        
        tfsub6 = new JTextField();
        tfsub6.setBounds(100, 350, 200, 25);
        add(tfsub6);
        
        tfsub7 = new JTextField();
        tfsub7.setBounds(100, 380, 200, 25);
        add(tfsub7);
        
        tfsub8 = new JTextField();
        tfsub8.setBounds(100, 410, 200, 25);
        add(tfsub8);
        
      /*  tfsub9 = new JTextField();
        tfsub9.setBounds(100, 440, 200, 25);
        add(tfsub9);
        
        tfsub10 = new JTextField();
        tfsub10.setBounds(100, 470, 200, 25);
        add(tfsub10);
        */
        tfmarks1 = new JTextField();
        tfmarks1.setBounds(300, 200, 200, 25);
        add(tfmarks1);
        
        tfmarks2 = new JTextField();
        tfmarks2.setBounds(300, 230, 200, 25);
        add(tfmarks2);
        
        tfmarks3 = new JTextField();
        tfmarks3.setBounds(300, 260, 200, 25);
        add(tfmarks3);
        
         tfmarks4 = new JTextField();
        tfmarks4.setBounds(300, 290, 200, 25);
        add(tfmarks4);
        
        tfmarks5 = new JTextField();
        tfmarks5.setBounds(300, 320, 200, 25);
        add(tfmarks5);
        
        tfmarks6 = new JTextField();
        tfmarks6.setBounds(300, 350, 200, 25);
        add(tfmarks6);
        
        tfmarks7 = new JTextField();
        tfmarks7.setBounds(300, 380, 200, 25);
        add(tfmarks7);
        
        tfmarks8 = new JTextField();
        tfmarks8.setBounds(300, 410, 200, 25);
        add(tfmarks8);
      /*  
         tfmarks9 = new JTextField();
        tfmarks9.setBounds(300, 440, 200, 25);
        add(tfmarks9);
        
        tfmarks10 = new JTextField();
        tfmarks10.setBounds(300, 470, 200, 25);
        add(tfmarks10);
        */
        submit = new JButton("Submit");
        submit.setBounds(140, 500, 150, 30);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(submit);
        
        cancel = new JButton("Back");
        cancel.setBounds(380, 500, 150, 30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        cancel.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(cancel);
        
        getContentPane().setBackground(new Color(247, 247, 240));
        setSize(700,700);
        setLocation(400,100);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
     public void actionPerformed(ActionEvent ae){
       if(ae.getSource()==submit){
            
            String roll=(String)Roll.getText();
            String sem=(String)cbsemester.getSelectedItem();
            String s1=(String)tfsub1.getText();
            String s2=(String)tfsub2.getText();
            String s3=(String)tfsub3.getText();
            String s4=(String)tfsub4.getText();
            String s5=(String)tfsub5.getText();
            String s6=(String)tfsub6.getText();
            String s7=(String)tfsub7.getText();
            String s8=(String)tfsub8.getText();
         //   String s9=(String)tfsub9.getText();
           // String s10=(String)tfsub10.getText();
            
            String m1=(String)tfmarks1.getText();
            String m2=(String)tfmarks2.getText();
            String m3=(String)tfmarks3.getText();
            String m4=(String)tfmarks4.getText();
            String m5=(String)tfmarks5.getText();
            String m6=(String)tfmarks6.getText();
            String m7=(String)tfmarks7.getText();
            String m8=(String)tfmarks8.getText();
           // String m9=(String)tfmarks9.getText();
           // String m10=(String)tfmarks10.getText();
            
            try{
           
                Conn c1=new Conn();
                String query1="insert into midones values('"+roll+"','"+sem+"','"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+s7+"','"+s8+"')";
                
                String query2="insert into midonem values('"+roll+"','"+sem+"','"+m1+"','"+m2+"','"+m3+"','"+m4+"','"+m5+"','"+m6+"','"+m7+"','"+m8+"')";
                
                c1.s.executeUpdate(query1);
                c1.s.executeUpdate(query2);
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
        new MidOne();
    }
    
}


package studentportal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Semister extends JFrame implements ActionListener{
    
    
    JComboBox cbsemester;
    JTextField Roll, gd1,gd2,gd3,gd4,gd5,gd6,gd7,gd8,pp1,pp2,pp3,pp4,pp5,pp6,pp7,pp8, tfsub1, tfsub2,tfsub3,tfsub4,tfsub5,tfsub6, tfsub7,tfsub8,tfmarks1,tfmarks2,tfmarks3,tfmarks4,tfmarks5,tfmarks6,tfmarks7,tfmarks8;
    JButton cancel, submit;
    
    
    Semister(){
        
        setLayout(null);
        
        JLabel heading = new JLabel("Enter Semister Marks of Student");
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
        
         JLabel lblentergrades = new JLabel("Enter Grades");
        lblentergrades.setFont(new Font("Raleway",Font.BOLD,14));
        lblentergrades.setBounds(520, 150, 200, 40);
        add(lblentergrades);
        
         JLabel lblenterpoints = new JLabel("Enter Points");
        lblenterpoints.setFont(new Font("Raleway",Font.BOLD,14));
        lblenterpoints.setBounds(670, 150, 200, 40);
        add(lblenterpoints);
        
        
        
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
        
        gd1 = new JTextField();
        gd1.setBounds(500, 200, 150, 25);
        add(gd1);
        
        gd2 = new JTextField();
        gd2.setBounds(500, 230, 150, 25);
        add(gd2);
        
        gd3 = new JTextField();
        gd3.setBounds(500, 260, 150, 25);
        add(gd3);
        
        gd4 = new JTextField();
        gd4.setBounds(500, 290, 150, 25);
        add(gd4);
        
        gd5 = new JTextField();
        gd5.setBounds(500, 320, 150, 25);
        add(gd5);
        
        gd6 = new JTextField();
        gd6.setBounds(500, 350, 150, 25);
        add(gd6);
        
        gd7 = new JTextField();
        gd7.setBounds(500, 380, 150, 25);
        add(gd7);
        
        gd8 = new JTextField();
        gd8.setBounds(500, 410, 150, 25);
        add(gd8);
        
        pp1 = new JTextField();
        pp1.setBounds(650, 200, 150, 25);
        add(pp1);
        
        pp2 = new JTextField();
        pp2.setBounds(650, 230, 150, 25);
        add(pp2);
        
        pp3 = new JTextField();
        pp3.setBounds(650, 260, 150, 25);
        add(pp3);
        
        pp4 = new JTextField();
        pp4.setBounds(650, 290, 150, 25);
        add(pp4);
        
        pp5 = new JTextField();
        pp5.setBounds(650, 320, 150, 25);
        add(pp5);
        
        pp6 = new JTextField();
        pp6.setBounds(650, 350, 150, 25);
        add(pp6);
        
        pp7 = new JTextField();
        pp7.setBounds(650, 380, 150, 25);
        add(pp7);
        
        pp8 = new JTextField();
        pp8.setBounds(650, 410, 150, 25);
        add(pp8);
  
        
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
        
       JLabel mr1 = new JLabel("[ 90 & Above ]");
        mr1.setFont(new Font("Raleway",Font.BOLD,14));
        mr1.setBounds(180, 450, 200, 40);
        add(mr1);
        
        JLabel mr2 = new JLabel("[ 80-89 ]");
        mr2.setFont(new Font("Raleway",Font.BOLD,14));
        mr2.setBounds(300, 450, 200, 40);
        add(mr2);
        
        JLabel mr3 = new JLabel("[ 70-79 ]");
        mr3.setFont(new Font("Raleway",Font.BOLD,14));
        mr3.setBounds(380, 450, 200, 40);
        add(mr3);
        
        JLabel mr4 = new JLabel("[ 60-69 ]");
        mr4.setFont(new Font("Raleway",Font.BOLD,14));
        mr4.setBounds(460, 450, 200, 40);
        add(mr4);
        
        JLabel mr5 = new JLabel("[ 50-59 ]");
        mr5.setFont(new Font("Raleway",Font.BOLD,14));
        mr5.setBounds(540, 450, 200, 40);
        add(mr5);
        
        JLabel mr6 = new JLabel("[ 40-49 ]");
        mr6.setFont(new Font("Raleway",Font.BOLD,14));
        mr6.setBounds(640, 450, 200, 40);
        add(mr6);
        
        JLabel mr7 = new JLabel("[ Below 40 ]");
        mr7.setFont(new Font("Raleway",Font.BOLD,14));
        mr7.setBounds(720, 450, 200, 40);
        add(mr7);
                
               
        
         JLabel grr = new JLabel("Grades:");
         grr.setFont(new Font("Raleway",Font.BOLD,14));
        grr.setBounds(100, 480, 200, 40);
        add(grr);
        
         JLabel grr1 = new JLabel("O");
         grr1.setFont(new Font("Raleway",Font.BOLD,14));
        grr1.setBounds(230, 480, 200, 40);
        add(grr1);
        
         JLabel grr2 = new JLabel("A+");
         grr2.setFont(new Font("Raleway",Font.BOLD,14));
        grr2.setBounds(320, 480, 200, 40);
        add(grr2);
        
         JLabel grr3 = new JLabel("A");
         grr3.setFont(new Font("Raleway",Font.BOLD,14));
        grr3.setBounds(400, 480, 200, 40);
        add(grr3);
        
         JLabel grr4 = new JLabel("B+");
         grr4.setFont(new Font("Raleway",Font.BOLD,14));
        grr4.setBounds(480, 480, 200, 40);
        add(grr4);
        
         JLabel grr5 = new JLabel("B");
         grr5.setFont(new Font("Raleway",Font.BOLD,14));
        grr5.setBounds(560, 480, 200, 40);
        add(grr5);
        
         JLabel grr6 = new JLabel("C");
         grr6.setFont(new Font("Raleway",Font.BOLD,14));
        grr6.setBounds(650, 480, 200, 40);
        add(grr6);
        
         JLabel grr7 = new JLabel("F");
         grr7.setFont(new Font("Raleway",Font.BOLD,14));
        grr7.setBounds(750, 480, 200, 40);
        add(grr7);
        
         JLabel ppp = new JLabel("Points:");
         ppp.setFont(new Font("Raleway",Font.BOLD,14));
        ppp.setBounds(100, 510, 200, 40);
        add(ppp);
        
        
         JLabel ppp1 = new JLabel("10");
         ppp1.setFont(new Font("Raleway",Font.BOLD,14));
        ppp1.setBounds(230, 510, 200, 40);
        add(ppp1);
        
         JLabel ppp2 = new JLabel("9");
         ppp2.setFont(new Font("Raleway",Font.BOLD,14));
        ppp2.setBounds(320, 510, 200, 40);
        add(ppp2);
        
         JLabel ppp3 = new JLabel("8");
         ppp3.setFont(new Font("Raleway",Font.BOLD,14));
        ppp3.setBounds(400, 510, 200, 40);
        add(ppp3);
        
         JLabel ppp4 = new JLabel("7");
         ppp4.setFont(new Font("Raleway",Font.BOLD,14));
        ppp4.setBounds(480, 510, 200, 40);
        add(ppp4);
        
         JLabel ppp5 = new JLabel("6");
         ppp5.setFont(new Font("Raleway",Font.BOLD,14));
        ppp5.setBounds(560, 510, 200, 40);
        add(ppp5);
        
         JLabel ppp6 = new JLabel("5");
         ppp6.setFont(new Font("Raleway",Font.BOLD,14));
        ppp6.setBounds(650, 510, 200, 40);
        add(ppp6);
        
         JLabel ppp7 = new JLabel("0");
         ppp7.setFont(new Font("Raleway",Font.BOLD,14));
        ppp7.setBounds(750, 510, 200, 40);
        add(ppp7);
      
      
      
        submit = new JButton("Submit");
        submit.setBounds(200, 580, 150, 30);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(submit);
        
        cancel = new JButton("Back");
        cancel.setBounds(500, 580, 150, 30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        cancel.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(cancel);
        
        getContentPane().setBackground(new Color(247, 247, 240));
        setSize(900,700);
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
            
            String g1=(String)gd1.getText();
            String g2=(String)gd2.getText();
            String g3=(String)gd3.getText();
            String g4=(String)gd4.getText();
            String g5=(String)gd5.getText();
            String g6=(String)gd6.getText();
            String g7=(String)gd7.getText();
            String g8=(String)gd8.getText();
            
            String p1=(String)pp1.getText();
            String p2=(String)pp2.getText();
            String p3=(String)pp3.getText();
            String p4=(String)pp4.getText();
            String p5=(String)pp5.getText();
            String p6=(String)pp6.getText();
            String p7=(String)pp7.getText();
            String p8=(String)pp8.getText();
            
             
            
            
             int sum=Integer.parseInt(p1)+Integer.parseInt(p2)+Integer.parseInt(p3)+Integer.parseInt(p4)+Integer.parseInt(p5)+Integer.parseInt(p6)+Integer.parseInt(p7)+Integer.parseInt(p8);
            double gpa=sum/8.0; 
            String sgpa=""+gpa;
            String cgpa=""+gpa;
            
            
            try{
           
                Conn c1=new Conn();
                String query1="insert into sem values('"+roll+"','"+sem+"','"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+s7+"','"+s8+"')";
                
                String query2="insert into semm values('"+roll+"','"+sem+"','"+m1+"','"+m2+"','"+m3+"','"+m4+"','"+m5+"','"+m6+"','"+m7+"','"+m8+"')";
                
                String query3="insert into grades values('"+roll+"','"+sem+"','"+g1+"','"+g2+"','"+g3+"','"+g4+"','"+g5+"','"+g6+"','"+g7+"','"+g8+"')";
                
                String query4="insert into points values('"+roll+"','"+sem+"','"+p1+"','"+p2+"','"+p3+"','"+p4+"','"+p5+"','"+p6+"','"+p7+"','"+p8+"','"+sgpa+"','"+cgpa+"' )";
                
                
                c1.s.executeUpdate(query1);
                c1.s.executeUpdate(query2);
                c1.s.executeUpdate(query3);
                c1.s.executeUpdate(query4);
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
        new Semister();
    }
    
    
    
    
    
}

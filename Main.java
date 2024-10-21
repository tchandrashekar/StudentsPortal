package studentportal;
import java.awt.Color;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.border.*;
import javax.swing.*;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener{
    JLabel text,stext,ftext;
    JButton student,faculty;
    Main(){
        setTitle("Students Portal");
        setLayout(null);
        
        text=new JLabel("Welcome To Students Portal");
        text.setFont(new Font("Osward",Font.BOLD ,25));
        text.setBounds(130,40,400,35);
        add(text);
        
        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("icons/graduated.png"));
        Image i2=icon.getImage().getScaledInstance(150,150,Image.SCALE_SMOOTH);
        ImageIcon i3=new ImageIcon(i2);
        student = new JButton(icon);
        student.setIcon(i3);
        student.setBounds(100,150,150,150);
        student.addActionListener(this);
        
        student.setContentAreaFilled(false);
        student.setBorder(new RoundedBorder(20));
        student.setFocusPainted(false);
        student.setContentAreaFilled(false); // Allows the rounded shape to be visible
        student.setOpaque(false);
       
        
        add(student);
        
        stext=new JLabel("Student");
        stext.setFont(new Font("Raleway",Font.BOLD ,20));
        stext.setBounds(135,300,100,40);
        add(stext);
        
        
        
        ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("icons/teacher.png"));
        Image i4=icon1.getImage().getScaledInstance(140,150,Image.SCALE_SMOOTH);
        ImageIcon i5=new ImageIcon(i4);
        faculty = new JButton(icon);
        faculty.setIcon(i5);
        faculty.setBounds(350,150,150,150);
        faculty.addActionListener(this);
        faculty.setContentAreaFilled(false);
        faculty.setBorder(new RoundedBorder(20));
        faculty.setFocusPainted(false);
         faculty.setContentAreaFilled(false); // Allows the rounded shape to be visible
        faculty.setOpaque(false);
        
        
        
        
        add(faculty);
        
        ftext=new JLabel("Faculty");
        ftext.setFont(new Font("Raleway",Font.BOLD ,20));
        
        ftext.setBounds(390,300,100,40);
        add(ftext);
        Color customColor = new Color(245, 242, 240);
        getContentPane().setBackground(customColor);
        
        setSize(600,600);
        setVisible(true);
        setLocation(350,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
    }
     static class RoundedBorder implements Border {
        private int radius;

        RoundedBorder(int radius) {
            this.radius = radius;
        }

        @Override
        public Insets getBorderInsets(Component c) {
            return new Insets(this.radius + 1, this.radius + 1, this.radius + 2, this.radius);
        }

        @Override
        public boolean isBorderOpaque() {
            return true;
        }

        @Override
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            Graphics2D g2 = (Graphics2D) g;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.drawRoundRect(x, y, width - 1, height - 1, radius, radius);
        }
     }
     
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==student){
             setVisible(false);
            new Soptions().setVisible(true);
        }
        else if(ae.getSource()==faculty){
            setVisible(false);
            new FacultyLogin().setVisible(true);
        }
    }
    
    
    public static void main(String args[]){
        new Main();
    }
}

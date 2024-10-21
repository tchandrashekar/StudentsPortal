package studentportal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.Border;


public class Foptions extends JFrame implements ActionListener{
    
      JButton astudent,amarks1,amarks2,amarks3,amarks4,amarks;
      
      
    Foptions(){
        setLayout(null);
        
        JLabel text=new JLabel("Faculty Options");
        text.setFont(new Font("Osward",Font.BOLD ,30));
        text.setBounds(150,40,400,40);
        add(text);
        
        
       astudent =new JButton("Add Students");
        astudent.setBounds(100,150,150,50);
        astudent.setBackground(new Color(192, 248, 252)); 
        astudent.addActionListener(this);
        add(astudent);
        
        amarks1 =new JButton("Update Mid-1 Marks");
        amarks1.setBounds(300,150,150,50);
        amarks1.setBackground(new Color(192, 248, 252)); 
        amarks1.addActionListener(this);
        add(amarks1);
        
         amarks2 =new JButton("Update Mid-2 Marks");
        amarks2.setBounds(100,250,150,50);
        amarks2.setBackground(new Color(192, 248, 252)); 
        amarks2.addActionListener(this);
        add(amarks2);
        
         amarks3 =new JButton("Student Attendance");
        amarks3.setBounds(300,250,150,50);
        amarks3.setBackground(new Color(192, 248, 252)); 
        amarks3.addActionListener(this);
        add(amarks3);
        
        amarks4 =new JButton("Exam Dates");
        amarks4.setBounds(100,350,150,50);
        amarks4.setBackground(new Color(192, 248, 252)); 
        amarks4.addActionListener(this);
        add(amarks4);
        
         
        
         amarks =new JButton("Semister Marks");   
        amarks.setBounds(300,350,150,50);
        amarks.setBackground(new Color(192, 248, 252)); 
        amarks.addActionListener(this);
        add(amarks);
        
        
        
       getContentPane().setBackground(new Color(247, 247, 240));
        setSize(600,600);
        setLocation(400,150);
        setVisible(true);
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
    
     public void actionPerformed(ActionEvent ae)
     {
         if(ae.getSource() == astudent)
         {
             setVisible(false);
             new AddStudent().setVisible(true);
         }
         else if(ae.getSource()==amarks1)
         {
             setVisible(false);
             new MidOne().setVisible(true);
           
         }
         else if(ae.getSource()==amarks2)
         {
             setVisible(false);
             new MidTwo().setVisible(true);
           
         }
         else if(ae.getSource()==amarks3)
         {
             setVisible(false);
             new sattendance().setVisible(true);
           
         }
         else if(ae.getSource()==amarks4)
         {
             setVisible(false);
             new Examdates().setVisible(true);
           
         }
         
          else if(ae.getSource()==amarks)
         {
             setVisible(false);
             new Semister().setVisible(true);
           
         }
         
     }
    
    public static void main(String args[]){
        new Foptions();
    }
    
}

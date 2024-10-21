package studentportal;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.ResultSet;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.graphics.image.LosslessFactory;


public class Hallticket extends JFrame implements ActionListener{
    String roll,sem;
    JButton print,back;
    Hallticket(String roll,String sem){
        this.roll=roll;
        this.sem=sem;
        
        setLayout(null);
        
        JLabel text1=new JLabel("Hall Ticket");
        text1.setFont(new Font("Raleway",Font.BOLD,20));
        text1.setBounds(250,30,150,30);
        add(text1);
        
        
        JLabel name = new JLabel();
        name.setBounds(60, 70, 300, 20);
        name.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(name);
        
        JLabel lblrollno = new JLabel("Roll Number:       "+ roll );
        lblrollno.setBounds(300, 70, 500, 20);
        lblrollno.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(lblrollno);
        
        JLabel branch = new JLabel("Branch:");
        branch.setBounds(60, 110, 300, 20);
        branch.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(branch);
        
        JLabel lblsemester = new JLabel("Semister:           "+sem);
        lblsemester.setBounds(300, 110, 500, 20);
        lblsemester.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(lblsemester);
        
        
        JLabel sub = new JLabel("Subjects");
        sub.setBounds(100, 160, 500, 20);
        sub.setFont(new Font("Tahoma", Font.BOLD, 18));
        add(sub);
        
        JLabel mark = new JLabel("Dates");
        mark.setBounds(250, 160, 500, 20);
        mark.setFont(new Font("Tahoma", Font.BOLD, 18));
        add(mark);
        
        JLabel grade = new JLabel("Signature");
        grade.setBounds(380, 160, 500, 20);
        grade.setFont(new Font("Tahoma", Font.BOLD, 18));
        add(grade);
        
        
        
        
        JLabel sub1 = new JLabel();
        sub1.setBounds(100, 200, 500, 20);
        sub1.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(sub1);
        
        JLabel sub2 = new JLabel();
        sub2.setBounds(100, 230, 500, 20);
        sub2.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(sub2);
        
        JLabel sub3 = new JLabel();
        sub3.setBounds(100, 260, 500, 20);
        sub3.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(sub3);
        
        JLabel sub4 = new JLabel();
        sub4.setBounds(100, 290, 500, 20);
        sub4.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(sub4);
        
        JLabel sub5 = new JLabel();
        sub5.setBounds(100, 320, 500, 20);
        sub5.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(sub5);
        
        JLabel sub6 = new JLabel();
        sub6.setBounds(100, 350, 500, 20);
        sub6.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(sub6);
        
        JLabel sub7 = new JLabel();
        sub7.setBounds(100, 380, 500, 20);
        sub7.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(sub7);
        
        JLabel sub8 = new JLabel();
        sub8.setBounds(100, 410, 500, 20);
        sub8.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(sub8);
        
        
         print = new JButton("Print");
        print.setBounds(130, 480, 150, 25);
        print.setBackground(Color.BLACK);
        print.setForeground(Color.WHITE);
        print.addActionListener(this);
        print.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(print);
        
        back = new JButton("Back");
        back.setBounds(320, 480, 150, 25);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        back.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(back);
        
        
         try{
             
             Conn c1=new Conn();
            ResultSet rs = c1.s.executeQuery("select * from student where Roll_No = '"+roll+"'  ");
           while(rs.next())
           {
               name.setText("Name:  "+rs.getString("Name"));
               branch.setText("Branch:  "+rs.getString("Branch"));
           }
           
           
           if(sem =="1st Semester"){
                Conn c = new Conn();
            
            ResultSet rs1 = c.s.executeQuery("select * from exams where  Semister ='"+sem+"' ");
            while(rs1.next()) {
                sub1.setText(rs1.getString("s1"));
                sub2.setText(rs1.getString("s2"));
                sub3.setText(rs1.getString("s3"));
                sub4.setText(rs1.getString("s4"));
                sub5.setText(rs1.getString("s5"));
                sub6.setText(rs1.getString("s6"));
                sub7.setText(rs1.getString("s7"));
                sub8.setText(rs1.getString("s8"));
                
            }
             ResultSet rs2 = c.s.executeQuery("select * from examd where  Semister ='"+sem+"'  ");
            while(rs2.next()) {
                sub1.setText(sub1.getText() + "            " + rs2.getString("date1"));
                sub2.setText(sub2.getText() + "            " + rs2.getString("date2"));
                sub3.setText(sub3.getText() + "                " + rs2.getString("date3"));
                sub4.setText(sub4.getText() + "                 " + rs2.getString("date4"));
                sub5.setText(sub5.getText() + "                  " + rs2.getString("date5"));
                sub6.setText(sub6.getText() + "                  " + rs2.getString("date6"));
                sub7.setText(sub7.getText() + "      " + rs2.getString("date7"));
                sub8.setText(sub8.getText() + "      " + rs2.getString("date8"));
                
               // lblsemester.setText("Semester:              " + rs2.getString("Semister"));
            }
           }
    
        }
        catch(Exception e){
    
        }
        
        getContentPane().setBackground(new Color(247, 247, 240));
        setSize(600,600);
        setLocation(400,150);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==print){
             BufferedImage image = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_RGB);
            Graphics2D g2d = image.createGraphics();
            paint(g2d);
            g2d.dispose();
            
            int newWidth = 500;  
            int newHeight = 600;  
            BufferedImage resizedImage = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_RGB);
            Graphics2D g = resizedImage.createGraphics();
            g.drawImage(image, 0,0, newWidth, newHeight, null);
            g.dispose();
            
             String desktopPath = System.getProperty("user.home") + File.separator ;
             String fileName = JOptionPane.showInputDialog(null, "Enter the file name for the PDF with .pdf:", "Save PDF", JOptionPane.PLAIN_MESSAGE);
      
            String pdfPath =desktopPath + fileName;
            // String pdfPath = desktopPath + fileName + ".pdf";
            
            
             PDDocument document = new PDDocument();
             PDPage page = new PDPage(PDRectangle.A4);
             document.addPage(page);
                  
            try{
           
            PDPageContentStream contentStream = new PDPageContentStream(document, page);
            contentStream.drawImage(LosslessFactory.createFromImage(document, resizedImage), 50, 200, resizedImage.getWidth(), resizedImage.getHeight());
            contentStream.close();

            document.save(pdfPath);
            document.close();
            System.out.println("PDF created successfully using PDFBox: " + pdfPath);
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
        new Hallticket("","");
    }
    
}

package studentportal;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.ResultSet;
import javax.swing.*;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.graphics.image.LosslessFactory;


public class Consoldatememo extends JFrame implements ActionListener {
    
    String roll;
    JButton print;
    
    Consoldatememo(String roll){
        this.roll=roll;
        //this.sem=sem;
        setLayout(null);
        
        JLabel text=new JLabel("Consoldate Memo");
        text.setFont(new Font("Osward",Font.BOLD ,20));
        text.setBounds(310,20,500,30);
        add(text);
        
        JLabel name=new JLabel();
        name.setFont(new Font("Osward",Font.BOLD ,15));
        name.setBounds(70,40,500,30);
        add(name);
        
        JLabel branch=new JLabel();
        branch.setFont(new Font("Osward",Font.BOLD ,15));
        branch.setBounds(300,40,500,30);
        add(branch);
        
        JLabel rollno=new JLabel("Roll No:"+roll);
        rollno.setFont(new Font("Osward",Font.BOLD ,15));
        rollno.setBounds(70,70,500,30);
        add(rollno);
        
        JLabel col=new JLabel("College Name: Sreenidhi Institute Of Science and Technology");
        col.setFont(new Font("Osward",Font.BOLD ,15));
        col.setBounds(300,70,800,30);
        add(col);
        
        JLabel text1=new JLabel("Semister 1");
        text1.setFont(new Font("Osward",Font.BOLD ,15));
        text1.setBounds(105,100,500,30);
        add(text1);
        
        JLabel sub = new JLabel("Subjects");
        sub.setBounds(70, 130, 500, 20);
        sub.setFont(new Font("Tahoma", Font.PLAIN, 15));
        add(sub);
        
        JLabel point = new JLabel("Points");
        point.setBounds(170, 130, 500, 20);
        point.setFont(new Font("Tahoma", Font.PLAIN, 15));
        add(point);
        
         JLabel text2=new JLabel("Semister 2");
        text2.setFont(new Font("Osward",Font.BOLD ,15));
        text2.setBounds(300,100,500,30);
        add(text2);
        
        JLabel subb = new JLabel("Subjects");
        subb.setBounds(270, 130, 500, 20);
        subb.setFont(new Font("Tahoma", Font.PLAIN, 15));
        add(subb);
        
        JLabel pointt = new JLabel("Points");
        pointt.setBounds(370, 130, 500, 20);
        pointt.setFont(new Font("Tahoma", Font.PLAIN, 15));
        add(pointt);
        
         JLabel text3=new JLabel("Semister 3");
        text3.setFont(new Font("Osward",Font.BOLD ,15));
        text3.setBounds(500,100,500,30);
        add(text3);
        
        JLabel suub = new JLabel("Subjects");
        suub.setBounds(470, 130, 500, 20);
        suub.setFont(new Font("Tahoma", Font.PLAIN, 15));
        add(suub);
        
        JLabel pointtt = new JLabel("Points");
        pointtt.setBounds(570, 130, 500, 20);
        pointtt.setFont(new Font("Tahoma", Font.PLAIN, 15));
        add(pointtt);
        
        JLabel text4=new JLabel("Semister 4");
        text4.setFont(new Font("Osward",Font.BOLD ,15));
        text4.setBounds(700,100,500,30);
        add(text4);
        
        JLabel suub1 = new JLabel("Subjects");
        suub1.setBounds(670, 130, 500, 20);
        suub1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        add(suub1);
        
        JLabel pointtt1 = new JLabel("Points");
        pointtt1.setBounds(770, 130, 500, 20);
        pointtt1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        add(pointtt1);
        
         JLabel sub1 = new JLabel();
        sub1.setBounds(70, 150, 850, 20);
        sub1.setFont(new Font("Tahoma", Font.PLAIN, 13));
        add(sub1);
        
      
        
        JLabel sub2 = new JLabel();
        sub2.setBounds(70, 170, 850, 20);
        sub2.setFont(new Font("Tahoma", Font.PLAIN, 13));
        add(sub2);
        
        JLabel sub3 = new JLabel();
        sub3.setBounds(70, 190, 850, 20);
        sub3.setFont(new Font("Tahoma", Font.PLAIN, 13));
        add(sub3);
        
        JLabel sub4 = new JLabel();
        sub4.setBounds(70, 210, 850, 20);
        sub4.setFont(new Font("Tahoma", Font.PLAIN, 13));
        add(sub4);
        
        JLabel sub5 = new JLabel();
        sub5.setBounds(70, 230, 850, 20);
        sub5.setFont(new Font("Tahoma", Font.PLAIN, 13));
        add(sub5);
        
        JLabel sub6 = new JLabel();
        sub6.setBounds(70, 250, 850, 20);
        sub6.setFont(new Font("Tahoma", Font.PLAIN, 13));
        add(sub6);
        
        JLabel sub7 = new JLabel();
        sub7.setBounds(70, 270, 850, 20);
        sub7.setFont(new Font("Tahoma", Font.PLAIN, 13));
        add(sub7);
        
        JLabel sub8 = new JLabel();
        sub8.setBounds(70, 290, 850, 20);
        sub8.setFont(new Font("Tahoma", Font.PLAIN, 13));
        add(sub8);
        
        JLabel sub9 = new JLabel();
        sub9.setBounds(70, 310, 850, 20);
        sub9.setFont(new Font("Tahoma", Font.BOLD, 13));
        add(sub9);
        
        JLabel text5=new JLabel("Semister 5");
        text5.setFont(new Font("Osward",Font.BOLD ,15));
        text5.setBounds(105,350,500,30);
        add(text5);
        
        JLabel subb1 = new JLabel("Subjects");
        subb1.setBounds(70, 380, 500, 20);
        subb1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        add(subb1);
        
        JLabel point1 = new JLabel("Points");
        point1.setBounds(170, 380, 500, 20);
        point1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        add(point1);
        
         JLabel text6=new JLabel("Semister 6");
        text6.setFont(new Font("Osward",Font.BOLD ,15));
        text6.setBounds(300,350,500,30);
        add(text6);
        
        JLabel subb2 = new JLabel("Subjects");
        subb2.setBounds(270, 380, 500, 20);
        subb2.setFont(new Font("Tahoma", Font.PLAIN, 15));
        add(subb2);
        
        JLabel pointt1 = new JLabel("Points");
        pointt1.setBounds(370, 380, 500, 20);
        pointt1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        add(pointt1);
        
         JLabel text7=new JLabel("Semister 7");
        text7.setFont(new Font("Osward",Font.BOLD ,15));
        text7.setBounds(500,350,500,30);
        add(text7);
        
        JLabel suub3 = new JLabel("Subjects");
        suub3.setBounds(470, 380, 500, 20);
        suub3.setFont(new Font("Tahoma", Font.PLAIN, 15));
        add(suub3);
        
        JLabel pointt2 = new JLabel("Points");
        pointt2.setBounds(570, 380, 500, 20);
        pointt2.setFont(new Font("Tahoma", Font.PLAIN, 15));
        add(pointt2);
        
        JLabel text8=new JLabel("Semister 8");
        text8.setFont(new Font("Osward",Font.BOLD ,15));
        text8.setBounds(700,350,500,30);
        add(text8);
        
        JLabel suub4 = new JLabel("Subjects");
        suub4.setBounds(670, 380, 500, 20);
        suub4.setFont(new Font("Tahoma", Font.PLAIN, 15));
        add(suub4);
        
        JLabel pointt3 = new JLabel("Points");
        pointt3.setBounds(770, 380, 500, 20);
        pointt3.setFont(new Font("Tahoma", Font.PLAIN, 15));
        add(pointt3);
        
        
          JLabel sub11 = new JLabel();
        sub11.setBounds(70, 400, 850, 20);
        sub11.setFont(new Font("Tahoma", Font.PLAIN, 13));
        add(sub11);
        
      
        
        JLabel sub22 = new JLabel();
        sub22.setBounds(70, 420, 850, 20);
        sub22.setFont(new Font("Tahoma", Font.PLAIN, 13));
        add(sub22);
        
        JLabel sub33 = new JLabel();
        sub33.setBounds(70, 440, 850, 20);
        sub33.setFont(new Font("Tahoma", Font.PLAIN, 13));
        add(sub33);
        
        JLabel sub44 = new JLabel();
        sub44.setBounds(70, 460, 850, 20);
        sub44.setFont(new Font("Tahoma", Font.PLAIN, 13));
        add(sub44);
        
        JLabel sub55 = new JLabel();
        sub55.setBounds(70, 480, 850, 20);
        sub55.setFont(new Font("Tahoma", Font.PLAIN, 13));
        add(sub55);
        
        JLabel sub66 = new JLabel();
        sub66.setBounds(70, 500, 850, 20);
        sub66.setFont(new Font("Tahoma", Font.PLAIN, 13));
        add(sub66);
        
        JLabel sub77 = new JLabel();
        sub77.setBounds(70, 520, 850, 20);
        sub77.setFont(new Font("Tahoma", Font.PLAIN, 13));
        add(sub77);
        
        JLabel sub88 = new JLabel();
        sub88.setBounds(70, 540, 850, 20);
        sub88.setFont(new Font("Tahoma", Font.PLAIN, 13));
        add(sub88);
        
        JLabel sub99 = new JLabel();
        sub99.setBounds(70, 560, 850, 20);
        sub99.setFont(new Font("Tahoma", Font.BOLD, 13));
        add(sub99);
        
        print = new JButton("Print");
        print.setBounds(350, 650, 120, 25);
        print.setBackground(Color.BLACK);
        print.setForeground(Color.WHITE);
        print.addActionListener(this);
        print.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(print);
        
        try{
            String sem1=(String)""+"1st Semester";
            String sem2=(String)""+"2nd Semester";
            String sem3=(String)""+"3rd Semester";
            String sem4=(String)""+"4th Semester";
            String sem5=(String)""+"5th Semester";
            String sem6=(String)""+"6th Semester";
            String sem7=(String)""+"7th Semester";
            String sem8=(String)""+"8th Semester";
            Conn c = new Conn();
            
            ResultSet rs = c.s.executeQuery("select * from student where Roll_No = '"+roll+"'  ");
           while(rs.next())
           {
               name.setText("Name:  "+rs.getString("Name"));
               branch.setText("Branch:  "+rs.getString("Branch"));
           }
            
            ResultSet rs1 = c.s.executeQuery("select * from sem where Roll_No = '"+roll+"' and Semister='"+sem1+"' ");
            while(rs1.next()) {
                sub1.setText(rs1.getString("sub1"));
                sub2.setText(rs1.getString("sub2"));
                sub3.setText(rs1.getString("sub3"));
                sub4.setText(rs1.getString("sub4"));
                sub5.setText(rs1.getString("sub5"));
                sub6.setText(rs1.getString("sub6"));
                sub7.setText(rs1.getString("lab1"));
                sub8.setText(rs1.getString("lab2"));
                
            }
            ResultSet rs2 = c.s.executeQuery("select * from points where Roll_No = '"+roll+"' and Semister ='"+sem1+"'  ");
            while(rs2.next()) {
                sub1.setText(sub1.getText() + "               " + rs2.getString("p1"));
                sub2.setText(sub2.getText() + "               " + rs2.getString("p2"));
                sub3.setText(sub3.getText() + "                   " + rs2.getString("p3"));
                sub4.setText(sub4.getText() + "                     " + rs2.getString("p4"));
                sub5.setText(sub5.getText() + "                     " + rs2.getString("p5"));
                sub6.setText(sub6.getText() + "                      " + rs2.getString("p6"));
                sub7.setText(sub7.getText() + "         " + rs2.getString("p7"));
                sub8.setText(sub8.getText() + "        " + rs2.getString("p8"));
                sub9.setText("SGPA                "+rs2.getString("SGPA"));
            
            }
            ResultSet rs3 = c.s.executeQuery("select * from sem where Roll_No = '"+roll+"' and Semister ='"+sem2+"'  ");
            while(rs3.next()) {
                sub1.setText(sub1.getText() + "               " + rs3.getString("sub1"));
                sub2.setText(sub2.getText() + "               " + rs3.getString("sub2"));
                sub3.setText(sub3.getText() + "               " + rs3.getString("sub3"));
                sub4.setText(sub4.getText() + "               " + rs3.getString("sub4"));
                sub5.setText(sub5.getText() + "               " + rs3.getString("sub5"));
                sub6.setText(sub6.getText() + "               " + rs3.getString("sub6"));
                sub7.setText(sub7.getText() + "              " + rs3.getString("lab1"));
                sub8.setText(sub8.getText() + "               " + rs3.getString("lab2"));
                
               
               // lblsemester.setText("Semester:              " + rs2.getString("Semister"));
            }
            ResultSet rs4 = c.s.executeQuery("select * from points where Roll_No = '"+roll+"' and Semister ='"+sem2+"'  ");
            while(rs4.next()) {
                sub1.setText(sub1.getText() + "         " + rs4.getString("p1"));
                sub2.setText(sub2.getText() + "                   " + rs4.getString("p2"));
                sub3.setText(sub3.getText() + "                   " + rs4.getString("p3"));
                sub4.setText(sub4.getText() + "                    " + rs4.getString("p4"));
                sub5.setText(sub5.getText() + "                        " + rs4.getString("p5"));
                sub6.setText(sub6.getText() + "                  " + rs4.getString("p6"));
                sub7.setText(sub7.getText() + "            " + rs4.getString("p7"));
                sub8.setText(sub8.getText() + "             " + rs4.getString("p8"));
                sub9.setText(sub9.getText()+ "              SGPA                   "+rs4.getString("SGPA"));
            
            }
            
            ResultSet rs5 = c.s.executeQuery("select * from sem where Roll_No = '"+roll+"' and Semister ='"+sem3+"'  ");
            while(rs5.next()) {
                sub1.setText(sub1.getText() + "                       " + rs5.getString("sub1"));
                sub2.setText(sub2.getText() + "                       " + rs5.getString("sub2"));
                sub3.setText(sub3.getText() + "                       " + rs5.getString("sub3"));
                sub4.setText(sub4.getText() + "                       " + rs5.getString("sub4"));
                sub5.setText(sub5.getText() + "                        " + rs5.getString("sub5"));
                sub6.setText(sub6.getText() + "                      " + rs5.getString("sub6"));
                sub7.setText(sub7.getText() + "                        " + rs5.getString("lab1"));
                sub8.setText(sub8.getText() + "                       " + rs5.getString("lab2"));
                
               
               // lblsemester.setText("Semester:              " + rs2.getString("Semister"));
            }
            ResultSet rs6 = c.s.executeQuery("select * from points where Roll_No = '"+roll+"' and Semister ='"+sem3+"'  ");
            while(rs6.next()) {
                sub1.setText(sub1.getText() + "                   " + rs6.getString("p1"));
                sub2.setText(sub2.getText() + "                    " + rs6.getString("p2"));
                sub3.setText(sub3.getText() + "                    " + rs6.getString("p3"));
                sub4.setText(sub4.getText() + "                   " + rs6.getString("p4"));
                sub5.setText(sub5.getText() + "                     " + rs6.getString("p5"));
                sub6.setText(sub6.getText() + "            " + rs6.getString("p6"));
                sub7.setText(sub7.getText() + "              " + rs6.getString("p7"));
                sub8.setText(sub8.getText() + "               " + rs6.getString("p8"));
                sub9.setText(sub9.getText()+ "                    SGPA               "+rs6.getString("SGPA"));
            
            }
            
             ResultSet rs7 = c.s.executeQuery("select * from sem where Roll_No = '"+roll+"' and Semister ='"+sem4+"'  ");
            while(rs7.next()) {
                sub1.setText(sub1.getText() + "                     " + rs7.getString("sub1"));
                sub2.setText(sub2.getText() + "                       " + rs7.getString("sub2"));
                sub3.setText(sub3.getText() + "                       " + rs7.getString("sub3"));
                sub4.setText(sub4.getText() + "                      " + rs7.getString("sub4"));
                sub5.setText(sub5.getText() + "                       " + rs7.getString("sub5"));
                sub6.setText(sub6.getText() + "                       " + rs7.getString("sub6"));
                sub7.setText(sub7.getText() + "                      " + rs7.getString("lab1"));
                sub8.setText(sub8.getText() + "                      " + rs7.getString("lab2"));
                
               
               // lblsemester.setText("Semester:              " + rs2.getString("Semister"));
            }
            ResultSet rs8 = c.s.executeQuery("select * from points where Roll_No = '"+roll+"' and Semister ='"+sem4+"'  ");
            while(rs8.next()) {
                sub1.setText(sub1.getText() + "                       " + rs8.getString("p1"));
                sub2.setText(sub2.getText() + "                    " + rs8.getString("p2"));
                sub3.setText(sub3.getText() + "     " + rs8.getString("p3"));
                sub4.setText(sub4.getText() + "                     " + rs8.getString("p4"));
                sub5.setText(sub5.getText() + "                        " + rs8.getString("p5"));
                sub6.setText(sub6.getText() + "                        " + rs8.getString("p6"));
                sub7.setText(sub7.getText() + "                 " + rs8.getString("p7"));
                sub8.setText(sub8.getText() + "                 " + rs8.getString("p8"));
                sub9.setText(sub9.getText()+ "                     SGPA                   "+rs8.getString("SGPA"));
            
            }
            
            
            ResultSet rs9 = c.s.executeQuery("select * from sem where Roll_No = '"+roll+"' and Semister='"+sem5+"' ");
            while(rs9.next()) {
                sub11.setText(rs9.getString("sub1"));
                sub22.setText(rs9.getString("sub2"));
                sub33.setText(rs9.getString("sub3"));
                sub44.setText(rs9.getString("sub4"));
                sub55.setText(rs9.getString("sub5"));
                sub66.setText(rs9.getString("sub6"));
                sub77.setText(rs9.getString("lab1"));
                sub88.setText(rs9.getString("lab2"));
                
            }
            ResultSet rs10 = c.s.executeQuery("select * from points where Roll_No = '"+roll+"' and Semister ='"+sem5+"'  ");
            while(rs10.next()) {
                sub11.setText(sub11.getText() + "                   " + rs10.getString("p1"));
                sub22.setText(sub22.getText() + "                   " + rs10.getString("p2"));
                sub33.setText(sub33.getText() + "                    " + rs10.getString("p3"));
                sub44.setText(sub44.getText() + "                    " + rs10.getString("p4"));
                sub55.setText(sub55.getText() + "                      " + rs10.getString("p5"));
                sub66.setText(sub66.getText() + "                    " + rs10.getString("p6"));
                sub77.setText(sub77.getText() + "             " + rs10.getString("p7"));
                sub88.setText(sub88.getText() + "                " + rs10.getString("p8"));
                sub99.setText("SGPA               "+rs10.getString("SGPA"));
            
            }
            ResultSet rs11 = c.s.executeQuery("select * from sem where Roll_No = '"+roll+"' and Semister ='"+sem6+"'  ");
            while(rs11.next()) {
                sub11.setText(sub11.getText() + "                 " + rs11.getString("sub1"));
                sub22.setText(sub22.getText() + "                  " + rs11.getString("sub2"));
                sub33.setText(sub33.getText() + "                 " + rs11.getString("sub3"));
                sub44.setText(sub44.getText() + "                  " + rs11.getString("sub4"));
                sub55.setText(sub55.getText() + "                  " + rs11.getString("sub5"));
                sub66.setText(sub66.getText() + "                  " + rs11.getString("sub6"));
                sub77.setText(sub77.getText() + "                " + rs11.getString("lab1"));
                sub88.setText(sub88.getText() + "                  " + rs11.getString("lab2"));
                
               
               // lblsemester.setText("Semester:              " + rs2.getString("Semister"));
            }
            ResultSet rs12 = c.s.executeQuery("select * from points where Roll_No = '"+roll+"' and Semister ='"+sem6+"'  ");
            while(rs12.next()) {
                sub11.setText(sub11.getText() + "                      " + rs12.getString("p1"));
                sub22.setText(sub22.getText() + "                    " + rs12.getString("p2"));
                sub33.setText(sub33.getText() + "        " + rs12.getString("p3"));
                sub44.setText(sub44.getText() + "         " + rs12.getString("p4"));
                sub55.setText(sub55.getText() + "        " + rs12.getString("p5"));
                sub66.setText(sub66.getText() + "          " + rs12.getString("p6"));
                sub77.setText(sub77.getText() + "                       " + rs12.getString("p7"));
                sub88.setText(sub88.getText() + "                       " + rs12.getString("p8"));
                sub99.setText(sub99.getText()+ "               SGPA                   "+rs12.getString("SGPA"));
            
            }
            
            ResultSet rs13 = c.s.executeQuery("select * from sem where Roll_No = '"+roll+"' and Semister ='"+sem7+"'  ");
            while(rs13.next()) {
                sub11.setText(sub11.getText() + "                     " + rs13.getString("sub1"));
                sub22.setText(sub22.getText() + "                     " + rs13.getString("sub2"));
                sub33.setText(sub33.getText() + "                     " + rs13.getString("sub3"));
                sub44.setText(sub44.getText() + "                     " + rs13.getString("sub4"));
                sub55.setText(sub55.getText() + "                     " + rs13.getString("sub5"));
                sub66.setText(sub66.getText() + "                     " + rs13.getString("sub6"));
                sub77.setText(sub77.getText() + "                     " + rs13.getString("lab1"));
                sub88.setText(sub88.getText() + "                     " + rs13.getString("lab2"));
                
               
               // lblsemester.setText("Semester:              " + rs2.getString("Semister"));
            }
            ResultSet rs14 = c.s.executeQuery("select * from points where Roll_No = '"+roll+"' and Semister ='"+sem7+"'  ");
            while(rs14.next()) {
                sub11.setText(sub11.getText() + "                          " + rs14.getString("p1"));
                sub22.setText(sub22.getText() + "                          " + rs14.getString("p2"));
                sub33.setText(sub33.getText() + "                          " + rs14.getString("p3"));
                sub44.setText(sub44.getText() + "                   " + rs14.getString("p4"));
                sub55.setText(sub55.getText() + "    " + rs14.getString("p5"));
                sub66.setText(sub66.getText() + "     " + rs14.getString("p6"));
                sub77.setText(sub77.getText() + "                  " + rs14.getString("p7"));
                sub88.setText(sub88.getText() + "                    " + rs14.getString("p8"));
                sub99.setText(sub99.getText()+ "                   SGPA                      "+rs14.getString("SGPA"));
            
            }
            ResultSet rs15 = c.s.executeQuery("select * from midones where Roll_No = '"+roll+"' and Semister ='"+sem8+"'  ");
            while(rs15.next()){
                sub11.setText(sub11.getText() + "                 " + rs15.getString("sub1"));
            }
            ResultSet rs16 = c.s.executeQuery("select * from midonem where Roll_No = '"+roll+"' and Semister ='"+sem8+"'  ");
            while(rs16.next()){
                sub11.setText(sub11.getText() + "                 " + rs16.getString("m1"));
                sub99.setText(sub99.getText()+ "               SGPA                  "+rs16.getString("m1"));
            }
            
  
            
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        
        getContentPane().setBackground(new Color(247, 247, 240));
        setSize(900,800);
        setLocation(400,20);
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
    }
    
    
    public static void main(String args[]){
        new Consoldatememo("");
    }
    
}

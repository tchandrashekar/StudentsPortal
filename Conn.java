
package studentportal;

import java.sql.*;


public class Conn {
    Connection c;
     Statement s;
    
    public Conn(){
       
        try{
            //register
            //Class.forName(com.mysql.cj.jdbc.Driver);
            //connection
            c=DriverManager.getConnection("jdbc:mysql:///studentsportal","root","chandrashekar7");
            s =c.createStatement();
         
           
        }
        catch(Exception e){
            System.out.println(e);
        }    
    }
    
}

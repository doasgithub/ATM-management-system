
package bank.management.system1;
import java.sql.*;

public class Conn {
    Connection c;
    Statement s;
    public Conn(){
       try{
           c = DriverManager.getConnection("jdbc:mysql:/// bankmanagementsystem", "root", "ommysql");
           s = c.createStatement();
       }catch(Exception e){
          System.out.println(e);
       }
        
    }
    
}
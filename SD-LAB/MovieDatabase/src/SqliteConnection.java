import java.sql.*;
import javax.swing.*;

public class SqliteConnection {
    Connection conn = null;
    public static Connection dbConnector(){
        try{
         Class.forName("org.sqlite.JDBC");
         Connection conn = DriverManager.getConnection("jdbc:sqlite:D:\\SD-LAB\\MovieDatabase\\Movie.sqlite");
          //JOptionPane.showMessageDialog(null,"Connection successful");
         return conn;
        }catch(Exception e){
      JOptionPane.showMessageDialog(null,e);
      return null;
    }
        
    
    
}
}

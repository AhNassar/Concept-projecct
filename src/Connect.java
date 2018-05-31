import java.sql.*;
import javax.swing.JOptionPane;
public class Connect {
    java.sql.Connection conn ;

    public static java.sql.Connection con() {
    try{
        Class.forName("org.sqlite.JDBC");
        java.sql.Connection conn = DriverManager.getConnection("jdbc:sqlite:src\\DataBase\\Student app.db");
        return conn ;
    }
    catch(Exception e){
        
        JOptionPane.showMessageDialog(null,e);
        return null;
    }
    }
   
    
    
}



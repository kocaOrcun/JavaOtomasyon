package jodev;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHelper {
    
    private static Connection connection;

   public static Connection getConnection() {
           try { 
               Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
               Connection connection = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\orcun\\OneDrive\\Masaüstü\\jOdev\\1.accdb");
           } catch (ClassNotFoundException | SQLException e) {
               e.printStackTrace();
           }
       
       return connection;
   }
    
}



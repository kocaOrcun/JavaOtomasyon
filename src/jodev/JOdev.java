package jodev;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JOdev {
    
    public static void main(String[] args) {
        IsverenKayit isverenEkle = new IsverenKayit();
        HizmetverenKayit hizmetverenEkle = new HizmetverenKayit();
        isverenEkle.kayit();
       hizmetverenEkle.kayit();
        
        
    }
    
}

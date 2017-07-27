
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DB_Controller {
    public DB_Controller()
    {
        
    }
    public Connection getConnection() throws SQLException
    {   
        Connection conn=null;
        try
        {
	Class.forName("com.mysql.jdbc.Driver");	
        String myUrl = "jdbc:mysql://localhost:3306/pharmacy?autoReconnect=true&useSSL=false";
        conn = DriverManager.getConnection(myUrl, "root", "4020172") ;
        
        }   catch (ClassNotFoundException ex) {
                Logger.getLogger(DB_Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        return conn; 
    }
}

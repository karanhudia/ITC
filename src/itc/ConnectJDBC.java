package itc;
import java.sql.*;
public class ConnectJDBC extends javax.swing.JFrame{
    public static Connection getJDBC() throws ClassNotFoundException, SQLException 
    {
        //Driver name and Database URL
        String Drivername = "com.mysql.jdbc.Driver";
        String Databaseurl = "jdbc:mysql://localhost/quotoff";
        //Username and Password
        String uname = "root";
        String pass = "12345678";
        Connection conn=null;
        Statement stmt=null;
        ResultSet rs=null;
            //1. Register/Load JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
            //2. Open a connection
            conn=DriverManager.getConnection(Databaseurl,uname,pass);
            return conn;
    }
}

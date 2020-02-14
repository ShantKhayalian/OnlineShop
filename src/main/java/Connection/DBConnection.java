import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public static Connection ConnectToData() throws ClassNotFoundException{
        Connection connection = null;
        Class.forName("com.mysql.jdbc.Driver");
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineshop_db","root","root");
        }catch (SQLException exception){
            exception.printStackTrace();
        }
        return connection;
    }

}

package connection;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement; 

public class Connect {
    private static final String DB_Driver = "com.mysql.cj.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/dbstokobat";
    private static final String User = "root";
    private static final String Password = "";

    public static Statement connection() {
        Statement statement;
        Connection connection;
        try {
            Class.forName(DB_Driver);
            connection = DriverManager.getConnection(DB_URL, User, Password);
            statement = connection.createStatement();
            return statement;
        } catch (Exception e) {
            return statement = null;
        }
    }
}
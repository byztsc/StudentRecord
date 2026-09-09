import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBConnection {
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:sqlite:students.db";
        return DriverManager.getConnection(url);
    }
}
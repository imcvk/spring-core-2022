package connection;

import java.sql.*;

public class DBConnection {
    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/springdemo", "root", "root");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
}

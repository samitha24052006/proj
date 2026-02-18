package dao;
import java.sql.*;

public class DBConnection {
    private static String url = "jdbc:mysql://localhost:3306/college_db";
    private static String user = "root";
    private static String pass = "root";

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection(url, user, pass);
        } catch(Exception e) {
            System.out.println(e);
            return null;
        }
    }
}

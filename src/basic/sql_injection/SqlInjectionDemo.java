package basic.sql_injection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class SqlInjectionDemo {
    public static void main(String[] args) throws Exception {
        String driver = "com.mysql.jdbc.Driver";
        String jdbcUrl = "jdbc:mysql://localhost:3306/sonoo";
        String useName = "root";
        String pass = "mysql123";
        Connection con= DriverManager.getConnection(
                jdbcUrl,useName,pass);
        Statement statement = con.createStatement();

    }
}

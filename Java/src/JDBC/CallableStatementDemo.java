package JDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class CallableStatementDemo {
    private static final String URL = "jdbc:mysql://localhost:3306/bootcampdb";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);

            /*
            for this we need to create a procedure in the database
            DELIMITER //
            CREATE PROCEDURE insertProduct(IN v1 INT, IN v2 VARCHAR(255), IN v3 INT)
            BEGIN
                INSERT INTO products (id, name, price) VALUES (v1, v2, v3);
            END //
             */

            CallableStatement cs = con.prepareCall("{call insertProduct(?, ?, ?)}");

            cs.setInt(1, 5);
            cs.setString(2, "Butter");
            cs.setInt(3, 50);
            cs.execute();

            System.out.println("Product inserted successfully!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

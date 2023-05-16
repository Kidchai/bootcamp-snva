package JDBC;

import java.sql.*;

public class jdbcDemo {
    private static final String URL = "jdbc:mysql://localhost:3306/bootcampdb";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    public static void main(String[] args) {
        try {
            // Step 1: Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Establish the connection to the database
            Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);

            // Step 3: Create a statement
            Statement statement = con.createStatement();

            // Step 4: Execute the query
            ResultSet rs = statement.executeQuery("SELECT * FROM products");

            // Step 5: Process the results
            while (rs.next())
                System.out.printf("%d %s %d\n", rs.getInt(1), rs.getString(2), rs.getInt(3));
            con.close();

            String updateQuery = "UPDATE products SET price = 100 WHERE id = 1";
            statement.executeUpdate(updateQuery);

            String insertQuery = "INSERT INTO products (name, price) VALUES ('Butter', 50)";
            statement.executeUpdate(insertQuery);

            String deleteQuery = "DELETE FROM products WHERE id = 3";
            statement.executeUpdate(deleteQuery);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}

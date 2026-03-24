import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class App {

    public static void main(String[] args) {

        String password = "admin123"; // Hardcoded credential

        try {
            Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test", "root", "root");

            Statement stmt = conn.createStatement();

            String userInput = "' OR '1'='1"; // Simulated input

            // SQL Injection vulnerability
            String query = "SELECT * FROM users WHERE username = '" + userInput + "'";

            stmt.executeQuery(query);

        } catch (Exception e) {
            // Empty catch block
        }

        String text = null;
        System.out.println(text.length()); // NullPointerException
    }
}

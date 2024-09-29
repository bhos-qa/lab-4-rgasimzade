import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class VulnerableCode {

    public String getUserPassword(String username) {
        String password = null;
        String query = "SELECT password FROM users WHERE username = '" + username + "'"; // Vulnerable line

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "user", "pass");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            if (resultSet.next()) {
                password = resultSet.getString("password");
            }

            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return password;
    }
}

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/jdbc_demo";
        String username = "root";
        String password = "Aditya@18";

        try {

            Connection con = DriverManager.getConnection(
                url,
                username,
                password
            );

            System.out.println("✅ Connected to MySQL!");

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery(
                "SELECT * FROM students"
            );

            while (rs.next()) {

                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");

                System.out.println(
                    id + " | " + name + " | " + age
                );
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
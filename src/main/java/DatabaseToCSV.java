import com.opencsv.CSVWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseToCSV {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/your_database";
        String user = "your_username";
        String password = "your_password";
        String outputFile = "employees_report.csv";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT id, name, department, salary FROM employees");
             CSVWriter writer = new CSVWriter(new FileWriter(outputFile))) {

            writer.writeNext(new String[]{"Employee ID", "Name", "Department", "Salary"});

            while (rs.next()) {
                String[] record = {
                        rs.getString("id"),
                        rs.getString("name"),
                        rs.getString("department"),
                        rs.getString("salary")
                };
                writer.writeNext(record);
            }

            System.out.println("CSV report generated successfully: " + outputFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

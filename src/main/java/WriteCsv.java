import com.opencsv.CSVWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteCsv {
    public static void main(String[] args) {
        String filePath = "employees.csv";

        try (CSVWriter writer = new CSVWriter(new FileWriter(filePath))) {
            String[] header = { "ID", "Name", "Department", "Salary" };
            String[] record1 = { "1", "Alice", "HR", "50000" };
            String[] record2 = { "2", "Bob", "IT", "60000" };
            String[] record3 = { "3", "Charlie", "Finance", "55000" };
            String[] record4 = { "4", "David", "Marketing", "52000" };
            String[] record5 = { "5", "Eve", "IT", "62000" };

            writer.writeNext(header);
            writer.writeNext(record1);
            writer.writeNext(record2);
            writer.writeNext(record3);
            writer.writeNext(record4);
            writer.writeNext(record5);

            System.out.println("CSV file created successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

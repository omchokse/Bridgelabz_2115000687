import com.opencsv.CSVWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EncryptCSV {
    public static void main(String[] args) {
        String filePath = "encrypted_employees.csv";

        try (CSVWriter writer = new CSVWriter(new FileWriter(filePath))) {
            String[] header = {"ID", "Name", "Department", "Encrypted Salary", "Encrypted Email"};
            String[] record1 = {"1", "Alice", "HR", AESEncryption.encrypt("50000"), AESEncryption.encrypt("alice@example.com")};
            String[] record2 = {"2", "Bob", "IT", AESEncryption.encrypt("60000"), AESEncryption.encrypt("bob@example.com")};

            writer.writeNext(header);
            writer.writeNext(record1);
            writer.writeNext(record2);

            System.out.println("Encrypted CSV file created successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

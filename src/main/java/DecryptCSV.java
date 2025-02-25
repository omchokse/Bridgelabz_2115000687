import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class DecryptCSV {
    public static void main(String[] args) {
        String filePath = "encrypted_employees.csv";

        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            List<String[]> records = reader.readAll();
            System.out.println("Decrypted Employee Data:");

            for (int i = 1; i < records.size(); i++) {
                String[] record = records.get(i);
                System.out.println("ID: " + record[0] + ", Name: " + record[1] +
                        ", Department: " + record[2] + ", Salary: " + AESEncryption.decrypt(record[3]) +
                        ", Email: " + AESEncryption.decrypt(record[4]));
            }
        } catch (IOException | CsvException e) {
            e.printStackTrace();
        }
    }
}

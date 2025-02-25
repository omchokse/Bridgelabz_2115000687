import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.regex.Pattern;

public class ValidateCSV {
    public static void main(String[] args) {
        String filePath = "employees.csv";
        Pattern emailPattern = Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
        Pattern phonePattern = Pattern.compile("^\\d{10}$");

        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            List<String[]> records = reader.readAll();

            if (records.isEmpty()) {
                System.out.println("The CSV file is empty.");
                return;
            }

            System.out.println("Validating records...");

            for (int i = 1; i < records.size(); i++) { // Assuming first row is header
                String[] record = records.get(i);

                if (record.length < 6) { // Ensure minimum required columns are present
                    System.out.println("Invalid record at line " + (i + 1) + ": Missing fields");
                    continue;
                }

                String email = record[4].trim();
                String phone = record[5].trim();

                boolean validEmail = emailPattern.matcher(email).matches();
                boolean validPhone = phonePattern.matcher(phone).matches();

                if (!validEmail || !validPhone) {
                    System.out.println("Invalid record at line " + (i + 1) + " - ID: " + record[0] + ", Name: " + record[1] +
                            (validEmail ? "" : " (Invalid Email: " + email + ")") +
                            (validPhone ? "" : " (Invalid Phone: " + phone + ")"));
                }
            }
        } catch (IOException | CsvException e) {
            System.err.println("Error reading the CSV file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class SearchCSV {
    public static void main(String[] args) {
        String filePath = "employees.csv";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employee name to search: ");
        String searchName = scanner.nextLine();
        scanner.close();

        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            List<String[]> records = reader.readAll();
            boolean found = false;

            for (int i = 1; i < records.size(); i++) {
                String[] record = records.get(i);
                if (record[1].equalsIgnoreCase(searchName)) {
                    System.out.println("Department: " + record[2] + ", Salary: " + record[3]);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Employee not found.");
            }
        } catch (IOException | CsvException e) {
            e.printStackTrace();
        }
    }
}

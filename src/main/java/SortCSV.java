import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortCSV {
    public static void main(String[] args) {
        String filePath = "employees.csv";

        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            List<String[]> records = reader.readAll();
            List<String[]> data = new ArrayList<>(records.subList(1, records.size()));

            data.sort(Comparator.comparingDouble(record -> -Double.parseDouble(record[3])));

            System.out.println("Top 5 highest-paid employees:");
            for (int i = 0; i < Math.min(5, data.size()); i++) {
                String[] record = data.get(i);
                System.out.println("ID: " + record[0] + ", Name: " + record[1] +
                        ", Department: " + record[2] + ", Salary: " + record[3]);
            }
        } catch (IOException | CsvException e) {
            e.printStackTrace();
        }
    }
}

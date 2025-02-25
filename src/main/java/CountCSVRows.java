import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class CountCSVRows {
    public static void main(String[] args) {
        String filePath = "employees.csv";
        int count = 0;

        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            List<String[]> records = reader.readAll();
            count = records.size() - 1;
            System.out.println("Number of records (excluding header): " + count);
        } catch (IOException | CsvException e) {
            e.printStackTrace();
        }
    }
}

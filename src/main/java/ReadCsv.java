import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class ReadCsv {
    public static void main(String[] args) {
        String filePath = "students.csv";

        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            List<String[]> records = reader.readAll();
            for (String[] record : records) {
                System.out.println("ID: " + record[0] + ", Name: " + record[1] +
                        ", Age: " + record[2] + ", Marks: " + record[3]);
            }
        } catch (IOException | CsvException e) {
            e.printStackTrace();
        }
    }
}

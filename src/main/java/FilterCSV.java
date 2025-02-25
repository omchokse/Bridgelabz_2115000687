import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class FilterCSV {
    public static void main(String[] args) {
        String filePath = "students.csv";

        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            List<String[]> records = reader.readAll();
            System.out.println("Students who scored more than 80:");

            for (int i = 1; i < records.size(); i++) {
                String[] record = records.get(i);
                int marks = Integer.parseInt(record[3]);
                if (marks > 80) {
                    System.out.println("ID: " + record[0] + ", Name: " + record[1] +
                            ", Age: " + record[2] + ", Marks: " + record[3]);
                }
            }
        } catch (IOException | CsvException e) {
            e.printStackTrace();
        }
    }
}

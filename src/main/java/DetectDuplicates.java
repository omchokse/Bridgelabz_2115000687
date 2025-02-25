import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DetectDuplicates {
    public static void main(String[] args) {
        String filePath = "students.csv";
        Set<String> seenIds = new HashSet<>();
        boolean hasDuplicates = false;

        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            List<String[]> records = reader.readAll();
            System.out.println("Checking for duplicate entries...");

            for (int i = 1; i < records.size(); i++) {
                String id = records.get(i)[0];

                if (seenIds.contains(id)) {
                    System.out.println("Duplicate record found: ID = " + id);
                    hasDuplicates = true;
                } else {
                    seenIds.add(id);
                }
            }

            if (!hasDuplicates) {
                System.out.println("No duplicate records found.");
            }
        } catch (IOException | CsvException e) {
            e.printStackTrace();
        }
    }
}

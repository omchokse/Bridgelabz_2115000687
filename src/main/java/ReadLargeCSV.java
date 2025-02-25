import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;

public class ReadLargeCSV {
    public static void main(String[] args) {
        String filePath = "large_students.csv";
        int batchSize = 100;
        int totalRecords = 0;

        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            String[] record;
            int count = 0;

            System.out.println("Processing records in batches of " + batchSize + "...");

            while ((record = reader.readNext()) != null) {
                if (totalRecords == 0) {
                    totalRecords++;
                    continue;
                }
                count++;
                totalRecords++;

                if (count == batchSize) {
                    System.out.println("Processed " + totalRecords + " records so far...");
                    count = 0;
                }
            }

            System.out.println("Total records processed: " + (totalRecords - 1));
        } catch (IOException | CsvValidationException e) {
            e.printStackTrace();
        }
    }
}

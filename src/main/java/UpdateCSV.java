import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;

import java.io.*;
import java.util.List;

public class UpdateCSV {
    public static void main(String[] args) {
        String inputFile = "employees.csv";
        String outputFile = "updated_employees.csv";

        try (CSVReader reader = new CSVReader(new FileReader(inputFile));
             CSVWriter writer = new CSVWriter(new FileWriter(outputFile))) {

            List<String[]> records = reader.readAll();
            writer.writeNext(records.get(0));

            for (int i = 1; i < records.size(); i++) {
                String[] record = records.get(i);
                if (record[2].equalsIgnoreCase("IT")) {
                    double salary = Double.parseDouble(record[3]);
                    salary *= 1.10;
                    record[3] = String.valueOf(salary);
                }
                writer.writeNext(record);
            }

            System.out.println("Updated CSV file saved as: " + outputFile);
        } catch (IOException | CsvException e) {
            e.printStackTrace();
        }
    }
}

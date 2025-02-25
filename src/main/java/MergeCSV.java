import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MergeCSV {
    public static void main(String[] args) {
        String file1 = "Student1.csv";
        String file2 = "Student2.csv";
        String outputFile = "merged_students.csv";

        Map<String, String[]> studentData = new HashMap<>();

        try (CSVReader reader1 = new CSVReader(new FileReader(file1));
             CSVReader reader2 = new CSVReader(new FileReader(file2));
             CSVWriter writer = new CSVWriter(new FileWriter(outputFile))) {

            List<String[]> records1 = reader1.readAll();
            List<String[]> records2 = reader2.readAll();

            if (records1.isEmpty() || records2.isEmpty()) {
                System.out.println("One or both input CSV files are empty.");
                return;
            }

            for (int i = 1; i < records1.size(); i++) {
                if (records1.get(i).length >= 3) {
                    studentData.put(records1.get(i)[0], records1.get(i));
                }
            }

            writer.writeNext(new String[]{"ID", "Name", "Age", "Marks", "Grade"});

            for (int i = 1; i < records2.size(); i++) {
                String[] record2 = records2.get(i);
                if (record2.length >= 3) {
                    String id = record2[0];
                    if (studentData.containsKey(id)) {
                        String[] student1 = studentData.get(id);
                        String[] mergedRecord = {
                                student1[0],
                                student1.length > 1 ? student1[1] : "",
                                student1.length > 2 ? student1[2] : "",
                                record2[1],
                                record2[2]
                        };
                        writer.writeNext(mergedRecord);
                    }
                }
            }

            System.out.println("Merged CSV file created successfully as: " + outputFile);
        } catch (IOException | CsvException e) {
            System.err.println("Error processing CSV files: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.opencsv.CSVWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

public class JSONToCSV {
    public static void main(String[] args) {
        String jsonFile = "students.json";
        String csvFile = "students.csv";

        try {
            ObjectMapper mapper = new ObjectMapper();
            JsonNode root = mapper.readTree(new File(jsonFile));
            CSVWriter writer = new CSVWriter(new FileWriter(csvFile));

            writer.writeNext(new String[]{"ID", "Name", "Age", "Marks"});

            for (JsonNode node : root) {
                String id = node.get("ID").asText();
                String name = node.get("Name").asText();
                String age = node.get("Age").asText();
                String marks = node.get("Marks").asText();

                writer.writeNext(new String[]{id, name, age, marks});
            }

            writer.close();
            System.out.println("Converted JSON to CSV successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.opencsv.CSVReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CSVToJSON {
    public static void main(String[] args) {
        String csvFile = "students.csv";
        String jsonFile = "students.json";

        try (CSVReader reader = new CSVReader(new FileReader(csvFile))) {
            List<String[]> records = reader.readAll();
            ObjectMapper mapper = new ObjectMapper();
            ArrayNode jsonArray = mapper.createArrayNode();

            for (int i = 1; i < records.size(); i++) {
                String[] record = records.get(i);
                ObjectNode obj = mapper.createObjectNode();
                obj.put("ID", record[0]);
                obj.put("Name", record[1]);
                obj.put("Age", record[2]);
                obj.put("Marks", record[3]);
                jsonArray.add(obj);
            }

            mapper.writeValue(new FileWriter(jsonFile), jsonArray);
            System.out.println("Converted CSV to JSON successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

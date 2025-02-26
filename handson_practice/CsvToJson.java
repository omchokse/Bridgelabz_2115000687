package org.example;

import com.opencsv.CSVReader;
import org.json.JSONArray;
import org.json.JSONObject;
import java.io.FileReader;

public class CsvToJson {
    public static void main(String[] args) {
        try {
            CSVReader reader = new CSVReader(new FileReader("data.csv"));
            String[] headers = reader.readNext(); // Read header row

            JSONArray jsonArray = new JSONArray();
            String[] row;
            while ((row = reader.readNext()) != null) {
                JSONObject obj = new JSONObject();
                for (int i = 0; i < headers.length; i++) {
                    obj.put(headers[i], row[i]);
                }
                jsonArray.put(obj);
            }

            System.out.println(jsonArray.toString(4));
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


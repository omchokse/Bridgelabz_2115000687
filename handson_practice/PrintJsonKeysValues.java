package org.example;

import org.json.JSONObject;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;

public class PrintJsonKeysValues {
    public static void main(String[] args) {
        try {
            String content = new String(Files.readAllBytes(Paths.get("data.json")));
            JSONObject json = new JSONObject(content);

            Iterator<String> keys = json.keys();
            while (keys.hasNext()) {
                String key = keys.next();
                System.out.println(key + ": " + json.get(key));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


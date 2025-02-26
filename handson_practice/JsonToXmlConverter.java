package org.example;

import org.json.JSONObject;
import org.json.XML;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonToXmlConverter {
    public static void main(String[] args) {
        try {
            String content = new String(Files.readAllBytes(Paths.get("data.json")));
            JSONObject json = new JSONObject(content);

            String xmlData = XML.toString(json);
            System.out.println(xmlData);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


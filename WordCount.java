import java.io.*;
import java.util.*;

public class WordCount {
    public static void main(String[] args) throws IOException {
        Map<String, Integer> wordMap = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader("textfile.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                for (String word : line.toLowerCase().split("\\W+")) {
                    wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
                }
            }
        }

        wordMap.entrySet().stream()
                .sorted((a, b) -> b.getValue() - a.getValue())
                .limit(5)
                .forEach(e -> System.out.println(e.getKey() + " - " + e.getValue()));
    }
}

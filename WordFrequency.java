import java.util.*;

public class WordFrequency {
    public static Map<String, Integer> countWordFrequency(String text) {
        Map<String, Integer> map = new HashMap<>();
        String[] words = text.toLowerCase().replaceAll("[^a-zA-Z]", " ").split("\\s+");
        for (String word : words) {
            if (!word.isEmpty()) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }
        return map;
    }

    public static void main(String[] args) {
        String text = "Hello world, hello Java!";
        System.out.println("Word Frequencies: " + countWordFrequency(text));
    }
}

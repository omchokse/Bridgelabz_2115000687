import java.util.*;

public class FrequencyCounter {
    public static <T> Map<T, Integer> findFrequency(List<T> list) {
        Map<T, Integer> frequencyMap = new HashMap<>();
        for (T item : list) {
            frequencyMap.put(item, frequencyMap.getOrDefault(item, 0) + 1);
        }
        return frequencyMap;
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "apple", "orange");
        System.out.println("Frequency Map: " + findFrequency(list));
    }
}

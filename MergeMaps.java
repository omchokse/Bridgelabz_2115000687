import java.util.*;

public class MergeMaps {
    public static <K> Map<K, Integer> mergeMaps(Map<K, Integer> map1, Map<K, Integer> map2) {
        Map<K, Integer> result = new HashMap<>(map1);
        for (K key : map2.keySet()) {
            result.put(key, result.getOrDefault(key, 0) + map2.get(key));
        }
        return result;
    }

    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 3);
        map2.put("C", 4);

        System.out.println("Merged Map: " + mergeMaps(map1, map2));
    }
}

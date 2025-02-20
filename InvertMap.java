import java.util.*;

public class InvertMap {
    public static <K, V> Map<V, List<K>> invert(Map<K, V> map) {
        Map<V, List<K>> inverted = new HashMap<>();
        for (K key : map.keySet()) {
            V value = map.get(key);
            inverted.computeIfAbsent(value, k -> new ArrayList<>()).add(key);
        }
        return inverted;
    }

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 1);

        System.out.println("Inverted Map: " + invert(map));
    }
}
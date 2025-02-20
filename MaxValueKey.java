import java.util.*;

public class MaxValueKey {
    public static Object findMaxKey(Map map) {
        return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
    }

    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 15);
        System.out.println("Key with highest value: " + findMaxKey(map));
    }
}

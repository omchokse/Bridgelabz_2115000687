import java.util.*;

public class SetToSortedList {
    public static List convertToSortedList(Set set) {
        List list = new ArrayList(set);
        Collections.sort(list);
        return list;
    }

    public static void main(String[] args) {
        Set set = new HashSet(Arrays.asList(5, 3, 9, 1));
        System.out.println("Sorted List: " + convertToSortedList(set));
    }
}

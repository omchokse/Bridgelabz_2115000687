import java.util.*;

public class RemoveDuplicates {
    public static List removeDuplicates(List list) {
        Set set = new LinkedHashSet(list);
        return new ArrayList(set);
    }

    public static void main(String[] args) {
        List list = Arrays.asList(3, 1, 2, 2, 3, 4);
        System.out.println("List after removing duplicates: " + removeDuplicates(list));
    }
}

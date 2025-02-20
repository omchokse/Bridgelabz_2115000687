import java.util.*;

public class CheckSubset {
    public static boolean isSubset(Set subset, Set superset) {
        return superset.containsAll(subset);
    }

    public static void main(String[] args) {
        Set subset = new HashSet(Arrays.asList(2, 3));
        Set superset = new HashSet(Arrays.asList(1, 2, 3, 4));
        System.out.println("Is subset? " + isSubset(subset, superset));
    }
}

import java.util.*;

public class CheckSetEquality {
    public static boolean areSetsEqual(Set set1, Set set2) {
        return set1.equals(set2);
    }

    public static void main(String[] args) {
        Set set1 = new HashSet(Arrays.asList(1, 2, 3));
        Set set2 = new HashSet(Arrays.asList(3, 2, 1));
        System.out.println("Are sets equal? " + areSetsEqual(set1, set2));
    }
}

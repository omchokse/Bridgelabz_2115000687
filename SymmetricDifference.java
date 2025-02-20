import java.util.*;

public class SymmetricDifference {
    public static Set symmetricDifference(Set set1, Set set2) {
        Set result = new HashSet(set1);
        result.addAll(set2);
        Set intersection = new HashSet(set1);
        intersection.retainAll(set2);
        result.removeAll(intersection);
        return result;
    }

    public static void main(String[] args) {
        Set set1 = new HashSet(Arrays.asList(1, 2, 3));
        Set set2 = new HashSet(Arrays.asList(3, 4, 5));
        System.out.println("Symmetric Difference: " + symmetricDifference(set1, set2));
    }
}

import java.util.*;

public class NthFromEnd {
    public static Object findNthFromEnd(LinkedList list, int n) {
        Iterator slow = list.iterator(), fast = list.iterator();
        for (int i = 0; i < n; i++) fast.next();
        while (fast.hasNext()) {
            slow.next();
            fast.next();
        }
        return slow.next();
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList(Arrays.asList("A", "B", "C", "D", "E"));
        int n = 2;
        System.out.println("Nth element from the end: " + findNthFromEnd(list, n));
    }
}

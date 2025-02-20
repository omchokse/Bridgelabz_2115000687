import java.util.*;

public class BinaryNumbers {

    public static void main(String[] args) {
        int n = 7;
        System.out.println("Binary Numbers: " + generateBinaryNumbers(n));
    }

    public static List generateBinaryNumbers(int n) {
        List list = new ArrayList();
        Queue queue = new LinkedList();
        queue.add("1");
        for (int i = 0; i < n; i++) {
            String binary = (String) queue.poll();
            list.add(binary);
            queue.add(binary + "0");
            queue.add(binary + "1");
        }
        return list;
    }
}

import java.util.*;

public class RotateList{
    public static List rotateList(List list, int k) {
        int n = list.size();
        List rotated = new ArrayList();
        for(int i = k; i < n; i++) rotated.add(list.get(i));
        for(int i = 0; i < k; i++) rotated.add(list.get(i));
        return rotated;
    }

    public static void main(String[] args) {
        List list = Arrays.asList(10, 20, 30, 40, 50);
        int rotateBy = 2;
        System.out.println("Rotated List: " + rotateList(list, rotateBy));
    }
}

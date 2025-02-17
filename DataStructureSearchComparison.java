import java.util.*;

public class DataStructureSearchComparison {
    public static boolean searchArray(int[] arr, int target) {
        for (int num : arr) {
            if (num == target)
                return true;
        }
        return false;
    }

    public static boolean searchHashSet(HashSet<Integer> set, int target) {
        return set.contains(target);
    }

    public static boolean searchTreeSet(TreeSet<Integer> set, int target) {
        return set.contains(target);
    }

    public static void main(String[] args) {
        int size = 1000000;
        int target = size - 1;
        int[] arr = new int[size];
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        for (int i = 0; i < size; i++) {
            arr[i] = i;
            hashSet.add(i);
            treeSet.add(i);
        }

        long start, end;

        start = System.nanoTime();
        boolean arrayResult = searchArray(arr, target);
        end = System.nanoTime();
        System.out.println("Array Search: " + (end - start) / 1e6 + " ms");

        start = System.nanoTime();
        boolean hashSetResult = searchHashSet(hashSet, target);
        end = System.nanoTime();
        System.out.println("HashSet Search: " + (end - start) / 1e6 + " ms");

        start = System.nanoTime();
        boolean treeSetResult = searchTreeSet(treeSet, target);
        end = System.nanoTime();
        System.out.println("TreeSet Search: " + (end - start) / 1e6 + " ms");
    }
}
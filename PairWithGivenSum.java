import java.util.HashMap;

class PairWithGivenSum {
    static boolean hasPairWithSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            int complement = target - num;
            if (map.containsKey(complement)) {
                System.out.println("Pair found: (" + complement + ", " + num + ")");
                return true;
            }
            map.put(num, 1);
        }

        System.out.println("No pair found");
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 15, 3, 7 };
        int target = 17;
        hasPairWithSum(arr, target);
    }
}

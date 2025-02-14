public class CountingSort {
    public static void main(String[] args) {
        int[] studentAges = { 12, 14, 11, 13, 15, 10, 18, 17, 16, 14, 13, 12 };
        countingSort(studentAges, 10, 18);
        for (int age : studentAges) {
            System.out.print(age + " ");
        }
    }

    static void countingSort(int[] arr, int min, int max) {
        int range = max - min + 1;
        int[] count = new int[range];
        int[] output = new int[arr.length];
        for (int num : arr) {
            count[num - min]++;
        }
        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i] - min] - 1] = arr[i];
            count[arr[i] - min]--;
        }
        System.arraycopy(output, 0, arr, 0, arr.length);
    }
}
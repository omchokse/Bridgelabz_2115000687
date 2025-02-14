public class SelectionSort {
    public static void main(String[] args) {
        double[] examScores = { 64.5, 34.2, 25.1, 12.9, 22.0, 11.5, 90.3 };
        selectionSort(examScores);
        for (double score : examScores) {
            System.out.print(score + " ");
        }
    }

    static void selectionSort(double[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            double temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
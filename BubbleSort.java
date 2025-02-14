public class BubbleSort {
    public static void main(String[] args) {
        int[] marks = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort(marks);
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
    }

    static void bubbleSort(int[] marks) {
        int n = marks.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (marks[j] > marks[j + 1]) {
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
}
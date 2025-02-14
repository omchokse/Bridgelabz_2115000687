public class InsertionSort {
    public static void main(String[] args) {
        int[] employeeIds = { 64, 34, 25, 12, 22, 11, 90 };
        insertionSort(employeeIds);
        for (int id : employeeIds) {
            System.out.print(id + " ");
        }
    }

    static void insertionSort(int[] employeeIds) {
        int n = employeeIds.length;
        for (int i = 1; i < n; i++) {
            int key = employeeIds[i];
            int j = i - 1;
            while (j >= 0 && employeeIds[j] > key) {
                employeeIds[j + 1] = employeeIds[j];
                j--;
            }
            employeeIds[j + 1] = key;
        }
    }
}
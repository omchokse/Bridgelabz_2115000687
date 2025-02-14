public class QuickSort {
    public static void main(String[] args) {
        double[] productPrices = { 64.5, 34.2, 25.1, 12.9, 22.0, 11.5, 90.3 };
        quickSort(productPrices, 0, productPrices.length - 1);
        for (double price : productPrices) {
            System.out.print(price + " ");
        }
    }

    static void quickSort(double[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    static int partition(double[] arr, int low, int high) {
        double pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                double temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        double temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
}
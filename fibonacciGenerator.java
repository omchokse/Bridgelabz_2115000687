import java.util.Scanner;

public class fibonacciGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();
        scanner.close();

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        int[] sequence = new int[n];
        sequence[0] = 0;
        if (n > 1)
            sequence[1] = 1;

        for (int i = 2; i < n; i++) {
            sequence[i] = sequence[i - 1] + sequence[i - 2];
        }

        for (int num : sequence) {
            System.out.print(num + " ");
        }
    }
}

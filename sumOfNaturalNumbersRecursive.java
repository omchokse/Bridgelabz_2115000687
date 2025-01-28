import java.util.Scanner;

public class sumOfNaturalNumbersRecursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("The number is not a natural number. Exiting.");
            scanner.close();
            return;
        }

        int sumRecursive = findSumRecursive(n);
        int sumFormula = calculateSumUsingFormula(n);

        System.out.println("Sum using recursion: " + sumRecursive);
        System.out.println("Sum using formula: " + sumFormula);

        if (sumRecursive == sumFormula) {
            System.out.println("Both computations are correct!");
        } else {
            System.out.println("There is a discrepancy in the results.");
        }

        scanner.close();
    }

    public static int findSumRecursive(int n) {
        if (n == 1)
            return 1;
        return n + findSumRecursive(n - 1);
    }

    public static int calculateSumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }
}

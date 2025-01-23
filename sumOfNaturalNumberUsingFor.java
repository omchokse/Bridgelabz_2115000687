import java.util.*;

public class sumOfNaturalNumberUsingFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer n: ");
        int n = sc.nextInt();

        int sumForLoop = 0;
        for (int i = 1; i <= n; i++) {
            sumForLoop += i;
        }

        int sumFormula = n * (n + 1) / 2;

        System.out.println("Sum of the first " + n + " natural numbers using for loop: " + sumForLoop);
        System.out.println("Sum of the first " + n + " natural numbers using the formula: " + sumFormula);

        if (sumForLoop == sumFormula) {
            System.out.println("The results match! Both computations are correct.");
        } else {
            System.out.println("The results do not match. There might be an error.");
        }

        sc.close();
    }
}

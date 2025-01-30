import java.util.Scanner;

public class factorialCalculator {

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");
        return scanner.nextInt();
    }

    public static void displayResult(int n, int result) {
        System.out.println("The factorial of " + n + " is: " + result);
    }

    public static void main(String[] args) {
        int number = getInput();
        int result = factorial(number);
        displayResult(number, result);
    }
}

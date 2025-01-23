import java.util.*;

public class sumUntillZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        System.out.println("Enter numbers to sum (enter 0 to stop):");
        while (true) {
            double userInput = sc.nextDouble();
            if (userInput == 0) {
                break;
            }
            total += userInput;
        }
        System.out.println("The total sum is: " + total);
        sc.close();
    }
}
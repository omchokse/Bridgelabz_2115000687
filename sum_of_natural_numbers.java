import java.util.*;

public class sum_of_natural_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num >= 0) {
            System.out.println("The sum of" + num + " natural numbers is " + ((num * (num + 1)) / 2));
        } else {
            System.out.println("The number" + num + " is not a natural number");
        }
        sc.close();
    }
}
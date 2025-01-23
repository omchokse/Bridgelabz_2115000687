import java.util.*;

public class factorialUsingFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fac = n;
        for (int i = n; i > 1; i--) {
            fac = fac * (i - 1);
        }
        System.out.println("factorial of given number is " + fac);
        sc.close();
    }
}

import java.util.*;

public class L_two_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.printf("\n%d: fizz buzz", i);
            } else if (i % 5 == 0) {
                System.out.printf("\n%d: buzz", i);
            } else if (i % 3 == 0) {
                System.out.printf("\n%d: fizz", i);
            }
        }
        System.out.printf("\n");
        sc.close();
    }
}
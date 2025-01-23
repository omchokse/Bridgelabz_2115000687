import java.util.*;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fac = num;
        while (num > 1) {
            fac = fac * (num - 1);
            num--;
        }
        System.out.println("factorial of given number is: " + fac);
        sc.close();
    }
}

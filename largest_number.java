import java.util.*;

public class largest_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println(" Is the first number the largest? YES");
            System.out.println("Is the second number the largest? NO");
            System.out.println("Is the third number the largest? NO");
        } else if (b > a && b > c) {
            System.out.println(" Is the first number the smallest? NO");
            System.out.println("Is the second number the largest? YES");
            System.out.println("Is the third number the largest? NO");
        } else {
            System.out.println(" Is the first number the smallest? NO");
            System.out.println("Is the second number the largest? NO");
            System.out.println("Is the third number the largest? YES");
        }
        sc.close();
    }
}
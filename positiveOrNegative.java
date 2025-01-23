import java.util.*;

public class positiveOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num == 0) {
            System.out.println("zero");
        } else if (num > 0) {
            System.out.println("positive");
        } else {
            System.out.println("negative");
        }
        sc.close();
    }
}

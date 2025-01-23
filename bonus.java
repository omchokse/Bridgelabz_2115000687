import java.util.*;

public class bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();
        int year_of_service = sc.nextInt();
        double bonus = 0;
        if (year_of_service > 5) {
            bonus = (0.05 * salary);
        }
        System.out.print("bonus is: " + bonus);
        sc.close();
    }
}

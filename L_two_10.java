import java.util.*;

public class L_two_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberOfChocolates = sc.nextInt();
        int numberOfChildren = sc.nextInt();

        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;

        System.out.println("The number of chocolates each child gets is " + chocolatesPerChild + " and the number of remaining chocolates are " + remainingChocolates);
    }
}

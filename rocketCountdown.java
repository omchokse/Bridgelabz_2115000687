import java.util.*;

public class rocketCountdown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting number for the countdown: ");
        int counter = sc.nextInt();
        System.out.println("Starting countdown...");
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }
        System.out.println("Liftoff");
        sc.close();
    }
}

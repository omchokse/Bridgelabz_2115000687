import java.util.Scanner;

public class L_one_14{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = scanner.nextDouble();
        double feetToYards = 1.0 / 3.0;
        double feetToMiles = 1.0 / (1760.0 * 3.0);
        double feetToCm = 30.48;

        double distanceInYards = distanceInFeet * feetToYards;
        double distanceInMiles = distanceInFeet * feetToMiles;

        double heightInCm = distanceInFeet * feetToCm;
        int heightInFeet = (int) (distanceInFeet / 12);
        double remainingInches = distanceInFeet % 12;

        System.out.println("Your height in cm is " + heightInCm + ", while in feet is " + heightInFeet + " and inches is " + remainingInches);
        
        scanner.close();
    }
}

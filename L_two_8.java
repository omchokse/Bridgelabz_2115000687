import java.util.Scanner;

public class L_two_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter your city of origin: ");
        String fromCity = sc.nextLine();
        
        System.out.print("Enter the via city: ");
        String viaCity = sc.nextLine();
        
        System.out.print("Enter your final destination city: ");
        String toCity = sc.nextLine();

        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " in miles: ");
        double fromToVia = sc.nextDouble();
        
        System.out.print("Enter the distance from " + viaCity + " to " + toCity + " in miles: ");
        double viaToFinalCity = sc.nextDouble();

        System.out.print("Enter the total time taken in hours: ");
        double timeTaken = sc.nextDouble();

        double totalDistance = fromToVia + viaToFinalCity;
        double averageSpeed = totalDistance / timeTaken;

        System.out.println("The travel details are as follows:");
        System.out.println("Name: " + name);
        System.out.println("From: " + fromCity + " to " + viaCity + " to " + toCity);
        System.out.println("Total distance: " + totalDistance + " miles");
        System.out.println("Average speed: " + averageSpeed + " miles per hour");

    }
}

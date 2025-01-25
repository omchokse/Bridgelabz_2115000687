import java.util.Scanner;

public class youngestAndTallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = { "Amar", "Akbar", "Anthony" };
        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for " + names[i] + ":");

            while (true) {
                System.out.print("Enter age: ");
                if (scanner.hasNextInt()) {
                    ages[i] = scanner.nextInt();
                    if (ages[i] > 0) {
                        break;
                    } else {
                        System.out.println("Age must be a positive number. Please try again.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a valid number.");
                    scanner.next(); // Clear invalid input
                }
            }

            while (true) {
                System.out.print("Enter height (in cm): ");
                if (scanner.hasNextDouble()) {
                    heights[i] = scanner.nextDouble();
                    if (heights[i] > 0) {
                        break;
                    } else {
                        System.out.println("Height must be a positive number. Please try again.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a valid number.");
                    scanner.next(); // Clear invalid input
                }
            }
        }
        int youngestIndex = 0;
        int tallestIndex = 0;

        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        System.out.println("\nResults:");
        System.out.println(
                "The youngest friend is " + names[youngestIndex] + " with age " + ages[youngestIndex] + " years.");
        System.out.println(
                "The tallest friend is " + names[tallestIndex] + " with height " + heights[tallestIndex] + " cm.");

        scanner.close();
    }
}
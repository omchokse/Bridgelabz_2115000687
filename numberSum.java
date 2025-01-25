import java.util.Scanner;

public class numberSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        while (true) {
            System.out.print("Enter a number: ");
            double number = scanner.nextDouble();

            if (number <= 0 || index == 10) {
                break;
            }

            numbers[index] = number;
            index++;
        }

        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        System.out.println("Numbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("Total sum: " + total);

        scanner.close();
    }
}

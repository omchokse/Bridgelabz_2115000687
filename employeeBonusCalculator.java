import java.util.Scanner;

public class employeeBonusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] salaries = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonuses = new double[10];
        double[] newSalaries = new double[10];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1) + ":");

            while (true) {
                System.out.print("Enter salary: ");
                if (scanner.hasNextDouble()) {
                    salaries[i] = scanner.nextDouble();
                    if (salaries[i] > 0) {
                        break;
                    } else {
                        System.out.println("Salary must be a positive number. Please try again.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a valid number.");
                    scanner.next(); // Clear invalid input
                }
            }

            while (true) {
                System.out.print("Enter years of service: ");
                if (scanner.hasNextDouble()) {
                    yearsOfService[i] = scanner.nextDouble();
                    if (yearsOfService[i] >= 0) {
                        break;
                    } else {
                        System.out.println("Years of service cannot be negative. Please try again.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a valid number.");
                    scanner.next(); // Clear invalid input
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            if (yearsOfService[i] > 5) {
                bonuses[i] = salaries[i] * 0.05; // 5% bonus
            } else {
                bonuses[i] = salaries[i] * 0.02; // 2% bonus
            }

            newSalaries[i] = salaries[i] + bonuses[i];
            totalBonus += bonuses[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

        System.out.println("\nEmployee Bonus and Salary Details:");
        System.out.printf("%-10s %-15s %-15s %-10s %-15s\n", "Emp #", "Old Salary", "Years of Service", "Bonus",
                "New Salary");

        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10d %-15.2f %-15.1f %-10.2f %-15.2f\n", i + 1, salaries[i], yearsOfService[i],
                    bonuses[i], newSalaries[i]);
        }

        System.out.printf("\nTotal Bonus Payout: %.2f\n", totalBonus);
        System.out.printf("Total Old Salary: %.2f\n", totalOldSalary);
        System.out.printf("Total New Salary: %.2f\n", totalNewSalary);

        scanner.close();
    }
}
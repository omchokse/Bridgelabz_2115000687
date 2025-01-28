import java.util.Random;

public class employeeBonus {

    public static void main(String[] args) {
        Random rand = new Random();

        double[][] employeeData = new double[10][2];

        for (int i = 0; i < 10; i++) {
            employeeData[i][0] = 10000 + rand.nextInt(90000);
            employeeData[i][1] = 1 + rand.nextInt(20);
        }

        double[][] newEmployeeData = calculateNewSalariesAndBonuses(employeeData);

        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.println("Employee Report");
        System.out.println("------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s\n", "Employee", "Old Salary", "Years of Service", "Bonus",
                "New Salary");

        for (int i = 0; i < 10; i++) {
            double oldSalary = employeeData[i][0];
            double yearsOfService = employeeData[i][1];
            double bonus = newEmployeeData[i][0];
            double newSalary = newEmployeeData[i][1];

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;

            System.out.printf("%-10d %-10.2f %-10.0f %-10.2f %-10.2f\n", (i + 1), oldSalary, yearsOfService, bonus,
                    newSalary);
        }

        System.out.println("------------------------------------------------");
        System.out.printf("%-20s %-10.2f %-10.2f %-10.2f\n", "Total", totalOldSalary, totalNewSalary, totalBonus);
    }

    public static double[][] calculateNewSalariesAndBonuses(double[][] employeeData) {
        double[][] updatedData = new double[10][2];

        for (int i = 0; i < 10; i++) {
            double oldSalary = employeeData[i][0];
            double yearsOfService = employeeData[i][1];

            double bonus = 0;
            if (yearsOfService > 5) {
                bonus = oldSalary * 0.05;
            } else {
                bonus = oldSalary * 0.02;
            }

            double newSalary = oldSalary + bonus;

            updatedData[i][0] = bonus;
            updatedData[i][1] = newSalary;
        }

        return updatedData;
    }
}

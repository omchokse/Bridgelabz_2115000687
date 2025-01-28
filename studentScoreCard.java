import java.util.Random;
import java.util.Scanner;

public class studentScoreCard {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        int[][] scores = generateRandomScores(numStudents);
        double[][] results = calculateResults(scores);

        displayScorecard(results, scores);
    }

    public static int[][] generateRandomScores(int numStudents) {
        Random rand = new Random();
        int[][] scores = new int[numStudents][3];

        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = 50 + rand.nextInt(50); // Random score for Physics between 50 and 100
            scores[i][1] = 50 + rand.nextInt(50); // Random score for Chemistry between 50 and 100
            scores[i][2] = 50 + rand.nextInt(50); // Random score for Maths between 50 and 100
        }

        return scores;
    }

    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][4];

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = percentage;
        }

        return results;
    }

    public static void displayScorecard(double[][] results, int[][] scores) {
        System.out.println("Scorecard");
        System.out.println("---------------------------------------------------------------");
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s\n", "Student", "Physics", "Chemistry", "Maths", "Total",
                "Average", "Percentage");
        System.out.println("---------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            int physics = scores[i][0];
            int chemistry = scores[i][1];
            int maths = scores[i][2];
            double total = results[i][0];
            double average = Math.round(results[i][1] * 100.0) / 100.0;
            double percentage = Math.round(results[i][2] * 100.0) / 100.0;

            System.out.printf("%-10d%-10d%-10d%-10d%-10.2f%-10.2f%-10.2f\n", (i + 1), physics, chemistry, maths, total,
                    average, percentage);
        }
    }
}

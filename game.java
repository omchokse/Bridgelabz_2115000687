import java.util.Scanner;
import java.util.Random;

public class game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int low = 1, high = 100, guess;
        String feedback = "";

        System.out.println("Think of a number between 1 and 100.");

        while (!feedback.equals("correct")) {
            guess = generateGuess(low, high, random);
            System.out.println("Is your number " + guess + "? (higher/lower/correct)");
            feedback = scanner.next().toLowerCase();

            if (feedback.equals("higher")) {
                low = guess + 1;
            } else if (feedback.equals("lower")) {
                high = guess - 1;
            }
        }

        System.out.println("Hooray! The computer guessed your number.");
        scanner.close();
    }

    public static int generateGuess(int low, int high, Random random) {
        return low + random.nextInt(high - low + 1);
    }
}
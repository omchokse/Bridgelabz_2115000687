import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        String reversedString = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversedString += input.charAt(i);
        }

        System.out.println("Reversed string: " + reversedString);
    }
}

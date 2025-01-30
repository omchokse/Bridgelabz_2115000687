import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        String toggledString = toggleCase(input);
        System.out.println("String after toggling case: " + toggledString);
    }

    public static String toggleCase(String str) {
        char[] charArray = str.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            if (Character.isUpperCase(ch)) {
                charArray[i] = Character.toLowerCase(ch);
            } else if (Character.isLowerCase(ch)) {
                charArray[i] = Character.toUpperCase(ch);
            }
        }

        return new String(charArray);
    }
}

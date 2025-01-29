import java.util.Scanner;

public class removeDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        String result = removeDuplicateCharacters(input);
        System.out.println("String after removing duplicates: " + result);
    }

    public static String removeDuplicateCharacters(String str) {
        StringBuilder sb = new StringBuilder();
        boolean[] seen = new boolean[256];

        for (char ch : str.toCharArray()) {
            if (!seen[ch]) {
                sb.append(ch);
                seen[ch] = true;
            }
        }
        return sb.toString();
    }
}
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class mostFrequentCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        char mostFrequentChar = findMostFrequentCharacter(input);
        System.out.println("Most Frequent Character: '" + mostFrequentChar + "'");
    }

    public static char findMostFrequentCharacter(String str) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        char maxChar = ' ';
        int maxCount = 0;

        for (char ch : str.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);

            if (frequencyMap.get(ch) > maxCount) {
                maxCount = frequencyMap.get(ch);
                maxChar = ch;
            }
        }

        return maxChar;
    }
}
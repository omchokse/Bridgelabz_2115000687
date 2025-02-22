import java.util.regex.*;
import java.util.*;

public class MoreRegexExamples {
    public static boolean validateCreditCard(String cardNumber) {
        return cardNumber.matches("^4\\d{15}$") || cardNumber.matches("^5\\d{15}$");
    }

    public static List<String> extractProgrammingLanguages(String text) {
        List<String> languages = new ArrayList<>();
        Matcher m = Pattern.compile("\\b(Java|Python|JavaScript|Go)\\b").matcher(text);
        while (m.find())
            languages.add(m.group());
        return languages;
    }

    public static List<String> extractCurrencyValues(String text) {
        List<String> values = new ArrayList<>();
        Matcher m = Pattern.compile("\\$?\\d+\\.\\d{2}").matcher(text);
        while (m.find())
            values.add(m.group());
        return values;
    }

    public static List<String> findRepeatingWords(String text) {
        List<String> repeatedWords = new ArrayList<>();
        Matcher m = Pattern.compile("\\b(\\w+)\\s+\\1\\b", Pattern.CASE_INSENSITIVE).matcher(text);
        while (m.find())
            repeatedWords.add(m.group(1));
        return repeatedWords;
    }

    public static boolean validateSSN(String ssn) {
        return ssn.matches("^\\d{3}-\\d{2}-\\d{4}$");
    }

    public static void main(String[] args) {
        System.out.println(validateCreditCard("4111111111111111"));
        System.out.println(extractProgrammingLanguages("I love Java, Python, and JavaScript."));
        System.out.println(extractCurrencyValues("The price is $45.99 and discount is 10.50."));
        System.out.println(findRepeatingWords("This is is a repeated repeated word test."));
        System.out.println(validateSSN("123-45-6789"));
    }
}

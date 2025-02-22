import java.util.regex.*;
import java.util.*;

public class RegexExamples {
    public static boolean validateUsername(String username) {
        return username.matches("^[a-zA-Z][a-zA-Z0-9_]{4,14}$");
    }

    public static boolean validateLicensePlate(String plate) {
        return plate.matches("^[A-Z]{2}\\d{4}$");
    }

    public static boolean validateHexColor(String color) {
        return color.matches("^#[0-9A-Fa-f]{6}$");
    }

    public static List<String> extractEmails(String text) {
        List<String> emails = new ArrayList<>();
        Matcher m = Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}").matcher(text);
        while (m.find())
            emails.add(m.group());
        return emails;
    }

    public static List<String> extractCapitalizedWords(String text) {
        List<String> words = new ArrayList<>();
        Matcher m = Pattern.compile("\\b[A-Z][a-z]*\\b").matcher(text);
        while (m.find())
            words.add(m.group());
        return words;
    }

    public static List<String> extractDates(String text) {
        List<String> dates = new ArrayList<>();
        Matcher m = Pattern.compile("\\b\\d{2}/\\d{2}/\\d{4}\\b").matcher(text);
        while (m.find())
            dates.add(m.group());
        return dates;
    }

    public static List<String> extractLinks(String text) {
        List<String> links = new ArrayList<>();
        Matcher m = Pattern.compile("https?://\\S+").matcher(text);
        while (m.find())
            links.add(m.group());
        return links;
    }

    public static String replaceMultipleSpaces(String text) {
        return text.replaceAll("\\s+", " ");
    }

    public static String censorBadWords(String text, List<String> badWords) {
        for (String word : badWords)
            text = text.replaceAll("(?i)\\b" + word + "\\b", "****");
        return text;
    }

    public static boolean validateIPAddress(String ip) {
        return ip.matches("\\b(25[0-5]|2[0-4][0-9]|1?[0-9]?[0-9])\\." +
                "(25[0-5]|2[0-4][0-9]|1?[0-9]?[0-9])\\." +
                "(25[0-5]|2[0-4][0-9]|1?[0-9]?[0-9])\\." +
                "(25[0-5]|2[0-4][0-9]|1?[0-9]?[0-9])\\b");
    }

    public static void main(String[] args) {
        System.out.println(validateUsername("user_123"));
        System.out.println(validateLicensePlate("AB1234"));
        System.out.println(validateHexColor("#FFA500"));
        System.out.println(extractEmails("Contact at test@example.com"));
        System.out.println(extractCapitalizedWords("The Eiffel Tower is in Paris"));
        System.out.println(extractDates("Event on 12/05/2023"));
        System.out.println(extractLinks("Visit https://www.google.com"));
        System.out.println(replaceMultipleSpaces("This   is   a test"));
        System.out.println(censorBadWords("This is a damn test", Arrays.asList("damn")));
        System.out.println(validateIPAddress("192.168.1.1"));
    }
}

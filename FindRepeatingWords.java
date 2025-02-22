import java.util.regex.*;
import java.util.*;

public class FindRepeatingWords {
    public static List<String> findRepeats(String text) {
        List<String> repeatedWords = new ArrayList<>();
        Matcher m = Pattern.compile("\\b(\\w+)\\s+\\1\\b", Pattern.CASE_INSENSITIVE).matcher(text);
        while (m.find())
            repeatedWords.add(m.group(1));
        return repeatedWords;
    }

    public static void main(String[] args) {
        String text = "This is is a repeated repeated word test.";
        System.out.println(findRepeats(text));
    }
}

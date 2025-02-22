import java.util.regex.*;
import java.util.*;

public class ExtractProgrammingLanguages {
    public static List<String> extractLanguages(String text) {
        List<String> languages = new ArrayList<>();
        Matcher m = Pattern.compile("\\b(Java|Python|JavaScript|Go)\\b").matcher(text);
        while (m.find())
            languages.add(m.group());
        return languages;
    }

    public static void main(String[] args) {
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";
        System.out.println(extractLanguages(text));
    }
}

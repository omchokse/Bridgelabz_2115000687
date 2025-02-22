import java.util.regex.*;
import java.util.*;

public class ExtractCurrencyValues {
    public static List<String> extractCurrency(String text) {
        List<String> values = new ArrayList<>();
        Matcher m = Pattern.compile("\\$?\\d+\\.\\d{2}").matcher(text);
        while (m.find())
            values.add(m.group());
        return values;
    }

    public static void main(String[] args) {
        String text = "The price is $45.99, and the discount is 10.50.";
        System.out.println(extractCurrency(text));
    }
}

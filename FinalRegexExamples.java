import java.util.regex.*;
import java.util.*;

public class FinalRegexExamples {
    public static List<String> extractIPv4Addresses(String text) {
        List<String> ips = new ArrayList<>();
        Matcher m = Pattern.compile("\\b(25[0-5]|2[0-4][0-9]|1?[0-9]?[0-9])\\." +
                "(25[0-5]|2[0-4][0-9]|1?[0-9]?[0-9])\\." +
                "(25[0-5]|2[0-4][0-9]|1?[0-9]?[0-9])\\." +
                "(25[0-5]|2[0-4][0-9]|1?[0-9]?[0-9])\\b").matcher(text);
        while (m.find())
            ips.add(m.group());
        return ips;
    }

    public static boolean validateVisaMasterCard(String cardNumber) {
        return cardNumber.matches("^4\\d{15}$") || cardNumber.matches("^5\\d{15}$");
    }

    public static List<String> extractHexColors(String text) {
        List<String> colors = new ArrayList<>();
        Matcher m = Pattern.compile("#[0-9A-Fa-f]{6}\\b").matcher(text);
        while (m.find())
            colors.add(m.group());
        return colors;
    }

    public static List<String> extractSocialSecurityNumbers(String text) {
        List<String> ssns = new ArrayList<>();
        Matcher m = Pattern.compile("\\b\\d{3}-\\d{2}-\\d{4}\\b").matcher(text);
        while (m.find())
            ssns.add(m.group());
        return ssns;
    }

    public static void main(String[] args) {
        System.out.println(extractIPv4Addresses("Valid IPs: 192.168.1.1, 255.255.255.0, Invalid IP: 999.999.999.999"));
        System.out.println(validateVisaMasterCard("5111111111111111"));
        System.out.println(extractHexColors("Colors: #FFA500, #123ABC, invalid: #12A"));
        System.out.println(extractSocialSecurityNumbers("SSNs: 123-45-6789, 987-65-4321, invalid: 123456789"));
    }
}

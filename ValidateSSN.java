public class ValidateSSN {
    public static boolean isValidSSN(String ssn) {
        return ssn.matches("^\\d{3}-\\d{2}-\\d{4}$");
    }

    public static void main(String[] args) {
        String validSSN = "123-45-6789";
        String invalidSSN = "123456789";

        System.out.println(validSSN + " is " + (isValidSSN(validSSN) ? "✅ valid" : "❌ invalid"));
        System.out.println(invalidSSN + " is " + (isValidSSN(invalidSSN) ? "✅ valid" : "❌ invalid"));
    }
}

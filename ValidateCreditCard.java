public class ValidateCreditCard {
    public static boolean isValidCreditCard(String cardNumber) {
        return cardNumber.matches("^4\\d{15}$") || cardNumber.matches("^5\\d{15}$");
    }

    public static void main(String[] args) {
        System.out.println(isValidCreditCard("4111111111111111"));
        System.out.println(isValidCreditCard("5111111111111111"));
        System.out.println(isValidCreditCard("6111111111111111"));
        System.out.println(isValidCreditCard("411111111111"));
    }
}

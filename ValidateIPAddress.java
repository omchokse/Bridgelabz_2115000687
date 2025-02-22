public class ValidateIPAddress {
    public static boolean isValidIP(String ip) {
        String regex = "\\b(25[0-5]|2[0-4][0-9]|1?[0-9]?[0-9])\\." +
                "(25[0-5]|2[0-4][0-9]|1?[0-9]?[0-9])\\." +
                "(25[0-5]|2[0-4][0-9]|1?[0-9]?[0-9])\\." +
                "(25[0-5]|2[0-4][0-9]|1?[0-9]?[0-9])\\b";
        return ip.matches(regex);
    }

    public static void main(String[] args) {
        System.out.println(isValidIP("192.168.1.1"));
        System.out.println(isValidIP("255.255.255.255"));
        System.out.println(isValidIP("999.999.999.999"));
        System.out.println(isValidIP("256.100.50.25"));
        System.out.println(isValidIP("192.168.1"));
    }
}

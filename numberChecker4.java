public class numberChecker4 {
    public static void main(String[] args) {
        int number = 7;

        boolean isPrime = isPrime(number);
        boolean isNeon = isNeon(number);
        boolean isSpy = isSpy(number);
        boolean isAutomorphic = isAutomorphic(number);
        boolean isBuzz = isBuzz(number);

        System.out.println("Is Prime: " + isPrime);
        System.out.println("Is Neon: " + isNeon);
        System.out.println("Is Spy: " + isSpy);
        System.out.println("Is Automorphic: " + isAutomorphic);
        System.out.println("Is Buzz: " + isBuzz);
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isNeon(int number) {
        int square = number * number;
        int sumOfDigits = 0;
        while (square > 0) {
            sumOfDigits += square % 10;
            square /= 10;
        }
        return sumOfDigits == number;
    }

    public static boolean isSpy(int number) {
        int sum = 0;
        int product = 1;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            product *= digit;
            number /= 10;
        }
        return sum == product;
    }

    public static boolean isAutomorphic(int number) {
        int square = number * number;
        return String.valueOf(square).endsWith(String.valueOf(number));
    }

    public static boolean isBuzz(int number) {
        return (number % 7 == 0 || String.valueOf(number).endsWith("7"));
    }
}
public class numberChecker2 {
    public static void main(String[] args) {
        int number = 21;
        int[] digits = storeDigits(number);

        int digitCount = countDigits(number);
        int sumOfDigits = sumOfDigits(digits);
        int sumOfSquares = sumOfSquares(digits);
        boolean isHarshadNumber = isHarshadNumber(number, sumOfDigits);
        int[][] digitFrequency = findDigitFrequency(digits);

        System.out.println("Count of digits: " + digitCount);
        System.out.println("Sum of digits: " + sumOfDigits);
        System.out.println("Sum of squares of digits: " + sumOfSquares);
        System.out.println("Is Harshad Number: " + isHarshadNumber);

        System.out.println("Digit Frequencies:");
        for (int[] freq : digitFrequency) {
            System.out.println("Digit " + freq[0] + " appears " + freq[1] + " times");
        }
    }

    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }

    public static int[] storeDigits(int number) {
        int digitCount = countDigits(number);
        int[] digits = new int[digitCount];
        for (int i = digitCount - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    public static boolean isHarshadNumber(int number, int sumOfDigits) {
        return number % sumOfDigits == 0;
    }

    public static int[][] findDigitFrequency(int[] digits) {
        int[][] frequency = new int[10][2];
        for (int digit : digits) {
            frequency[digit][0] = digit;
            frequency[digit][1]++;
        }
        return frequency;
    }
}

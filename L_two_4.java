import java.util.*;

public class L_two_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double celsius;
        System.out.print("Enter the temperature in Celsius: ");
        celsius = sc.nextDouble();
        double fahrenheitResult = (celsius * 9 / 5) + 32;
        System.out.println("The " + celsius + "° Celsius is " + fahrenheitResult + "° Fahrenheit");
    }
}

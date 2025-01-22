import java.util.*;

public class L_two_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fahrenheit;
        System.out.print("Enter the temperature in Fahrenheit: ");
        fahrenheit = sc.nextDouble();
        double celsiusResult = (fahrenheit - 32) * 5 / 9;
        System.out.println("The " + fahrenheit + "° Fahrenheit is " + celsiusResult + "° Celsius");
    }
}

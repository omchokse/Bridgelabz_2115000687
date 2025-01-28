import java.util.Scanner;

public class simpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter pricipal amount: ");
        double principal = sc.nextDouble();
        System.out.print("Enter rate: ");
        double rate = sc.nextDouble();
        System.out.print("Enter time: ");
        double time = sc.nextDouble();
        SI(principal, rate, time);
        sc.close();
    }

    public static void SI(double principal, double rate, double time) {
        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal
                + ", Rate of Interest " + rate + " and Time " + time);
    }
}

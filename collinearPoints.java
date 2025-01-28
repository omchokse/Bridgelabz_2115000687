import java.util.Scanner;

public class collinearPoints {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();
        System.out.print("Enter x3: ");
        double x3 = scanner.nextDouble();
        System.out.print("Enter y3: ");
        double y3 = scanner.nextDouble();

        boolean areCollinearBySlope = checkCollinearityBySlope(x1, y1, x2, y2, x3, y3);
        boolean areCollinearByArea = checkCollinearityByArea(x1, y1, x2, y2, x3, y3);

        if (areCollinearBySlope && areCollinearByArea) {
            System.out.println("The points are collinear.");
        } else {
            System.out.println("The points are not collinear.");
        }
        scanner.close();
    }

    public static boolean checkCollinearityBySlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);

        return (slopeAB == slopeBC && slopeBC == slopeAC);
    }

    public static boolean checkCollinearityByArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double area = (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2;
        return area == 0;
    }
}

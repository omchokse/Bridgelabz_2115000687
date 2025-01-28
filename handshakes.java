import java.util.Scanner;

public class handshakes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        System.out.print("The maximum number of possible handshakes is: ");
        handshakescalcy(numberOfStudents);
        scanner.close();
    }

    public static void handshakescalcy(int students) {
        int maxhandshakes = (students * (students - 1)) / 2;
        System.out.println(maxhandshakes);
    }
}
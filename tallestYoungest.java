import java.util.Scanner;

public class tallestYoungest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Amar's age: ");
        int ageAmar = sc.nextInt();
        System.out.print("Enter Amar's height: ");
        double heightAmar = sc.nextDouble();

        System.out.print("Enter Akbar's age: ");
        int ageAkbar = sc.nextInt();
        System.out.print("Enter Akbar's height: ");
        double heightAkbar = sc.nextDouble();

        System.out.print("Enter Anthony's age: ");
        int ageAnthony = sc.nextInt();
        System.out.print("Enter Anthony's height: ");
        double heightAnthony = sc.nextDouble();

        int youngestAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
        double tallestHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));

        if (youngestAge == ageAmar) {
            System.out.println("Youngest: Amar");
        } else if (youngestAge == ageAkbar) {
            System.out.println("Youngest: Akbar");
        } else {
            System.out.println("Youngest: Anthony");
        }

        if (tallestHeight == heightAmar) {
            System.out.println("Tallest: Amar");
        } else if (tallestHeight == heightAkbar) {
            System.out.println("Tallest: Akbar");
        } else {
            System.out.println("Tallest: Anthony");
        }
        sc.close();
    }
}

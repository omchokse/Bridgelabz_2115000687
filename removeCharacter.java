import java.util.Scanner;

public class removeCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str1 = sc.next();
        char ch = sc.next().charAt(0);
        sc.close();
        String str2 = "";
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != ch) {
                str2 = str2 + str1.charAt(i);
            }
        }
        System.out.println(str2);
    }
}

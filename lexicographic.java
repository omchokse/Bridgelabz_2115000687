import java.util.*;

public class lexicographic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input first string: ");
        String str1 = sc.next();
        System.out.println("input second string: ");
        String str2 = sc.next();
        sc.close();
        int n = Math.max(str1.length(), str2.length());
        for (int i = 0; i < n; i++) {
            if (str1.charAt(i) < str2.charAt(i)) {
                System.out.println(str1 + " comes before " + str2 + " in lexicographical order");
                break;
            } else if (str1.charAt(i) > str2.charAt(i)) {
                System.out.println(str2 + " comes before " + str1 + " in lexicographical order");
                break;
            }
        }
    }
}

import java.io.*;

public class UserInputToFile {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter name: ");
        String name = br.readLine();
        System.out.print("Enter age: ");
        int age = Integer.parseInt(br.readLine());
        System.out.print("Enter favorite language: ");
        String language = br.readLine();

        try (FileWriter fw = new FileWriter("user_data.txt")) {
            fw.write(name + "," + age + "," + language);
        }
    }
}

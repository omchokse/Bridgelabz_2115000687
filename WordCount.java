import java.io.*;

public class WordCount {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        String word = "apple";
        int count = 0;
        String line;
        while ((line = reader.readLine()) != null) {
            for (String w : line.split("\\s+")) {
                if (w.equals(word))
                    count++;
            }
        }
        System.out.println("Word Count: " + count);
        reader.close();
    }
}

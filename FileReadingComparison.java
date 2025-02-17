import java.io.*;

public class FileReadingComparison {
    public static void testFileReader(String filePath) throws IOException {
        FileReader fr = new FileReader(filePath);
        int ch;
        while ((ch = fr.read()) != -1) {
        }
        fr.close();
    }

    public static void testInputStreamReader(String filePath) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath));
        int ch;
        while ((ch = isr.read()) != -1) {
        }
        isr.close();
    }

    public static void main(String[] args) throws IOException {
        String filePath = "largefile.txt";

        long start, end;

        start = System.nanoTime();
        testFileReader(filePath);
        end = System.nanoTime();
        System.out.println("FileReader: " + (end - start) / 1e6 + " ms");

        start = System.nanoTime();
        testInputStreamReader(filePath);
        end = System.nanoTime();
        System.out.println("InputStreamReader: " + (end - start) / 1e6 + " ms");
    }
}
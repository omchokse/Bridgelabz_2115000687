import java.io.*;

public class ImageByteArray {
    public static void main(String[] args) throws IOException {
        File file = new File("image.jpg");
        byte[] byteArray = new byte[(int) file.length()];

        try (FileInputStream fis = new FileInputStream(file);
                ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            int data;
            while ((data = fis.read(byteArray)) != -1) {
                baos.write(byteArray, 0, data);
            }

            try (FileOutputStream fos = new FileOutputStream("output.jpg")) {
                fos.write(baos.toByteArray());
            }
        }
    }
}

package ua.javarush.l24;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamMain {
    public static void main(String[] args) {
        String path = "output.txt";
        try (OutputStream os = new FileOutputStream(path)) {
            String text = "Some text";
            byte[] bytes = text.getBytes();
            for (byte b : bytes) {
                os.write(b);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

package ua.javarush.l25;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class ByteArrayOutputStreamWriteMain {
    public static void main(String[] args) throws IOException {
        var output = new ByteArrayOutputStream();
        Random random = new Random();

        for (int i = 0; i < 30; i++) {
            output.write(random.nextInt(70) + 50);
        }
        FileOutputStream fileOutputStream = new FileOutputStream("test.txt");
        output.writeTo(fileOutputStream);
        System.out.println("DONE!");
    }
}

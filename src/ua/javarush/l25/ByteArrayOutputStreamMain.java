package ua.javarush.l25;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Random;

public class ByteArrayOutputStreamMain {
    public static void main(String[] args) {
        Random random = new Random();
        var output = new ByteArrayOutputStream();
        for (int i = 0; i < 30; i++) {
            output.write((random.nextInt(70) + 50));
        }
        byte[] bytes = output.toByteArray();
        var input = new ByteArrayInputStream(bytes);

        int tmp;
        while ((tmp = input.read()) != -1) {
            System.out.print((char) tmp + " ");
        }


    }
}

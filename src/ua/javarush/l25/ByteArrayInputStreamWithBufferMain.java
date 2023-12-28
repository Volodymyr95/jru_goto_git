package ua.javarush.l25;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayInputStreamWithBufferMain {
    public static void main(String[] args) {
        byte[] data = {122, 100, 101, 102, 103, 111, 99, 0, 12, 11};

        try (var stream = new ByteArrayInputStream(data)) {
            byte[] buffer = new byte[3];
            int tmp;
            while ((tmp = stream.read(buffer, 0, buffer.length)) != -1) {
                for (int i = 0; i < tmp; i++) {
                    System.out.print((char) buffer[i] + " ");
                }
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

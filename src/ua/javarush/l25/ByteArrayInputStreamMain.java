package ua.javarush.l25;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayInputStreamMain {

    public static void main(String[] args) {
        byte[] data = {122, 100, 101, 102, 103, 111, 99, 0, 12, 11};

        try (var byteArrayInputStream = new ByteArrayInputStream(data)) {
            int tmp;

            while ((tmp = byteArrayInputStream.read()) != -1) {
                System.out.print((char) tmp);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

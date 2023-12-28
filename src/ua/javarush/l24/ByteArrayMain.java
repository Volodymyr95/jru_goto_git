package ua.javarush.l24;

import java.io.ByteArrayInputStream;

public class ByteArrayMain {
    public static void main(String[] args) {
        byte[] data = {100, 101, 102, 103, 104};
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(data);

        int tmp;
        while ((tmp = byteArrayInputStream.read()) != -1) {
            System.out.print((char) tmp);

        }
    }
}

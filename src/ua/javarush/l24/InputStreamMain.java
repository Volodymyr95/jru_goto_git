package ua.javarush.l24;

import java.io.FileInputStream;
import java.io.IOException;

public class InputStreamMain {
    public static void main(String[] args) {
        String path = "test.txt";
        try (FileInputStream fileInputStream = new FileInputStream(path)) {
            int data;
            while ((data = fileInputStream.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

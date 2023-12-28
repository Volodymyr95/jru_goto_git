package ua.javarush.l24;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Scanner;

public class StringReaderMain {
    public static void main(String[] args) {
        String source = "Hello world!";

        try (Reader reader = new StringReader(source)) {
            int tmp;
            while ((tmp = reader.read()) != -1) {
                System.out.print((char) tmp);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

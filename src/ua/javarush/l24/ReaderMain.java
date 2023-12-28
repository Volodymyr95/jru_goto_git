package ua.javarush.l24;

import java.io.FileReader;
import java.io.IOException;

public class ReaderMain {
    public static void main(String[] args) {
        String path = "test.txt";
        try (FileReader fileReader = new FileReader(path)) {

            int tmp;
            while ((tmp = fileReader.read()) != -1) {
                System.out.print((char) tmp);

            }
        } catch (IOException e) {
            System.out.println("ERROR:" + e.getMessage());
        }
    }
}

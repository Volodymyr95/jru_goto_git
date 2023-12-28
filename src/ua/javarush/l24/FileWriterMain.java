package ua.javarush.l24;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterMain {
    public static void main(String[] args) {
        String path = "output.txt";

        try (Writer w = new FileWriter(path)) {
            String data = "Some value to write!";
            w.write(data);
            System.out.println("Done!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

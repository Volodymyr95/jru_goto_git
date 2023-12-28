package ua.javarush.l24;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class BufferedWriterMain {
    public static void main(String[] args) {
        String path = "output.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            String line1 = "1 line value";
            String line2 = "2 line value";
            String line3 = "3 line value";

            writer.write(line1);
            writer.newLine();
            writer.write(line2);
            writer.newLine();
            writer.write(line3);
            writer.newLine();

            System.out.println("Done!");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

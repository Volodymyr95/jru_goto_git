package ua.javarush.l26;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileChannelExample {
    public static void main(String[] args) {
        String source = "test/source.txt";
        String destination = "test/destination.txt";

        try (InputStream sourceInputStream = Files.newInputStream(Path.of(source));
             OutputStream destinationInputStream = Files.newOutputStream(Path.of(destination));
        ) {


        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

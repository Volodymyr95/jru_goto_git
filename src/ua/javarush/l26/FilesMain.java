package ua.javarush.l26;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesMain {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("test/destination.txt");
        Files.writeString(path, "Hello world!");
        String data = Files.readString(path);
        System.out.println(data);


    }
}

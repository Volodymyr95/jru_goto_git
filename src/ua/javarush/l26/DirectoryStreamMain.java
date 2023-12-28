package ua.javarush.l26;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class DirectoryStreamMain {
    public static void main(String[] args) {
        Path path = Path.of("/");

        try (DirectoryStream<Path> files = Files.newDirectoryStream(path)) {
            for (Path e : files) {
                System.out.println(e);
            }
        } catch (IOException e) {

        }
    }
}

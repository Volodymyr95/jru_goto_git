package ua.javarush.l26;

import java.nio.file.Path;

public class PathMain {
    public static void main(String[] args) {
        Path path = Path.of("test/test.txt");
         path = path.toAbsolutePath();
        System.out.println("Root: " + path.getRoot());
        System.out.println("Absolute: " + path.isAbsolute());
        System.out.println("Parent: " + path.getParent());
        System.out.println("OS: " + path.getFileSystem());
        System.out.println("Name: " + path.getFileName().toString());

    }
}

package ua.javarush.l22;

import java.io.FileInputStream;
import java.io.IOException;

public class MailL22 {
    public static void main(String[] args) {

        try (DesktopFileRead file = new DesktopFileRead();
             FileInputStream fileInputStream = new FileInputStream("test1.txt")) {
        } catch (IOException e) {
            System.out.println("Error 1");
        } catch (Exception e) {
            System.out.println("Error 2");
        }
    }
}

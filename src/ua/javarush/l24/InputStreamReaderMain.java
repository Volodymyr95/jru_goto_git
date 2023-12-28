package ua.javarush.l24;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamReaderMain {
    public static void main(String[] args) throws IOException {
        System.out.println("Type your data: ");
        InputStream in = System.in;
        InputStreamReader inputStreamReader = new InputStreamReader(in);

        int tmp;
        while ((tmp = inputStreamReader.read()) != -1) {
            System.out.println((char) tmp);

        }
    }
}

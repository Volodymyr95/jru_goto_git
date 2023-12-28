package ua.javarush.l24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderMain {
    public static void main(String[] args) throws IOException {
        System.out.println("Type text: ");
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader,-2);


        String s = bufferedReader.readLine();
        System.out.println("your text: " + s);

    }
}

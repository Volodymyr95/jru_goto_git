package ua.javarush.l21;

import ua.javarush.l21.exceptions.BadSqlException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();  // Stack - LIFO (Last In First Out)
                                                // Queue - FIFO (First In First Out)

        for (int i = 0; i < 30; i++) {
            stack.push(i);
        }

        for (int i = 0; i < 30; i++) {
            System.out.println(stack.pop());
        }


//        try {
//            new DBService().execute("");
//        } catch (BadSqlException e) {
//            for (StackTraceElement stackTraceElement : e.getStackTrace()) {
//                System.out.println(stackTraceElement.);
//            }
//
//        }
    }
}

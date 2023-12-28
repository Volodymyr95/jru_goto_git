package ua.javarush.l22;

import java.util.ArrayList;

public class Main4Error {
    private static int counter = 0;

    public static void main(String[] args) {
        // r();
        ArrayList<MemoryUser> memoryUsers = new ArrayList<>();

        while (true) {
            memoryUsers.add(new MemoryUser());
        }
    }

    public static void r() {
        System.out.println(++counter);
        r();
    }
}

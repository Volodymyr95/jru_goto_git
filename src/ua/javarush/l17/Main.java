package ua.javarush.l17;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
//        HashSet<User> users = new HashSet<>();
//
//        for (int i = 0; i < 5; i++) {
//            users.add(new User("John", i));
//        }
//        System.out.println("Set size = " + users.size());
//
//        System.out.println(users);

        Set<String> strings = new LinkedHashSet<>();
        strings.add("One");
        strings.add("Two");
        strings.add("Three");
        strings.add("Four");

        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals("One")) {
                iterator.remove();
            }
//            System.out.println(iterator.next());
        }
        System.out.println(strings);

//        for (String s : strings) {
//            strings.remove("One");
//        }
    }
}

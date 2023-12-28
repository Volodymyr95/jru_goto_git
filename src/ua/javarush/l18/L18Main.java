package ua.javarush.l18;

import java.util.*;

public class L18Main {
    public static void main(String[] args) {
//        HashMap<User, String> map = new HashMap<>();
//
//        map.put(new User("John", 42), "John-42"); // hashCode ==> 42
//        map.put(new User("John", 43), "John-43"); // hashCode ==> 42
//
 //      Set<Map.Entry<User, String>> entries = map.entrySet();
//
//        for (Map.Entry<User, String> entry : entries) {
//            System.out.println(entry);
//        }


//        TreeMap<User, String> map = new TreeMap<>();
//
//        map.put(new User("John", 50), "value");
//        map.put(new User("John", 49), "value");
//        map.put(new User("John", 44), "value");
//        map.put(new User("John", 53), "value");
//        map.put(new User("John", 40), "value");
//        map.put(new User("John", 47), "value");
//        map.put(new User("John", 48), "value");
//
//
//        System.out.println(map);

//

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        Collections.addAll(list, 1, 23, 1, 5, 1);
        Collections.addAll(list2, 1, 23, 1, 5, 1);
        System.out.println(list);
        Collections.fill(list, 1);
        System.out.println(list);
        ArrayList<String> strings = new ArrayList<>();
        strings.add("AAAAAAAA");
        strings.add("BBBB");
        strings.add("CCCCC");
        String max = Collections.max(strings);
        System.out.println(max);
        String min = Collections.min(strings);
        System.out.println(min);
        boolean disjoint = Collections.disjoint(list, list2);
        System.out.println(disjoint);


    }
}

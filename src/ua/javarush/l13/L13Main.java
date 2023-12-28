package ua.javarush.l13;

public class L13Main {
    public static void main(String[] args) {
        User user = new User("John", "Snow", 42, "someMail");
        User user2 = new User("John", "Snow", 42, "someMail");
        User user3 = user;

        System.out.println(user.equals(user2));
        System.out.println(user.hashCode());
        System.out.println(user2.hashCode());
        System.out.println(user3.hashCode());

    }
}

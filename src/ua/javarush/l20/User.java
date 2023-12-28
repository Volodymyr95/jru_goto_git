package ua.javarush.l20;

public class User {
    private String name;
    private int age;
    private Gender gender;
    private State state;

    public User() {
    }

    public User(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}

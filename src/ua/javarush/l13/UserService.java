package ua.javarush.l13;

import java.util.regex.Pattern;

public class UserService {
    private static final Pattern PATTERN = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");

    public User createUser(String firstName, String lastName, int age, String email) {
        validate(firstName, lastName, age, email);
        return new User(firstName, lastName, age, email);
    }

    private void validate(String firstName, String lastName, int age, String email) {
        if (firstName == null) {
            System.out.println("firstName is null");
        }
        if (lastName == null) {
            System.out.println("lastName is null");
        }
        if (age <= 0) {
            System.out.println("age is incorrect");
        }
        if (email == null) {
            System.out.println("email is null");
        } else if (!PATTERN.matcher(email).matches()) {
            System.out.println("Incorrect email format");
        }
    }
}

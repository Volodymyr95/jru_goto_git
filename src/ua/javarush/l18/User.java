package ua.javarush.l18;

import java.util.Objects;

public class User implements Comparable<User> {

    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (age != user.age) return false;
        return Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {

        return 42;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(User o) {  //  - |0| +
        int ageComaprision = Integer.compare(age, o.age);

        if (ageComaprision == 0) {
            return name.compareTo(o.name);
        }

        // return Integer.compare(age, o.age); // зростання
        return ageComaprision; // спадання
    }
}

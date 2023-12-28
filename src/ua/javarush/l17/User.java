package ua.javarush.l17;

import java.util.List;
import java.util.Objects;
import java.util.Set;

public class User {
    private String name;
    private int age;

    private Set<String> hobbies;
    private Set<String> readBooks;

    private List<String> visitedCountries;

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
        if (!Objects.equals(name, user.name)) return false;
        if (!Objects.equals(hobbies, user.hobbies)) return false;
        if (!Objects.equals(readBooks, user.readBooks)) return false;
        return Objects.equals(visitedCountries, user.visitedCountries);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + (hobbies != null ? hobbies.hashCode() : 0);
        result = 31 * result + (readBooks != null ? readBooks.hashCode() : 0);
        result = 31 * result + (visitedCountries != null ? visitedCountries.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

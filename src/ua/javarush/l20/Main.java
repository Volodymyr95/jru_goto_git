package ua.javarush.l20;

public class Main {
    public static void main(String[] args) {
//        Gender male = Gender.MALE;
//        Gender male2 = Gender.FEMALE;
//        male.setDescription("Male");
//
//        System.out.println(male == male2);
//
//        System.out.println(male);
//
//        User john = new User("John", 42, Gender.MALE);

//        for (Gender value : Gender.values()) {
//            System.out.println(value);
//        }
//
//        System.out.println(Gender.MALE.ordinal());

        Gender gender = Gender.valueOf("MALE");
        System.out.println(gender);

        DBConnection instance = DBConnection.getInstance();

    }
}

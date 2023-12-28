package ua.javarush.l20;

public class DBConnection {

    private static final DBConnection CONNECTION = new DBConnection();

    private DBConnection() {

    }

    public static DBConnection getInstance() {
        return CONNECTION;
    }
}

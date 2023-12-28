package ua.javarush.l22;

public class DesktopFileRead implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("Bye Bye!");
    }
}

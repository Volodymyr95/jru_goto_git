package ua.javarush.l25.decorator;

public interface DataSource {
    void write(String data);

    String read();
}

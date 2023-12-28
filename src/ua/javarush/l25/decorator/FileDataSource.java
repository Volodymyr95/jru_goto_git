package ua.javarush.l25.decorator;

public class FileDataSource implements DataSource {
    @Override
    public void write(String data) {
        System.out.println("File write");
    }

    @Override
    public String read() {
        return "Some data!";
    }
}

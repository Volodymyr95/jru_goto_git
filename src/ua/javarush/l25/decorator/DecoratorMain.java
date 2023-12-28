package ua.javarush.l25.decorator;

public class DecoratorMain {
    public static void main(String[] args) {
        FileDataSource fileDataSource = new FileDataSource();
        JsonDataSourceDecorator jsonDataSourceDecorator = new JsonDataSourceDecorator(fileDataSource);

        jsonDataSourceDecorator.write("Write data");
        System.out.println(jsonDataSourceDecorator.read());
    }
}

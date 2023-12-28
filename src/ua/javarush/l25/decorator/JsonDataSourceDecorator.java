package ua.javarush.l25.decorator;

public class JsonDataSourceDecorator implements DataSource {

    private DataSource dataSource;

    public JsonDataSourceDecorator(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void write(String data) {
        System.out.println("JSON");
        dataSource.write(data);
    }

    @Override
    public String read() {
        return dataSource.read() + "JSON";
    }
}

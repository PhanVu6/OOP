package lab11.decorator.datasource;

public interface DataSource {
    void writeData(String data);

    String readData();

}

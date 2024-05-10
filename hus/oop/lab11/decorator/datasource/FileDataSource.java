package lab11.decorator.datasource;

public class FileDataSource implements DataSource {
    private String filename;

    public FileDataSource(String filename) {
        this.filename = filename;
    }

    @Override
    public void writeData(String data) {
        System.out.println("Writing data to file: " + data);
    }

    @Override
    public String readData() {
        System.out.println("Reading data from file");
        return "Read data";
    }

}

package lab11.decorator.datasource;

public class CompressionDecorator extends DataSourceDecorator {
    public CompressionDecorator(DataSource wrappee) {
        super(wrappee);
    }

    @Override
    public void writeData(String data) {
        String compressedData = "Compressed: " + data;
        wrappee.writeData(compressedData);
    }

    @Override
    public String readData() {
        String data = wrappee.readData();
        // Decompress data if it's compressed
        if (data.startsWith("Compressed: ")) {
            return data.substring("Compressed: ".length());
        } else {
            return data;
        }
    }
}

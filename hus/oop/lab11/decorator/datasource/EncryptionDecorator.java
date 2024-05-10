package lab11.decorator.datasource;

public class EncryptionDecorator extends DataSourceDecorator {

    public EncryptionDecorator(DataSource wrappee) {
        super(wrappee);
    }

    @Override
    public void writeData(String data) {
        String encryptedData = "Encrypted: " + data;
        wrappee.writeData(encryptedData);
    }

    @Override
    public String readData() {
        String data = wrappee.readData();
        // Decrypt data if it's encrypted
        if (data.startsWith("Encrypted: ")) {
            return data.substring("Encrypted: ".length());
        } else {
            return data;
        }
    }
}

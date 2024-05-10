package lab11.decorator.datasource;

public class Application {
    public static void main(String[] args) {
        DataSource source = new FileDataSource("somefile.dat");
        source.writeData("salary Records");

        source = new CompressionDecorator(source);
        source.writeData("salary Records");

        source = new EncryptionDecorator(source);
        source.writeData("salary Records");

        DataSource externalSource = new FileDataSource("salary.dat");
        SalaryManager logger = new SalaryManager(externalSource);
        String salaryData = logger.load();
        System.out.println("Loaded salary data: " + salaryData);
        logger.save();
    }

}

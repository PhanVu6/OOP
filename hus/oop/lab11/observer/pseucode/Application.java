package observer.pseucode;

public class Application {
    public static void main(String[] args) {
        config();
    }

    public static void config() {
        Editor editor = new Editor();
        EventListeners logger = new LoggingListeners(
                "/path/to/log.txt",
                "Someone has opened the file: %s");
        editor.events.subscribe("open", logger);

        EventListeners emailAlters = new EmailAltersListener(
                "admin@example.com",
                "Someone has changed the file: %s");
        editor.events.subscribe("save", emailAlters);

        editor.openFile("/path/to/log.txt");
        editor.saveFile();
    }
}

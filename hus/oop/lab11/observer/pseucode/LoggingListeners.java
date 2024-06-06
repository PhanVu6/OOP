package observer.pseucode;

public class LoggingListeners implements EventListeners {
    private File log;
    private String message;

    public LoggingListeners(String log_fileName, String message) {
        this.log = new File(log_fileName);
        this.message = message;
    }

    @Override
    public void update(String fileName) {
        this.message = this.message.replace("%s", fileName);
        log.write(this.message);
    }
}

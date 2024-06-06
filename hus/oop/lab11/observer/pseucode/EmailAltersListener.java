package observer.pseucode;

public class EmailAltersListener implements EventListeners {
    private String email;
    private String message;

    public EmailAltersListener(String email, String message) {
        this.email = email;
        this.message = message;
    }

    @Override
    public void update(String fileName) {
        System.out.println("Send email to " + this.email);
        this.message.replace("%s", fileName);
    }
}

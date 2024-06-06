package observer.subject;

public class OctalObserver extends Observer {
    public void update() {
        System.out.println("Update Octal Observer , state = " + subject.getState());
    }
}

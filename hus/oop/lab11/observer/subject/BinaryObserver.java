package observer.subject;

public class BinaryObserver extends Observer {
    public void update() {
        System.out.println("Update Binary Observer, state = " + subject.getState());
    }
}

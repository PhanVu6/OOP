package observer.subject;

public class HexaObserver extends Observer {
//    public Subject subject;
    public void update() {
        System.out.println("Update Hexa Observer, state = " + subject.getState());
    }
}

package observer.subject;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();
        Observer o1 = new BinaryObserver();
        Observer o2 = new HexaObserver();
        Observer o3 = new OctalObserver();
        o1.subject = subject;
        o2.subject = subject;
        o3.subject = subject;
        subject.attach(o1);
        subject.attach(o2);
        subject.attach(o3);
        subject.setState(1);
    }
}

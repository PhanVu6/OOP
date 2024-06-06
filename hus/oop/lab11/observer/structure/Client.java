package observer.structure;

public class Client {
    public static void main(String[] args) {
        Publisher publisher = new Publisher();
        Subscriber s1 = new ConcreteSubscribers();
        Subscriber s2 = new ConcreteSubscribers();
        Subscriber s3 = new ConcreteSubscribers();
        publisher.subscribe(s1);
        publisher.subscribe(s2);
        publisher.subscribe(s3);
        publisher.mainBusinessLogic();
        publisher.unsubscribe(s2);
        publisher.mainBusinessLogic();
    }
}

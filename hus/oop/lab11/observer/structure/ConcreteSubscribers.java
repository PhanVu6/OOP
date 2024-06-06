package observer.structure;

public class ConcreteSubscribers implements Subscriber {
    @Override
    public void update(Publisher context) {
        System.out.println("The size of members changed, the size now is "
                + context.getSize());
    }
}

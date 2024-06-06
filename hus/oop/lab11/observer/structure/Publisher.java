package observer.structure;

public class Publisher {
    private Subscriber[] subscribers;
    private int mainState;
    private final int SIZE_ARR = 8;
    private int size;

    public Publisher() {
        this.subscribers = new Subscriber[8];
        this.mainState = 0;
        size = 0;
    }

    public void subscribe(Subscriber subscriber) {
        if (this.size >= subscribers.length) {
            enlarge();
        }
        this.subscribers[size] = subscriber;
        this.size++;
    }

    public void unsubscribe(Subscriber subscriber) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (this.subscribers[i].equals(subscriber)) {
                index = i;
            }
        }

        if (index != -1) {
            for (int i = index; i < size - 1; i++) {
                subscribers[i] = subscribers[i + 1];
            }
            size--;
        } else {
            System.out.println("Don't find required subscriber");
        }
    }

    private boolean checkIndex(int index, int limit) {
        if (index < 0 || index >= limit) {
            return false;
        } else {
            return true;
        }
    }

    public void notifySubcriber() {
        for (int i = 0; i < this.size; i++) {
            this.subscribers[i].update(this);
        }
    }

    public void mainBusinessLogic() {
        if (this.mainState != this.size) {
            this.mainState = this.size;
            notifySubcriber();
        }
    }

    private void enlarge() {
        Subscriber[] newSubs = new Subscriber[this.subscribers.length * 2];
        System.arraycopy(subscribers, 0, newSubs, 0, this.subscribers.length);
        this.subscribers = newSubs;
    }

    public int getMainState() {
        return mainState;
    }

    public int getSize() {
        return size;
    }
}

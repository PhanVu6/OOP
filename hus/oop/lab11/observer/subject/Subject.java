package observer.subject;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observerList;
    private int state;

    public Subject() {
        observerList = new ArrayList<>();
        state = 0;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        if (this.state == state) {
            return;
        }
        this.state = state;
        this.notifyAllObserver();
    }

    public void attach(Observer observer) {
        observerList.add(observer);
    }

    public void notifyAllObserver() {
        for (Observer observer : observerList) {
            observer.update();
        }
    }
}

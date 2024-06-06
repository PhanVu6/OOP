package observer.pseucode;

import java.util.*;

public class EventManager {
    private HashMap<EventListeners, String> listeners;

    public EventManager() {
        this.listeners = new HashMap<>();
    }

    public void subscribe(String eventType, EventListeners listener) {
        listeners.put(listener, eventType);
    }

    public void unsubscribe(String eventType, EventListeners listener) {
        listeners.remove(listener, eventType);
    }

    public void notify(String eventType, String data) {
        for (EventListeners listener : getKeysByValue(this.listeners, eventType)) {
            listener.update(data);
        }
    }

    private Set<EventListeners> getKeysByValue(Map<EventListeners, String> map, String event) {
        Set<EventListeners> keys = new HashSet<>();
        for (Map.Entry<EventListeners, String> entry : map.entrySet()) {
            if (Objects.equals(event, entry.getValue())) {
                keys.add(entry.getKey());
            }
        }
        return keys;
    }
}

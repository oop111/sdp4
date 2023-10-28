import java.util.ArrayList;
import java.util.List;

public class TrafficManagement {
    private List<TrafficObserver> observers = new ArrayList<>();

    // Register observers
    public void addObserver(TrafficObserver observer) {
        observers.add(observer);
    }

    // Notify observers of a traffic event
    public void notifyObservers(String eventType, String location) {
        for (TrafficObserver observer : observers) {
            observer.update(eventType, location);
        }
    }

    public List<TrafficObserver> getObservers() {
        return observers;
    }

    public void setObservers(List<TrafficObserver> observers) {
        this.observers = observers;
    }
}

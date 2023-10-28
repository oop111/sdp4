public class TrafficDisplay implements TrafficObserver {
    private String displayName;

    public TrafficDisplay(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public void update(String eventType, String location) {
        System.out.println(displayName + ": Traffic event - " + eventType + " at " + location);
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
}

public class Main {
    public static void main(String[] args) {
        TrafficManagement management1 = new TrafficManagement();
        TrafficManagement management2 = new TrafficManagement();

        TrafficObserver display1 = new TrafficDisplay("Display 1");
        TrafficObserver display2 = new TrafficDisplay("Display 2");
        TrafficObserver display3 = new TrafficDisplay("Display 3");

        management1.addObserver(display1);
        management1.addObserver(display2);
        management2.addObserver(display2);
        management2.addObserver(display3);
        management1.notifyObservers(TrafficEvent.ROAD_CLOSED, "Mangilik el");
        management2.notifyObservers(TrafficEvent.ACCIDENT, "Bukhar Zhyrau - Turkestan");
    }
}
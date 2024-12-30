import java.util.ArrayList;
import java.util.List;

// Subject class
class WeatherStation {
    private List<Observer> observers = new ArrayList<>();
    private float temperature;

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }
}

// Observer class
class Display implements Observer {
    private String displayType;

    public Display(String displayType) {
        this.displayType = displayType;
    }

    @Override
    public void update(float temperature) {
        System.out.println(displayType + " updated: " + temperature + "°C");
    }
}

// Observer interface
interface Observer {
    void update(float temperature);
}

// Main
public class observer {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        // Create observers
        Display tempDisplay = new Display("Temperature Display");
        Display forecastDisplay = new Display("Forecast Display");

        // Register observers
        weatherStation.addObserver(tempDisplay);
        weatherStation.addObserver(forecastDisplay);

        // Change weather data
        weatherStation.setTemperature(27.5f);  // Notify all observers
    }
}

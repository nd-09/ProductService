package Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {
  private List<Observer> observers;
  private float temperature;
  private float humidity;
  private float pressure;
    public WeatherStation() {
        observers = new ArrayList<>();
    }
    @Override
    public void register(Observer observer) {
     observers.add(observer);
     System.out.println("Observer "+observer.getClass()+" registered");
    }

    @Override
    public void unregister(Observer observer) {
    observers.remove(observer);
    System.out.println("Observer "+observer.getClass()+" has been unregistered.");
    }

    @Override
    public void notifyObservers() {
        System.out.println("Notifying observers....");
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    private void weatherDataChanged(){
        notifyObservers();
    }
    public void setWeatherData(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        weatherDataChanged();
//      here we might also call notifyObservers(); directly but in order to perform some extra operations
//     before we notify our observers we can perform it
    }
}

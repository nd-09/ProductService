package Observer;


public class WeatherStationDisplay implements Observer,DisplayWeather {
    private float temperature;
    private float humidity;
    private float pressure;

    @Override
    public void display() {
        System.out.println("Current Data at weather station");
        System.out.println("Current temperature: " + temperature);
        System.out.println(" "+"Current humidity: " + humidity);
        System.out.println(" "+"Current pressure: " + pressure);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}

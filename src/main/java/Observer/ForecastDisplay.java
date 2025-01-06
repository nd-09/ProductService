package Observer;

public class ForecastDisplay implements Observer,DisplayWeather{
    private float temperature=50;
    private float humidity=60;
    private float pressure=1000;
    private float previousHumidity;
    private float previousPressure;

    @Override
    public void display() {
        System.out.println("Forecast Display");
        System.out.println("Temperature: " + temperature);
        System.out.println("Humidity: " + humidity);
        System.out.println("Pressure: " + pressure+" ");
        if(humidity > previousHumidity && pressure < previousPressure){
            System.out.println();
            System.out.println("It is going to be Rainy days ahead");
        }else if(humidity < previousHumidity && pressure > previousPressure){
            System.out.println();
            System.out.println("The weather seems like cold days are ahead");
        }else{
            System.out.println();
            System.out.println("The weather is clear and sunny");
        }
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        previousHumidity=humidity;
        previousPressure=pressure;
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}

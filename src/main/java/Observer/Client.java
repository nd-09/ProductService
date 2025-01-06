package Observer;

public class Client {
    public static void main(String[] args) {
  //this will be our driver code
        WeatherStation weatherData = new WeatherStation();// this is our central data station for weather
        Observer weatherDisplay=new WeatherStationDisplay();// this is one of our observer
        Observer ForecastDisplay=new ForecastDisplay();//this is our 2nd observer
        weatherData.register(weatherDisplay);
        weatherData.register(ForecastDisplay);

        weatherData.setWeatherData(60f,50f,1007);
        weatherData.notifyObservers();
        weatherData.setWeatherData(90f,50f,1007);
        weatherData.notifyObservers();
        weatherData.setWeatherData(24f,20f,10);
        weatherData.notifyObservers();
    }
}

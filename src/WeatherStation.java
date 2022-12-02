import weatherstation.CurrentConditionsDisplay;
import weatherstation.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisp = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80,65,30.4f);
        weatherData.setMeasurements(82,75,35.4f);
        weatherData.setMeasurements(78,95,32.8f);
    }
}

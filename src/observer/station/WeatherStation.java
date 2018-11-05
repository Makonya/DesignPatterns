package observer.station;

import observer.observer.CurrentConditionsDisplay;
import observer.subject.WeatherData;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(-1,65,30.9f);
        weatherData.setMeasurements(3,70,29.2f);
        weatherData.setMeasurements(5,90,29.2f);
    }
}

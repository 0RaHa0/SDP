package Task_42;

public class Main {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay();
        StatisticsDisplay statsDisplay = new StatisticsDisplay();
        ForecastDisplay forecastDisplay = new ForecastDisplay();

        station.addDisplay(currentDisplay);
        station.addDisplay(statsDisplay);
        station.addDisplay(forecastDisplay);

        station.setWeatherData(25, 65, 1013);
        station.setWeatherData(28, 70, 1010);
    }
}

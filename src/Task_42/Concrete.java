package Task_42;

class CurrentConditionsDisplay implements WeatherDisplay {
    public void update(double temperature, double humidity, double pressure) {
        System.out.println("Current conditions: " + temperature + "C degrees, " + humidity + "% humidity");
    }
}

class StatisticsDisplay implements WeatherDisplay {
    public void update(double temperature, double humidity, double pressure) {
        System.out.println("Statistics: Temp: " + temperature + "C, Humidity: " + humidity + "%");
    }
}

class ForecastDisplay implements WeatherDisplay {
    public void update(double temperature, double humidity, double pressure) {
        System.out.println("Forecast: Pressure is " + pressure + " hPa");
    }
}
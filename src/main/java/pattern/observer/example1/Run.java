package pattern.observer.example1;

public class Run {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay =
                new CurrentConditionsDisplay(weatherData);

        StatisticsDisplay statisticsDisplay =
                new StatisticsDisplay(weatherData);

        weatherData.setState(80,10,60);
        weatherData.setState(85,15,65);
    }
}

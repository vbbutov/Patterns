public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(122, 111, 1110);
        weatherData.setMeasurements(35, 222, 33);
        weatherData.setMeasurements(1, 45, 27);
    }
}

package observerPattern.observer;

import observerPattern.subject.WeatherData;

public class StatisticsDisplay implements Observer{
    private float temperature;
    private float humidity;
    private float pressure;
    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
    }

    @Override
    public void updatePush(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        display();
    }

    @Override
    public void updatePull() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        this.pressure = weatherData.getPressure();

        display();
    }

    public void display() {
        System.out.println("기상 통계 화면의 값이 갱신되었습니다.");
        System.out.println("Temperature: " + temperature + ", Humidity: " + humidity + ", Pressure: " + pressure + "\n");
    }
}

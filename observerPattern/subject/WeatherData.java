package observerPattern.subject;

import observerPattern.observer.Observer;

import java.util.ArrayList;

public class WeatherData implements Subject {
    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    // 기상 스테이션으로 부터 측정값을 받아오는 역할
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        notifyObserversPush();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserversPush() {
        for (Observer observer : observers) {
            observer.updatePush(this.temperature, this.humidity, this.pressure);
        }
    }

    @Override
    public void notifyObserversPull() {
        for (Observer observer : observers) {
            observer.updatePull();
        }
    }


    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}

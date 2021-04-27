package observerPattern;

import observerPattern.observer.ForecastDisplay;
import observerPattern.observer.RecordDisplay;
import observerPattern.observer.StatisticsDisplay;
import observerPattern.subject.WeatherData;

public class ObserverTest {
    public void start() {
        System.out.println("Observer Pattern Test");
        WeatherData weatherData = new WeatherData();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        RecordDisplay recordDisplay = new RecordDisplay(weatherData);

        // 기상 스테이션이 새로운 측정값을 보냄
        weatherData.setMeasurements(23, 50, 1000);

        // 기상 통계 화면(옵저버 객체) 등록
        weatherData.registerObserver(statisticsDisplay);

        // 기상 스테이션이 새로운 측정값을 보냄
        weatherData.setMeasurements(21, 53, 1002);
        System.out.println("----------------------------------------------------");

        // 기상 예보 화면(옵저버 객체) 등록
        weatherData.registerObserver(forecastDisplay);

        // 기상 스테이션이 새로운 측정값을 보냄
        weatherData.setMeasurements(20, 48, 1012);
        System.out.println("----------------------------------------------------");

        // 기상 기록 화면(옵저버 객체) 등록
        weatherData.registerObserver(recordDisplay);

        // 기상 스테이션이 새로운 측정값을 보냄
        weatherData.setMeasurements(18, 44, 1001);
        System.out.println("----------------------------------------------------");

        // 기상 통계 화면(옵저버 객체) 제거
        weatherData.removeObserver(statisticsDisplay);

        // 기상 스테이션이 새로운 측정값을 보냄
        weatherData.setMeasurements(16, 44, 1012);
        System.out.println("----------------------------------------------------");

    }
}

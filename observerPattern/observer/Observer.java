package observerPattern.observer;

public interface Observer {
    public void updatePush(float temperature, float humidity, float pressure);
    public void updatePull();
}

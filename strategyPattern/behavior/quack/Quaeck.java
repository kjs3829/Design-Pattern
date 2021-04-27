package strategyPattern.behavior.quack;

public class Quaeck implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("꽥");
    }
}

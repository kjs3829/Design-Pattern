package strategyPattern.behavior.quack;

public class Bbick implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("삑");
    }
}

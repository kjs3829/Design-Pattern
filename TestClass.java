import decoratorPattern.DecoratorTest;
import observerPattern.ObserverTest;
import strategyPattern.StrategyTest;

public class TestClass {
    private static StrategyTest strategyTest = new StrategyTest();
    private static ObserverTest observerTest = new ObserverTest();
    private static DecoratorTest decoratorTest = new DecoratorTest();

    public static void main(String args[]) {
        strategyTest.start();
        observerTest.start();
        decoratorTest.start();
    }
}

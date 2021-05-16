import decoratorPattern.DecoratorTest;
import observerPattern.ObserverTest;
import singletonPattern.SingletonTest;
import strategyPattern.StrategyTest;

public class TestClass {
    private static StrategyTest strategyTest = new StrategyTest();
    private static ObserverTest observerTest = new ObserverTest();
    private static DecoratorTest decoratorTest = new DecoratorTest();
    private static SingletonTest singletonTest = new SingletonTest();

    public static void main(String args[]) {
        strategyTest.start();
        observerTest.start();
        decoratorTest.start();
        singletonTest.start();
    }
}

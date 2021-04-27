import observerPattern.ObserverTest;
import strategyPattern.StrategyTest;

public class TestClass {
    private static StrategyTest strategyTest = new StrategyTest();
    private static ObserverTest observerTest = new ObserverTest();

    public static void main(String args[]) {
        strategyTest.start();
        observerTest.start();
    }
}

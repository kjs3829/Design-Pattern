package strategyPattern;

import strategyPattern.behavior.fly.FlyBehavior;
import strategyPattern.behavior.fly.FlyNoWay;
import strategyPattern.behavior.fly.FlyWithWings;
import strategyPattern.behavior.quack.Bbick;
import strategyPattern.behavior.quack.Quack;
import strategyPattern.behavior.quack.QuackBehavior;
import strategyPattern.behavior.quack.Quaeck;
import strategyPattern.duck.Duck;
import strategyPattern.duck.MallardDuck;
import strategyPattern.duck.RedheadDuck;
import strategyPattern.duck.RubberDuck;

public class StrategyTest {
    public void start() {
        System.out.println("Strategy Pattern Test");
        FlyBehavior flyWithWings = new FlyWithWings();
        FlyBehavior flyNoWay = new FlyNoWay();
        QuackBehavior quack = new Quack();
        QuackBehavior quaeck = new Quaeck();
        QuackBehavior bbick = new Bbick();

        System.out.println("RedheadDuck");
        Duck redheadDuck = new RedheadDuck();
        redheadDuck.setFlyBehavior(flyWithWings);
        redheadDuck.setQuackBehavior(quack);
        redheadDuck.performFly();      // 저는 날고 있어요!
        redheadDuck.performQuack();    // "꽉"
        System.out.println();

        System.out.println("MallardDuck");
        Duck mallardDuck = new MallardDuck();
        mallardDuck.setFlyBehavior(flyWithWings);
        mallardDuck.setQuackBehavior(quaeck);
        mallardDuck.performFly();      // 저는 날고 있어요!
        mallardDuck.performQuack();    // "꽥"
        System.out.println();

        System.out.println("RubberDuck");
        Duck rubberDuck = new RubberDuck();
        rubberDuck.setFlyBehavior(flyNoWay);
        rubberDuck.setQuackBehavior(bbick);
        rubberDuck.performFly();      // 저는 날지 못해요!
        rubberDuck.performQuack();    // "삑"
        System.out.println();
    }

}

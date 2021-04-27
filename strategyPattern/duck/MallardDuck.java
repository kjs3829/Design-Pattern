package strategyPattern.duck;

import strategyPattern.behavior.fly.FlyBehavior;
import strategyPattern.behavior.quack.QuackBehavior;

public class MallardDuck extends Duck{

    public MallardDuck() {
    }

    public MallardDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    @Override
    public void display() {
        // RedheadDuck 외형 출력
    }
}

package strategyPattern.behavior.fly;

import strategyPattern.behavior.fly.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("저는 날지 못해요!");
    }
}

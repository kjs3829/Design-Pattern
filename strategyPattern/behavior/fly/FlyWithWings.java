package strategyPattern.behavior.fly;

import strategyPattern.behavior.fly.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("저는 날개로 날고있어요!");
    }
}

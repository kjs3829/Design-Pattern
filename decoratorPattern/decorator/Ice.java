package decoratorPattern.decorator;

import decoratorPattern.Beverage;

public class Ice extends CondimentDecorator {
    Beverage beverage;

    public Ice(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int cost() {
        return beverage.cost() + 0;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 아이스";
    }
}

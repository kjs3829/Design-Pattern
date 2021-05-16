package decoratorPattern.component;

import decoratorPattern.Beverage;

public class IceTea extends Beverage {

    public IceTea() {
        description = "아이스티";
    }

    @Override
    public int cost() {
        return 2000;
    }
}

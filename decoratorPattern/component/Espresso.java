package decoratorPattern.component;

import decoratorPattern.Beverage;

public class Espresso extends Beverage {

    public Espresso() {
        description = "에스프레소";
    }

    @Override
    public int cost() {
        return 4000;
    }
}

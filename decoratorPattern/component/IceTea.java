package decoratorPattern.component;

import decoratorPattern.Beverage;

public class Americano extends Beverage {

    public Americano() {
        description = "아메리카노";
    }

    @Override
    public int cost() {
        return 2000;
    }
}

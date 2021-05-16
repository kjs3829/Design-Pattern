package decoratorPattern.component;

import decoratorPattern.Beverage;

public class Decaf extends Beverage {

    public Decaf() {
        description = "디카페인";
    }

    @Override
    public int cost() {
        return 3000;
    }
}

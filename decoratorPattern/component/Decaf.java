package decoratorPattern.component;

import decoratorPattern.Beverage;

public class Decaf extends Beverage {

    public Decaf() {
        description = "๋์นดํ์ธ";
    }

    @Override
    public int cost() {
        return 3000;
    }
}

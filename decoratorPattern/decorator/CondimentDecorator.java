package decoratorPattern.decorator;

import decoratorPattern.Beverage;

public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}

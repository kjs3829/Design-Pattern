package decoratorPattern;

import decoratorPattern.component.Americano;
import decoratorPattern.component.Espresso;
import decoratorPattern.decorator.Ice;
import decoratorPattern.decorator.Mocha;
import decoratorPattern.decorator.Whip;

public class DecoratorTest {

    public void start() {
        System.out.println("Decoration Pattern Test");
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $ " + beverage.cost());

        Beverage beverage2 = new Americano();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Ice(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $ " + beverage2.cost());

        Beverage beverage3 = new Whip(new Ice(new Mocha(new Americano())));
        System.out.println(beverage3.getDescription() + " $ " + beverage3.cost());
    }
}

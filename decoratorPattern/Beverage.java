package decoratorPattern;

public abstract class Beverage {
    public String description;

    public String getDescription() {
        return description;
    }

    public abstract int cost();
}

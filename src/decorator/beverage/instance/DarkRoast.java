package decorator.beverage.instance;

import decorator.beverage.Beverage;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        setDescription("Dark Roast");
    }

    @Override
    public double cost() {
        return 0.99;
    }
}

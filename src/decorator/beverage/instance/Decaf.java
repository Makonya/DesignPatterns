package decorator.beverage.instance;

import decorator.beverage.Beverage;

public class Decaf extends Beverage {
    public Decaf() {
        setDescription("Decaf");
    }

    @Override
    public double cost() {
        return 0;
    }
}

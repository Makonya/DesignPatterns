package decorator.beverage.instance;

import decorator.beverage.Beverage;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        setDescription("House Blend");
    }

    @Override
    public double cost() {
        return 0.89;
    }
}

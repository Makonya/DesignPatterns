package strategy.duck;

import strategy.behavior.fly.FlyWithWings;
import strategy.behavior.quack.Quack;

public class MallarDuck extends Duck{
    @Override
    public void display() {
        System.out.println("I am Mallar Duck!");
    }

    public MallarDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
}

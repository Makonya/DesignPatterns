package strategy;

import strategy.behavior.fly.FlyRocketPowered;
import strategy.duck.Duck;
import strategy.duck.MallarDuck;
import strategy.duck.ModelDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {

        //Mallar Duck
        Duck mallarDuck = new MallarDuck();
        mallarDuck.performFly();
        mallarDuck.performQuack();

        //Model Duck
        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
    }
}

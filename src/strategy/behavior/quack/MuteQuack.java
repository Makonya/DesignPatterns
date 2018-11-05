package strategy.behavior.quack;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Sorry, I can not quack!");
    }
}

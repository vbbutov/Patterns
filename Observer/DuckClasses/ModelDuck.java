package Observer.DuckClasses;

import Observer.DuckActionClasses.FlyNoWay;
import Observer.DuckActionClasses.Quack;

public class ModelDuck extends Duck{
    public ModelDuck() {
        flyBehaviorInterface = new FlyNoWay();
        quackBehaviorInterface = new Quack();
        }
    public void display() {
        System.out.println("I’m a model duck");
        }
}

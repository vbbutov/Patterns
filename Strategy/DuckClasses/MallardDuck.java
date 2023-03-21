package Observer.DuckClasses;

import Observer.DuckActionClasses.FlyWithWings;
import Observer.DuckActionClasses.Quack;

public class MallardDuck extends Duck {
    public MallardDuck(){
        super();
        quackBehaviorInterface = new Quack();
        flyBehaviorInterface = new FlyWithWings();
    }
    public void display(){
        System.out.println("I’m a real Mallard duck");
    }
}

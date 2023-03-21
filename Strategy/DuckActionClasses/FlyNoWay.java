package Observer.DuckActionClasses;

import Observer.DuckInterfaces.FlyBehaviorInterface;

public class FlyNoWay implements FlyBehaviorInterface{
    @Override
    public void fly() {
        System.out.println("I can’t fly");
    }
}

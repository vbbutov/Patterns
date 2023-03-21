package Observer.DuckActionClasses;

import Observer.DuckInterfaces.FlyBehaviorInterface;

public class FlyWithWings implements FlyBehaviorInterface{
    @Override
    public void fly() {
        System.out.println("I’m flying!!");
    }
}

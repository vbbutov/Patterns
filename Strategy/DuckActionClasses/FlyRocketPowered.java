package Observer.DuckActionClasses;

import Observer.DuckInterfaces.FlyBehaviorInterface;

public class FlyRocketPowered implements FlyBehaviorInterface{
    public void fly() {
        System.out.println("I’m flying with a rocket!");
        }
}

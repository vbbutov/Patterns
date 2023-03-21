package Observer.DuckActionClasses;

import Observer.DuckInterfaces.QuackBehaviorInterface;

public class Squeak implements QuackBehaviorInterface {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}

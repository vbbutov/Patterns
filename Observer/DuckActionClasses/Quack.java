package Observer.DuckActionClasses;

import Observer.DuckInterfaces.QuackBehaviorInterface;

public class Quack implements QuackBehaviorInterface{
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}

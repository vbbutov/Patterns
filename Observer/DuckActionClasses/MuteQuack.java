package Observer.DuckActionClasses;

import Observer.DuckInterfaces.QuackBehaviorInterface;

public class MuteQuack implements QuackBehaviorInterface{
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}

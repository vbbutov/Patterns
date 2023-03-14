package Observer.DuckClasses;

import Observer.DuckInterfaces.FlyBehaviorInterface;
import Observer.DuckInterfaces.QuackBehaviorInterface;

public abstract class Duck{
    FlyBehaviorInterface flyBehaviorInterface;
    QuackBehaviorInterface  quackBehaviorInterface;
    public abstract void display();
    public void performFly() {
        flyBehaviorInterface.fly();
    }
    public void performQuack() {
        quackBehaviorInterface.quack();
    }
    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
    public void setFlyBehavior(FlyBehaviorInterface fb){
        this.flyBehaviorInterface = fb;
    }
    public void setQuackBehavior(QuackBehaviorInterface qa){
        this.quackBehaviorInterface = qa;
    }
}
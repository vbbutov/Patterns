package Store;
import Factory.*;
import Pizza.Pizza;
public abstract class PizzaStore {
    SimpleFactoryPizza factory;
    public PizzaStore(SimpleFactoryPizza factory){
        this.factory = factory;
    }
    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
    protected abstract Pizza createPizza(String type);
}

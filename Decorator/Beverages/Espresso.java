package Beverages;
public class Espresso extends Beverage{

    @Override
    public double cost() {
        return 1.99;
    }

    public Espresso(){
       this.description = "Espresso";
    }
    
}

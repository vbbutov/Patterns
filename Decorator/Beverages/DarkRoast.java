package Beverages;
public class DarkRoast extends Beverage{

    public DarkRoast() {
        this.description = "DarkRoast";
    }

    @Override
    public double cost() {
       return .99;
    }
    
}

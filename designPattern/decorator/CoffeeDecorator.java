package designPattern.decorator;

public class CoffeeDecorator implements ICoffee {

    protected ICoffee coffee;

    public CoffeeDecorator(ICoffee coffee)
    {
        this.coffee = coffee;
    }

    public String description()
    {
        return coffee.description();
    }

    public int cost() {return coffee.cost();}
    
}

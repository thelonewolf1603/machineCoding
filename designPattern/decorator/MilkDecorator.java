package designPattern.decorator;

public class MilkDecorator extends CoffeeDecorator {
    
    public MilkDecorator(ICoffee coffee)
    {
        super(coffee);
    }

    @Override
    public String description()
    {
        return super.description() + " with milk";
    }

    @Override
    public int cost()
    {
        return super.cost() + 10;
    }


}

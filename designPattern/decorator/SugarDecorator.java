package designPattern.decorator;

public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(ICoffee coffee)
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
        return super.cost() + 5;
    }

}

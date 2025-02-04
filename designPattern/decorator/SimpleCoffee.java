package designPattern.decorator;

public class SimpleCoffee implements ICoffee{

    public String description()
    {
        return "Simple coffee";
    }

    public int cost()
    {
        return 20;
    }
    
}

package designPattern.decorator;

public class Main {

    public static void main(String args[])
    {
        System.out.println("decorator pattern example... \n");

        ICoffee simplCoffee = new SimpleCoffee();
        ICoffee coffeeWithMilk = new MilkDecorator(simplCoffee);
        ICoffee coffeeWithMilkWithSugar = new SugarDecorator(coffeeWithMilk);
        ICoffee coffeeWithSugar = new SugarDecorator(simplCoffee);


        System.out.println(simplCoffee.cost());
        System.out.println(coffeeWithMilk.cost());
        System.out.println(coffeeWithMilkWithSugar.cost());
        System.out.println(coffeeWithSugar.cost());



    }
    
}

package designPattern.factory;

public class Main {
    public static void main(String args[])
    {
        ShapeFactory factory = new ShapeFactory();
        IShape circle = factory.createShape("Circle");
        IShape square = factory.createShape("Square");
        IShape triangle = factory.createShape("Triangle");

        triangle.draw();
        circle.draw();
        square.draw(); 

    }
}

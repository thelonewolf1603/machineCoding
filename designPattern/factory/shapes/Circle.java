package designPattern.factory.shapes;

import designPattern.factory.IShape;

public class Circle implements IShape{
    
    public void draw()
    {
        System.out.println("draw circle");
    }
}

package machineCoding.designPattern.factory.shapes;

import machineCoding.designPattern.factory.IShape;

public class Circle implements IShape{
    
    public void draw()
    {
        System.out.println("draw circle");
    }
}

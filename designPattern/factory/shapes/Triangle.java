package machineCoding.designPattern.factory.shapes;

import machineCoding.designPattern.factory.IShape;

public class Triangle implements IShape{

    public void draw()
    {
        System.out.println("draw triangle");
    }

}

package machineCoding.designPattern.factory;

import machineCoding.designPattern.factory.shapes.Circle;
import machineCoding.designPattern.factory.shapes.Square;
import machineCoding.designPattern.factory.shapes.Triangle;

public class ShapeFactory {

    public IShape createShape(String shape)
    {
        switch(shape) {
            case "Square":  
                return new Square();
            case "Circle":
                return new Circle();
            case "Triangle":
                return new Triangle();
            default: 
                return null;
        }
    }
    
}

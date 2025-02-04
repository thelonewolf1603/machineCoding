package designPattern.adapter;

public class NewCharger implements ICharger {

    public void charge220V()
    {
        System.out.println("charge at 220V...");
    }
    
}

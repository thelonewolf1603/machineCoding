package designPattern.command;

public class TurnOffCommand implements Command{

    private Light light;

    public TurnOffCommand(Light light)
    {
        this.light = light;
    }

    public void pressButton()
    {
        this.light.turnOff();
    }
    
}

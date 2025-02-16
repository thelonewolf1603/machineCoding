package designPattern.command;

public class TurnOnCommand implements Command {

    private Light light;

    public TurnOnCommand(Light light)
    {
        this.light = light;
    }

    public void pressButton()
    {
        this.light.turnOn();
    }
    
}

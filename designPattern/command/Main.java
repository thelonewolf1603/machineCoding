package designPattern.command;

public class Main {

    public static void main(String args[])
    {
        System.out.println("Command pattern example... \n");

        Light light = new Light();
        Remote remote = new Remote();
        TurnOffCommand turnOffCommand = new TurnOffCommand(light);
        TurnOnCommand turnOnCommand = new TurnOnCommand(light);

        remote.setCommand(turnOnCommand);
        remote.pressButton();

        remote.setCommand(turnOffCommand);
        remote.pressButton();
    }
    
}

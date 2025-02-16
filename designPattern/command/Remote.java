package designPattern.command;

public class Remote {

    private Command command;

    public void setCommand(Command command) {this.command = command;}

    public void pressButton()
    {
        this.command.pressButton();
    }
    
}

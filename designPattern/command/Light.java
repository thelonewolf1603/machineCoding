package designPattern.command;

public class Light {
    private int brightness;
    private boolean On;

    public void turnOn()
    {
        System.out.println("Light is turned on");
        this.On = true;
    }

    public void turnOff()
    {
        System.out.println("Light is turned off");
        this.On = false;
    }

    public void adjustBrightness(int brightness)
    {
        this.brightness = brightness;
    }
}

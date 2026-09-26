package behavioural.command;

public class LightCommand implements command{
    Light light;

    LightCommand(Light light)
    {
        this.light =light;
    }

    @Override
    public void execute() {
        light.on();

    }
}

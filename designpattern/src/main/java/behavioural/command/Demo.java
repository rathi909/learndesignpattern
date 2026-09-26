package behavioural.command;

public class Demo {
    public static <Command> void main(String[] args) {

        // Encapsulates a request as a commands
        Light light = new Light();
        command command = new LightCommand(light);
        command.execute();
    }
}

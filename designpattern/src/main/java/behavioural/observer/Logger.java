package behavioural.observer;

public class Logger implements Observer{
    @Override
    public void update(String event) {
        System.out.println("Log events");
    }
}

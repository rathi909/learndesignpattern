package creational1.AbstractFactory;

public class WindowButton implements Button{

    @Override
    public void paint() {
        System.out.println("Window Button");
    }
}

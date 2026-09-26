package structural.adaptor.bridge;

public class SonyTV implements TV{

    @Override
    public void on() {
        System.out.println("Sony TV On");
    }

    @Override
    public void off() {
    System.out.println("Sony Tv off");
    }
}

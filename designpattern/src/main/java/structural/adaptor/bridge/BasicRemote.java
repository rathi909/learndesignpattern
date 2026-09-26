package structural.adaptor.bridge;

public class BasicRemote extends Remote{

    public BasicRemote(TV tv) {
        super(tv);
    }

    @Override
    void operte() {
      tv.on();
    }
}

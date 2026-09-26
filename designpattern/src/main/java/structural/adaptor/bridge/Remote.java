package structural.adaptor.bridge;

public abstract class Remote {

    protected final TV tv;

    public Remote(TV tv) {
        this.tv = tv;
    }

    abstract void operte();
}

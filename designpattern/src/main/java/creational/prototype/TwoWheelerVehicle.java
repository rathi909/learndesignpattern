package creational.prototype;

public class TwoWheelerVehicle extends Vehicle {

    private boolean isAutomatic;
    public TwoWheelerVehicle(String engine, String model, long price, boolean isAutomatic) {
        super(engine, model, price);
        this.isAutomatic = isAutomatic;
    }

    protected  TwoWheelerVehicle clone() throws  CloneNotSupportedException{
        return (TwoWheelerVehicle) super.clone();
    }
}

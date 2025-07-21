package creational.prototype;

public class FourWheelerVehicle extends Vehicle{
private  boolean isElectric;
private boolean isDiesel;

    public FourWheelerVehicle(String engine, String model, long price,boolean isElectric,boolean isDiesel) {
        super(engine, model, price);
        this.isElectric = isElectric;
        this.isDiesel = isDiesel;
    }

    protected  FourWheelerVehicle clone() throws  CloneNotSupportedException{
      return (FourWheelerVehicle) super.clone();
    }
}

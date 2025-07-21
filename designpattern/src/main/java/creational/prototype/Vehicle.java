package creational.prototype;

public abstract class Vehicle implements Cloneable {

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public Vehicle(String engine, String model, long price) {
        this.engine = engine;
        this.model = model;
        this.price = price;
    }

    public String getEngine() {
        return engine;
    }

    public String getModel() {
        return model;
    }

    public long getPrice() {
        return price;
    }

    private String engine;

    private String model;

    private long price;

    protected Vehicle clone() throws CloneNotSupportedException{
        return (Vehicle) super.clone();
    }

}

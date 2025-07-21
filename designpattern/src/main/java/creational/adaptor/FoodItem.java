package creational.adaptor;

public class FoodItem implements Item{
    @Override
    public String getrestaurant() {
        return "HaldiRams";
    }

    @Override
    public String itemName() {
        return "biscuit";
    }

    @Override
    public String getPrice() {
        return "100";
    }
}

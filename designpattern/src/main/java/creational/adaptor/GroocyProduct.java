package creational.adaptor;

public class GroocyProduct implements GrocryItem{
    @Override
    public String getItem() {
        return "Salt";
    }

    @Override
    public String getPrice() {
        return "30";
    }

    @Override
    public String getStoreName() {
        return "DMART";
    }
}

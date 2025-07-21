package creational.adaptor;

public class GrocyItemAdaptor implements Item{

    private GrocryItem item;

    public GrocyItemAdaptor(GrocryItem item){
        item = item;
    }
    @Override
    public String getrestaurant() {
        return item.getStoreName();
    }

    @Override
    public String itemName() {
        return item.getItem();
    }

    @Override
    public String getPrice() {
        return item.getPrice();
    }
}

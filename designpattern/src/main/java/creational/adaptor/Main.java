package creational.adaptor;

public class Main {

// Swiggy store can adapt to item and 
    public static void main(String[] args) {
        SwiggyStore swiggyStore = new SwiggyStore();
        swiggyStore.addLItem(new FoodItem());
        swiggyStore.addLItem(new FoodItem());

        swiggyStore.addLItem(new GrocyItemAdaptor(new GroocyProduct()));
    }



}

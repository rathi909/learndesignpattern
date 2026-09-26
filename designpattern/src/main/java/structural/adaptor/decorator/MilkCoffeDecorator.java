package structural.adaptor.decorator;

public class MilkCoffeDecorator extends CoffeDecorator {

    public MilkCoffeDecorator(Cofee cofee) {
        super(cofee);
    }

    @Override
    public String description() {
        return cofee.description() + "Milk";
    }

    @Override
    public int cost() {

        return cofee.cost() + 20;
    }
}

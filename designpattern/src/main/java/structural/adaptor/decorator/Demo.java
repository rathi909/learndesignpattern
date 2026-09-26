package structural.adaptor.decorator;

public class Demo {
    public static void main(String[] args) {
        Cofee cofee = new MilkCoffeDecorator(new BasicCoffe());
        cofee.cost();
        cofee.description();

    }
}

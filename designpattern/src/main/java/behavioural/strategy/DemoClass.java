package behavioural.strategy;

public class DemoClass{

    public static void main(String[] args) {

        Checkout checkout = new Checkout(new CreditCard());
        checkout.process("Credit card");
    }
}

package behavioural.strategy;

public class CreditCard implements PaymentStargety{
    @Override
    public void pay(String amount) {
        System.out.println("Credit card payment");
    }
}

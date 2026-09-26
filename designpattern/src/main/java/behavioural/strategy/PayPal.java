package behavioural.strategy;

public class PayPal implements PaymentStargety{
    @Override
    public void pay(String amount) {
        System.out.println("Paypal payment");
    }
}

package behavioural.strategy;

public class Checkout {

    private PaymentStargety paymentStargety;
    public Checkout(PaymentStargety paymentStargety){
     this.paymentStargety = paymentStargety;
     }
    public  void process(String amount)
    {
        paymentStargety.pay(amount);
    }

}

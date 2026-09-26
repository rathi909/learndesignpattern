package structural.adaptor;

public class PaymentAdaptor implements Paymnet{

    private final Paypal paypal;

    public PaymentAdaptor(Paypal paypal) {
        this.paypal = paypal;
    }

    @Override
    public void pay() {
        paypal.makePayment();
    }
}

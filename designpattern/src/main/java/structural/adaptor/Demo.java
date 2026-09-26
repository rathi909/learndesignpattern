package structural.adaptor;

public class Demo {

    public static void main(String[] args) {
        Paymnet paymnet = new PaymentAdaptor(new Paypal());
        paymnet.pay();

    }
}

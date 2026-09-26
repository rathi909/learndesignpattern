package creational.adaptor;

interface PaymentService {
    void pay();
}

class BasicPayment implements PaymentService {
    public void pay() {
        System.out.println("Processing payment");
    }
}

// Decorator
class LoggingDecorator implements PaymentService {
    private PaymentService service;

    public LoggingDecorator(PaymentService service) {
        this.service = service;
    }

    public void pay() {
        System.out.println("Logging...");
        service.pay();
    }

    public static void main(String[] args) {
        BasicPayment basicPayment = new BasicPayment();
        LoggingDecorator loggingDecorator = new LoggingDecorator(basicPayment);
        loggingDecorator.pay();
    }
}
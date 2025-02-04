package designPattern.strategy;

public class Main {

    public static void main(String args[])
    {
        PaymentContext payment = new PaymentContext();
        PaymentStrategy creditCard = new CreditCardPayment("1234");
        PaymentStrategy upi = new UpiPayment("neeladridas@oksbi");
        payment.setStrategy(creditCard);
        payment.executePayment(100);
        payment.setStrategy(upi);
        payment.executePayment(200);
    }
    
}

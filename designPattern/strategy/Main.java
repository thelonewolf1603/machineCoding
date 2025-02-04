package designPattern.strategy;
/* 
 * Strategy pattern is used when there are multiple ways to execute a particular task, we create separate class for each strategy, 
 * and execute them via a Strategy context class, by setting the strategy 
 */

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

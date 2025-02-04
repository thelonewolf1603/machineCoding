package designPattern.strategy;

public class PaymentContext{

    private PaymentStrategy strategy;

    public void setStrategy(PaymentStrategy strategy) {this.strategy = strategy;}

    public void executePayment(int amount)
    {
        this.strategy.pay(amount);
    }
    
}

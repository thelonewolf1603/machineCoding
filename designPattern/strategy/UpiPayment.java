package designPattern.strategy;

public class UpiPayment implements PaymentStrategy{

    private String upiId;
    public UpiPayment(String upiId) {this.upiId = upiId;}
    public void pay(int amount)
    {
        System.out.println("Payment of " + amount +  " done using UPI with upi-id " + this.upiId);
    }
    
}

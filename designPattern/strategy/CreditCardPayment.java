package designPattern.strategy;

public class CreditCardPayment implements PaymentStrategy{

    private String cardNumber;

    public CreditCardPayment(String cardNumber)
    {
        this.cardNumber = cardNumber;
    }

    public void pay(int amount)
    {
        System.out.println("Payment of " + amount +  " done using credit card " + this.cardNumber);
    }
    
}

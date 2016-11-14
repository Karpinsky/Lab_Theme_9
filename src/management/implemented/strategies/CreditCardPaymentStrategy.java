package management.implemented.strategies;

import management.IPayment;

public class CreditCardPaymentStrategy implements IPayment
{
    @Override
    public boolean pay(double price) {
        return false;
    }
}

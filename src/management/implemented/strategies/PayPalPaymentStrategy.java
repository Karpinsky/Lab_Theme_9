package management.implemented.strategies;

import management.IPayment;

public class PayPalPaymentStrategy implements IPayment
{
    @Override
    public boolean pay(double price) {
        return false;
    }
}

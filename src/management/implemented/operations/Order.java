package management.implemented.operations;

import items.Item;
import management.IDelivery;
import management.IPayment;

import java.util.LinkedList;

public class Order
{
    private LinkedList<Item> items;
    private IPayment payment;
    private IDelivery delivery;

    public void setPaymentStrategy(IPayment paymentStrategy)
    {
        this.payment = paymentStrategy;
    }

    public void setDeliveryStrategy(IDelivery deliveryStrategy)
    {
        this.delivery = deliveryStrategy;
    }

    public double calculateTotalPrice()
    {
        double totalPrice = 0;
        for (Item item : this.items)
        {
            totalPrice += item.getPrice();
        }

        return totalPrice;
    }

    public boolean processOrder()
    {
        return false;
    }

    public void addItem(Item item)
    {
        this.items.addLast(item);
    }

    public boolean removeItem(Item itemToRemove)
    {
        for (int i = 0; i < this.items.size(); ++i)
        {
            if (itemToRemove.getDescription().equals(this.items.get(i).getDescription()))
            {
                this.items.remove(i);
                return true;
            }
        }

        return false;
    }
}

package items.decorators;

import items.Item;

public abstract class ItemDecorator extends Item
{
    public Item itm;

    public ItemDecorator(Item itm)
    {
        this.itm = itm;
    }

    public abstract double getPrice();
}

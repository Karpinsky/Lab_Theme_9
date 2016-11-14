package items.decorators.implemented;

import items.Item;
import items.decorators.ItemDecorator;

public class BasketDecorator extends ItemDecorator
{
    public BasketDecorator(Item itm) {
        super(itm);
    }

    @Override
    public double getPrice() {
        return 12 + this.itm.getPrice();
    }

    @Override
    public String getDescription() {
        return "Item decorated with basket";
    }
}

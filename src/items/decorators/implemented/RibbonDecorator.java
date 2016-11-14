package items.decorators.implemented;

import items.Item;
import items.decorators.ItemDecorator;

public class RibbonDecorator extends ItemDecorator
{
    public RibbonDecorator(Item itm) {
        super(itm);
    }

    @Override
    public double getPrice() {
        return 23 + this.itm.getPrice();
    }

    @Override
    public String getDescription() {
        return "Item decorated with ribbon";
    }
}

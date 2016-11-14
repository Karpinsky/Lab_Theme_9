package items.decorators.implemented;

import items.Item;
import items.decorators.ItemDecorator;

public class PaperDecorator extends ItemDecorator
{
    public PaperDecorator(Item itm) {
        super(itm);
    }

    @Override
    public double getPrice() {
        return 62 + this.itm.getPrice();
    }

    @Override
    public String getDescription() {
        return "Item decorated with paper";
    }
}

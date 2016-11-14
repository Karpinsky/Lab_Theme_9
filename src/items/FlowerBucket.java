package items;

import java.util.LinkedList;
import java.util.Collection;

public class FlowerBucket extends Item
{
    private LinkedList<Item> arrayOfFlowers;

    public FlowerBucket()
    {
        this.arrayOfFlowers = new LinkedList<>();
        this.price = 1000;
    }

    public Item searchFlower(String description)
    {
        for (Item item : this.arrayOfFlowers)
        {
            if (item.getDescription().equals(description))
            {
                return item;
            }
        }

        return null;
    }

    public void addFlowers(Collection<Item> items)
    {
        this.arrayOfFlowers.addAll(items);
    }

    @Override
    public double getPrice()
    {
        return this.price;
    }

    @Override
    public String getDescription() {
        return "A bucket of vodka";
    }
}

package flowers.implemented;

import flowers.Flower;
import flowers.helpers.Spec;

public class RomashkaFlower extends Flower
{
    public RomashkaFlower(double initialPrice, Spec initialSpec)
    {
        this.price = initialPrice;
        this.spec = initialSpec;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public Spec getSpec() {
        return this.spec;
    }
}

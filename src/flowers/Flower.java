package flowers;

import flowers.helpers.Spec;

public abstract class Flower
{
    protected double price;
    protected Spec spec;

    public abstract double getPrice();
    public abstract Spec getSpec();
}

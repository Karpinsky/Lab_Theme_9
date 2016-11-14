package flowers.helpers;

public class Spec
{
    public enum Color
    {
        YELLOW, GREEN, BLUE;

        public String toString()
        {
            switch (this)
            {
                case YELLOW: return "yellow";
                case GREEN: return "green";
                case BLUE: return "blue";
                default: return "Color not found";
            }
        }
    }

    private Color color;

    public Spec(Color initialColor)
    {
        this.color = initialColor;
    }

    public Color getColor()
    {
        return this.color;
    }
}

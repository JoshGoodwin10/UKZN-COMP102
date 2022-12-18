package Question1;

public class RightRectangularPrism 
{
    private double length = 0;
    private double width = 0;
    private double height = 0;

    public RightRectangularPrism(double l, double w, double h)
    {
        if (l > 0)
            length = l;

        else if (l <= 0)
            length = 1;
        
        if (w > 0)
            width = w;

        else if (w <= 0)
            width = 1;

        if (h > 0)
            height = h;

        else if (h <= 0)
            height = 1;
    }

    public double getLength() 
    {
        return length;
    }

    public void setLength(double l) 
    {
        if (l > 0)
            length = l;

        else if (l <= 0) 
            length = 1;   
    }

    public double getHeight() 
    {
        return height;
    }

    public void setHeight(double h) 
    {
        if (h > 0)
            height = h;

        else if (h <= 0)
            height = 1;
    }

    public double getWidth() 
    {
        return width;
    }

    public void setWidth(double w) 
    {
        if (w > 0)
            width = w;

        else if (w <= 0)
            width = 1;
    }

    public double getVolume()
    {
        return getBaseArea() * height; 
    }

    public double getSurfaceArea()
    {
        return (2 * (width * length + height * length + height * width));
    }

    public double getBaseArea()
    {
        return (length * width);
    }

    public String toString()
    {
        return "Height: " + height + "\tLength: " + length + "\tWidth: " + width;
    }
}

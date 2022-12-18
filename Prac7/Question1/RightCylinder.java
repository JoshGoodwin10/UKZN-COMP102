package Question1;

public class RightCylinder 
{
    private double height = 0;
    private double radius = 0;
    
    public RightCylinder(double h, double r)
    {
        if (r > 0)
            radius = r;

        else if (r <= 0)
            radius = 1;

        if (h > 0)
            height = h;

        else if (h <= 0)
            height = 1;   
    }

    public double getHeight()
    {
        return height;
    }

    public double getRadius()
    {
        return radius;
    }

    public void setHeight(double h)
    {
        if (h <= 0)
            height = 1;
            
        else
            height = h;
    }

    public double getVolume()
    {
        return getBaseArea() * height; 
    }

    public double getSurfaceArea()
    {
        return ((2 * Math.PI * radius * height) + (2 * Math.PI * Math.pow(radius, 2)));
    }

    public double getBaseArea()
    {
        return (Math.PI * Math.pow(radius, 2));
    }

    public void setRadius(double r)
    {
        if (r <= 0)
            radius = 1;
            
        else
            radius = r;  
    }

    public String toString()
    {
        return "Radius: " + radius + "\tHeight: " + height;
    }
}

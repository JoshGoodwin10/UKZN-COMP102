package Question3;

public class Rectangle 
{
    //class attributes
    private double length = 0; 
    private double breath = 0;

    //Constructor
    public Rectangle(double l, double b)
    {
        if (l > 0 && b > 0)
        {
            length = l;
            breath = b;
        }
    }

    //method to find perimeter
    public double perimeter()
    {
        return 2 * (length + breath);
    }

    //method to find area
    public double area()
    {
        return (length * breath);
    }
}

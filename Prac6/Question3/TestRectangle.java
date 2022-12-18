package Question3;

import java.util.Scanner;

public class TestRectangle 
{
    public static void main(String[] args) 
    {
        //Scanner
        Scanner scLine = new Scanner(System.in);

        //Display Messages and inputs
        System.out.println("Enter a length for the rectangle: ");
        int len = scLine.nextInt();
        System.out.println("Enter a breath for the rectangle:");
        int bre = scLine.nextInt();
        
        //Instantiate Rectangle object
        Rectangle RM = new Rectangle(len, bre);

        //Outputs
        System.out.println("Area of rectangle: " + RM.area());
        System.out.println("Perimeter of rectangle: " + RM.perimeter());

        //Close Scanner
        scLine.close();
    }
}

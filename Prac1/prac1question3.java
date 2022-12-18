import java.util.Scanner;

public class prac1question3 
{
    public static void main(String[] args) 
    {
        //scanner for reading input from user
        Scanner scLine = new Scanner(System.in);   

        //input and display message
        System.out.println("Enter a weight in pounds:");
        double lbs = scLine.nextDouble();   

        //calculation and output
        System.out.println("Weight in kilograms: " + (lbs * 0.454));    

        //close scanner
        scLine.close();     
    }
}

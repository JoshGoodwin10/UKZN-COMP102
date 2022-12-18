import java.util.*;

public class prac2question1
{
    public static void main(String[] args) 
    {
        //Scanner
        Scanner scLine = new Scanner (System.in);   

        //User input
        System.out.println("Enter a length from center to vertex: ");
        int r = scLine.nextInt();   

        //Calculations
        double s = 2 * r * Math.sin(Math.PI/5);

        double area = (3 * Math.sqrt(3))/2 * Math.pow(s, 2);

        //Output and closing scanner
        System.out.println("Area of Pentagon: " + area);
        scLine.close();
    }
}


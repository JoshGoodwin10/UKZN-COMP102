import java.util.Scanner;

public class prac1question5 
{
    public static void main(String[] args) 
    {
        //scanner for reading input from user
        Scanner scLine = new Scanner(System.in);    

        //inputs and display messages
        System.out.println("Input P:");
        double P = scLine.nextInt();

        System.out.println("Input N:");
        double N = scLine.nextInt();

        System.out.println("Input R:");
        double R = scLine.nextInt();
        double r = R/100;

        //output and calculation
        System.out.println("A = " + (P * Math.pow((1 + r), N) * r)/(Math.pow((1 + r), N) - 1));

        //close scanner
        scLine.close();
    }
}

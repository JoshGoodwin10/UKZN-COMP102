import java.util.Scanner;

public class prac1question1
{
    public static void main(String[] args) 
    {
        //scanner for reading input from user
        Scanner scLine = new Scanner(System.in);    

        //inputs and display messages
        System.out.println("Enter an initial velocity:");
        int iVelocity = scLine.nextInt();   

        System.out.println("Enter an acceleration:");
        int acceleration = scLine.nextInt();    

        System.out.println("Enter a time:");
        int time = scLine.nextInt();    

        //calculation and output
        System.out.println("Final velocity: " + (iVelocity + (acceleration * time)) + "m/s");    

        //close scanner
        scLine.close();     
    }
}
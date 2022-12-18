import java.util.Scanner;

public class prac1question6 
{
    public static void main(String[] args) 
    {
        //scanner for reading input from user
        Scanner scLine = new Scanner(System.in);    

        //inputs and display messages
        System.out.println("Enter a starting day (0-6)");
        int startingDate = scLine.nextInt();

        System.out.println("How many days will your holiday be?");
        int holidayLength = scLine.nextInt();

        //output and calculation
        System.out.println("You will return on day " + (startingDate + holidayLength) % 7);

        //close scanner
        scLine.close();     
    }
}

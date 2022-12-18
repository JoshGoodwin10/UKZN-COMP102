import java.util.*;

public class prac2question4 
{
    public static void main(String[] args) 
    {
        //Scanner
        Scanner scLine = new Scanner(System.in);

        //User inputs
        System.out.println("Enter an integer between 0 and 999: ");
        int num = scLine.nextInt();

        //Checks, Number reversal and Output
        if (num > 0 && num < 1000)    //if in acceptable range
        {
            System.out.print("The number reversed is: ");    //using.print instead of println
            
            if (num < 10)    //single digit number
            {
                System.out.print(num);    
            }

            else if (num > 10 && num < 100)    //double digit number
            {
                System.out.print(num%10);
                System.out.print((num % 100) / 10);
            }

            else    //triple digit number
            {
                System.out.print(num%10);
                System.out.print((num % 100) / 10);
                System.out.print(num/100);
            }
        }

        else    //Error message for invalid input
        {
            System.out.println("Error: Please insert a number within acceptable range");
        }

        //Close scanner
        scLine.close();
    }
}

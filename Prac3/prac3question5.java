import java.util.Scanner;

public class prac3question5 
{
    public static void main(String[] args) 
    {
        //Scanner
        Scanner scLine = new Scanner(System.in);

        //Inputs
        System.out.println("Input a number: ");
        int num1 = scLine.nextInt();

        System.out.println("Input another number: ");
        int num2 = scLine.nextInt();

        //Testing variable
        int test = num1;

        //Testing and output.
        while (test > 0)
        {
            if (num1 % test == 0 && num2 % test == 0)
            {
                System.out.println("GCD of " + num1 + " and " + num2 + " is " + test);
                test = 0;   //used to break while loop when GCD is found. 
            }
            test--;
        }

        //Close scanner
        scLine.close();
    }
}

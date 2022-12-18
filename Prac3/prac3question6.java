import java.util.Scanner;

public class prac3question6 
{
    public static void main(String[] args) 
    {
        //Scanner
        Scanner scLine = new Scanner(System.in);

        //Inputs
        System.out.println("Enter a number");
        int num1 = scLine.nextInt();
        
        System.out.println("Enter a number");
        int num2 = scLine.nextInt();
        
        //Boolean value to be used as a flag and variable for lcm. 
        boolean lcmFound = false;
        int lcm = num1;

        //Testing for lcm
        while (lcmFound == false)
        {
            if (lcm%num1 == 0 && lcm%num2 == 0)
                lcmFound = true;
            
            else
                lcm++;
        }

        //Output and closing scanner
        System.out.println("The lcm of " + num1 + " and " + num2 + " is " + lcm);
        scLine.close();
    }
}

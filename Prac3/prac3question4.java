import java.util.Scanner;

public class prac3question4 
{
    public static void main(String[] args) 
    {
        //Scanner
        Scanner scLine = new Scanner(System.in);

        //Input
        System.out.println("Input a number: ");
        int num = scLine.nextInt();

        //First part of output
        System.out.print("The factors of " + num + " are: ");
        
        //for loop from 1 to num (inclusive) checking if i is a factor
        for (int i = 1; i <= num; i++)
        {
            if (i == num)
                System.out.println("and " + i + ".");   //used to get output as close to provided example as I could
            
            else if (num%i == 0)
                System.out.print(i + ", ");
        }

        //Close scanner
        scLine.close();
    }
}

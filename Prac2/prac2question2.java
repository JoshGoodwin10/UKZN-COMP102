import java.util.*;

public class prac2question2 
{
    public static void main(String[] args) 
    {
        //Scanner
        Scanner scLine = new Scanner(System.in);

        //User input
        System.out.println("Entre a 3 digit integer");
        int oNum = scLine.nextInt();

        //Seperate each digit and store it in its own variable
        int num1 = oNum/100;
        int num2 = (oNum - (num1 * 100)) / 10;
        int num3 = oNum - (num1 * 100) - (num2 * 10);

        //Output and close scanner
        System.out.println("the sum of the digits is " + num1 + " + " + num2 + " + " + num3 + " = " + (num1 + num2 + num3));
        scLine.close();
    }
}

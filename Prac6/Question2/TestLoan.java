package Question2;

import java.util.*;

public class TestLoan 
{
    public static void main(String[] args) 
    {
        //Scanner
        Scanner scLine = new Scanner(System.in);

        //Everything to do with loan 1
        System.out.println("Enter an amount to be loaned:");
        double a = scLine.nextDouble();
        System.out.println("Enter the interest rate on the loan:");
        double r = scLine.nextDouble();
        System.out.println("Enter how many years the loan is taken over:");
        int y = scLine.nextInt();
        Loan LN1 = new Loan(a, r, y);

        //output for loan 1
        System.out.println("Amount paid back (simple interest): R" + LN1.getAmountSimple());

        //Everything to do with loan 2
        System.out.println("Enter an amount to be loaned:");
        a = scLine.nextDouble();
        System.out.println("Enter the interest rate on the loan:");
        r = scLine.nextDouble();
        System.out.println("Enter how many years the loan is taken over:");
        y = scLine.nextInt();
        System.out.println("Enter how many times the interest is compounded per year");
        int t = scLine.nextInt();
        Loan LN2 = new Loan(a, r, y);

        //output for loan 2
        System.out.println("Amount paid back (compound interest): R" + LN2.getAmountCompound(t));

        //Everything to do with loan 3
        System.out.println("Enter an amount to be loaned:");
        a = scLine.nextDouble();
        System.out.println("Enter the interest rate on the loan:");
        r = scLine.nextDouble();
        System.out.println("Enter how many years the loan is taken over:");
        y = scLine.nextInt();
        Loan LN3 = new Loan(a, r, y);

        //output for loan 3
        System.out.println("Monthly instalments: R" + LN3.getInstSimple());

        //Everything to do with loan 4
        System.out.println("Enter an amount to be loaned:");
        a = scLine.nextDouble();
        System.out.println("Enter the interest rate on the loan:");
        r = scLine.nextDouble();
        System.out.println("Enter how many years the loan is taken over:");
        y = scLine.nextInt();
        System.out.println("Enter how many times the interest is compounded per year");
        t = scLine.nextInt();
        Loan LN4 = new Loan(a, r, y);

        //output for loan 4
        System.out.println("Monthly instalments: R" + LN4.getInstCompound(t));

        //close scanner
        scLine.close();
    }
}

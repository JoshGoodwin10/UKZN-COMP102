import java.util.*;

public class prac2question3 
{
    public static void main(String[] args) 
    {
        //Scanner
        Scanner scLine = new Scanner(System.in);

        //User input
        System.out.println("How many tickets do you wish to purchase: ");
        int numTickets = scLine.nextInt();

        double bill = 0;    //Variable to store the bill or final cost of tickets

        //Calculations etc.
        if (numTickets >= 0)    //if 0 or more tickets
        {
            if (numTickets < 7)   //if less than 7 tickets 
            {
                bill = numTickets * 15;
            }

            else if (numTickets >= 14)    //if 14 or more tickets
            {
                bill = (10.75 * numTickets) * 0.90;
            }

            else    //everything else (between 7 and 14)
            {
                bill = numTickets * 10.75;
            }

            bill = Math.round(bill*100.00)/100.00;    //used to make output have 2 decimal places
        }

        else    //if less than zero tickets
        {
            System.out.println("Please enter a valid number of tickets");
        }

        //Output and close scanner
        System.out.println("Total cost: R" + bill);
        scLine.close();
    }
}

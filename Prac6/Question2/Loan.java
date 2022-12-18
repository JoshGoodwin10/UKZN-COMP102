package Question2;

public class Loan 
{
    //class attributes
    private double amount = 0;
    private double rate = 0;
    private int years = 0;

    //constructor
    public Loan(double a, double r, int y)
    {
        //check if all inputs are positive (or zero)
        if (a >= 0 && r >= 0 && y >= 0)
        {
            amount = a;
            rate = r/100;
            years = y;
        }
    }

    //get amount paid back when simple interest is used
    public double getAmountSimple() 
    {
        return (double) Math.round((amount * (1 + (rate * years))) * 100) / 100;
    }

    //get amount paid back when compound interest is used
    public double getAmountCompound(int times) 
    {
        return (double) Math.round((amount * (Math.pow((1 + (rate/times)), (years * times)))) * 100) / 100;
    }

    //Since we weren't given a formula for installments, I don't know if the output is correct but the code works fine.
    //get monthly installment if simple interest used
    public double getInstSimple()
    {
        double due = (double) Math.round((amount * (1 + (rate * years))) * 100) / 100;

        return (double) Math.round(due/(years * 12) * 100) / 100;
    }

    //get monthly installment if compound interest used
    public double getInstCompound(int times)
    {
        double due = (double) Math.round((amount * (Math.pow((1 + (rate/times)), (years * times)))) * 100) / 100;
        
        return (double) Math.round(due/(years * 12) * 100)/100;
    }
}

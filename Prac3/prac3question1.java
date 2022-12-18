import java.util.Scanner;

public class prac3question1
{
    public static void main(String[] args) 
    {
        //Scanner
        Scanner scLine = new Scanner(System.in);

        //Input
        System.out.println("Enter a mark between 0 and 100:");
        int mark = scLine.nextInt();

        //If statements to check mark and outputs
        if (mark > 0 && mark <= 100)
        {
            if (mark < 50)
                System.out.println('F');
            
            else if (mark < 60 && mark >= 50)
                System.out.println('D');
            
            else if (mark < 70 && mark >= 60)
                System.out.println('C');
            
            else if (mark < 75 && mark >= 70)
                System.out.println('B');
            
            else
                System.out.println('A');
        }

        //Close scanner
        scLine.close();
    }
}
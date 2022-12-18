import java.util.*;

public class prac5question1 
{
    public static void main(String[] args) 
    { 
        //Scanner
        Scanner scLine = new Scanner(System.in);

        //Inputs and Display Messages
        System.out.println("Enter a string: ");
        String first = scLine.next();

        System.out.println("Enter another string: ");
        String second = scLine.next();

        //Check for equal and output
        if (equalsIgnoreCase(first, second) == true)
            System.out.println("\"" + first + "\" and \"" + second + "\" are equal");

        else
            System.out.println("\"" + first + "\" and \"" + second + "\" are not equal");  

        //Close scanner    
        scLine.close();
    }

    public static boolean equalsIgnoreCase(String one, String two)
    {
        //variable for output
        boolean output = false;

        //Check
        if (one.equalsIgnoreCase(two))
            output = true;

        //return
        return output;
    }
}

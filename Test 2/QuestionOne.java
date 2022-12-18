import java.util.*;

public class QuestionOne 
{
    public static void main(String[] args) 
    {
        //Scanner
        Scanner scLine = new Scanner(System.in);

        //Display message and variables
        System.out.println("How many elements will your array be?:");
        int size = scLine.nextInt();
        int[] intArray = new int[size];
        boolean set = true;    //true if array is a set

        //for loop to fill array via user input
        for (int i = 0; i < size; i++)
        {
            System.out.println("Enter an int: ");
            intArray[i] = scLine.nextInt();
        }

        //for loop to loop through arrray 
        for (int a = 0; a < size; a++)
        {
            int numTimes = 0;    //variable to store how many times each element is repeated in the array

            for (int b = 0; b < size; b++)
            {
                if (intArray[a] == intArray[b])
                    numTimes++;
            }

            if (numTimes > 1)    //if element is in array more than once
            {
                set = false;    //array is not a set
                break;    //can break out of loop since once one element is repeated, you dont have to check others. While loop would have been better than using a for loop with a break but I wasn't sure if we were allowed to use them or not. 
            }
        }

        //if statement to check if it is a set, outputs, and close scanner
        if (set == true)
            System.out.println("The array is a set");

        else    
            System.out.println("The array is a bag");    

        scLine.close();
    }
}

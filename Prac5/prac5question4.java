import java.util.*;

public class prac5question4 
{
    public static void main(String[] args) 
    {
        //Scanner
        Scanner scLine = new Scanner(System.in);

        //Display message and input
        System.out.println("Enter a string: ");
        String og = scLine.next();

        //Output and close scanner
        System.out.println("The reversed string: " + shuffle(og));
        scLine.close();
    }

    public static String shuffle(String s)
    {
        //Variables for shuffle
        String shuffled = "";    //will be the shuffled string
        String[] sArray = s.split("");    //inputted string split into array

        //loop to shuffle the array's elements
        for (int i = 0; i < s.length(); i++)
        {
            int pos = (int) (Math.random() * s.length());    //position of element to be swapped with element in position i

            //swapping of elements
            String temp = sArray[i];
            sArray[i] = sArray[pos];
            sArray[pos] = temp;
        }

        //loop to fill shuffled variable with array elements
        for(int a = 0; a < s.length(); a++)
        {
            shuffled = shuffled + sArray[a];
        }

        //return shuffled string
        return shuffled;
    }
}

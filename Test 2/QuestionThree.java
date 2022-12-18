import java.util.*;

public class QuestionThree 
{
    public static void main(String[] args) 
    {
        //Scanner
        Scanner scLine = new Scanner(System.in); 

        //Display mesage and variable input from user
        System.out.println("Enter a string: ");
        String user = scLine.next().toLowerCase();

        //if statements that call checker method and output
        if (isDoubloon(user) == true)
            System.out.println(user + " is a doubloon");

        else 
            System.out.println(user + " is not a doubloon");    

        //close scanner
        scLine.close();
    }

    public static boolean isDoubloon(String s)
    {
        //variables
        boolean doub = true;    //set to true initially, will be false when doobloon is disproven.
        int numTimes = 0;

        //for loops to loop through string and check how many times each letter is in it
        for (int i = 0; i < s.length(); i++)
        {
            for (int j = 0; j < s.length(); j++)
            {
                if (s.charAt(i) == s.charAt(j))
                    numTimes++;
            }

            if (numTimes != 2)    //loop will only run to completion if each char is in string twice, no more, no less
            {
                doub = false;
                break;
            }

            numTimes = 0;
        }

        //return value
        return doub;
    }
}

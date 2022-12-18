import java.util.*;

public class prac5question5 
{
    public static void main(String[] args) 
    {
        //Scanner
        Scanner scLine = new Scanner(System.in);

        //Inputs and display messages
        System.out.println("Enter a word: ");
        String one = scLine.next();
        System.out.println("Enter another word: ");
        String two = scLine.next();

        //output and close scanner
        if (isAnagram(one, two) == true)
            System.out.println("\"" + one + "\" and \"" + two + "\" are anagrams");

        else
            System.out.println("\"" + one + "\" and \"" + two + "\" are not anagrams");

        scLine.close();    
    }

    public static boolean isAnagram(String one, String two)
    {
        //variables for check
        boolean isAna = true;
        int numLettersOne = 0;    //counts how many of each letter is in word 1
        int numLettersTwo = 0;    //counts how many of each letter is in word 2
        
        //won't check if strings aren't same lenght
        if (one.length() == two.length())
        {
            //first loop for getting character to be checked and see if letters are in each word the same number of times
            for (int i = 0; i < one.length(); i++)
            {
                char checkChar = one.charAt(i);

                //second loop for looping through each word and comparing char at i and a with checkChar
                for (int a = 0; a < two.length(); a++)
                {
                    //increase variables if 
                    if (checkChar == one.charAt(a))
                        numLettersOne++;

                    if (checkChar == two.charAt(a))
                        numLettersTwo++;    
                
                }

                //if the letter isn't in each word the same amount of times, then not anagram
                if (numLettersOne != numLettersTwo)
                {
                    isAna = false;
                    break;
                }
            }
        }
        
        //return
        return isAna;
    }
}

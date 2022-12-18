package Question4;

import java.util.*;

public class TestStringComparator 
{
    public static void main(String[] args) 
    {
        //Scanner
        Scanner scLine = new Scanner(System.in);

        //Display messages and inputs
        System.out.println("Enter a string: ");
        String one = scLine.next();
        System.out.println("Enter another string: ");
        String two = scLine.next();
        System.out.println("Enter a letter: ");
        char l = scLine.next().charAt(0);

        //Create StringComparator object
        StringComparator SC = new StringComparator(one, two);

        //outputs
        System.out.println(SC.getVowels());
        System.out.println(SC.getFirst());
        System.out.println(SC.letterCount(l));

        //close scanner
        scLine.close();
    }
}

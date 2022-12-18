import java.util.*;

public class QuestionTwo 
{
    public static void main(String[] args) 
    {
        //Scanner
        Scanner scLine = new Scanner(System.in);
        
        //Display message and vairables. User inputs how many rows (and hence columns in array)
        System.out.println("How many rows must be in the square matrix?:");
        int size = scLine.nextInt();
        int[][] intArray = new int[size][size];

        //for loop to fill array. User enters each element in array.
        for (int a = 0; a < size; a++)
        {
            System.out.println("Row " + (a + 1) + ": ");
            for (int b = 0; b < size; b++)
            {
                System.out.println("Enter an int: ");
                intArray[a][b] = scLine.nextInt();
            }
        }

        //Call diagonal checker and close scanner
        diagonalCheck(intArray);
        scLine.close();
    }

    public static void diagonalCheck(int[][] intArr)
    {
        //variables
        int majorSum = 0; 
        int minorSum = 0;
        
        //for loop to loop through the array and sum up major diagonal elements. 
        for (int i = 0; i < intArr.length; i++)
        {
            majorSum = majorSum + intArr[i][i];
        }

        //for loop to loop through the array and sum up minor diagonal elements. 
        for (int j = intArr.length - 1; j >= 0; j--)
        {
            minorSum = minorSum + intArr[intArr.length - (j + 1)][j];
        }

        //if statements for sum checks and print statements
        if (minorSum > majorSum)
            System.out.println("Sum of minor diagonal > sum of major diagonal");

        else if (majorSum > minorSum)
            System.out.println("Sum of major diagonal > sum of minor diagonal"); 
            
        else 
            System.out.println("Major and minor diagonals are equal");    
    }
}

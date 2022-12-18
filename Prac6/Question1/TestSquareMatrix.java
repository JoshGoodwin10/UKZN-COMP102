package Question1;

import java.util.*;

public class TestSquareMatrix 
{ 
    public static void main(String[] args) 
    {
      //Scanner  
      Scanner scLine = new Scanner(System.in);
      
      //Display messages and inputs for each object
      System.out.println("Enter an int greater than 1:");
      int userInput1 = scLine.nextInt();
      
      System.out.println("\nEnter an int greater than 1:");
      int userInput2 = scLine.nextInt();

      System.out.println("\nEnter an int greater than 1:");
      int userInput3 = scLine.nextInt();

      //Create each object
      SquareMatrix SM1 = new SquareMatrix(userInput1);
      SquareMatrix SM2 = new SquareMatrix(userInput2);
      SquareMatrix SM3 = new SquareMatrix(userInput3);

      //outputs for each matrix
      System.out.println("\nSquare Martrix from first object's matrix:");
      SM1.display();

      System.out.println("\nRow with the greatest sum from second object's matrix:");
      System.out.println(SM2.getGreatestRowSum());     
      
      System.out.println("\nRow with the least sum from third object's matrix:");
      System.out.println(SM3.getLeastRowSum());

      //close scanner
      scLine.close();  
    }
}


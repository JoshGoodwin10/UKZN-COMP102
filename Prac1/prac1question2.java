import java.util.Scanner;

public class prac1question2 
{
    public static void main(String[] args) 
    {
        double pi = 3.14;   //was unsure of using this or Math.PI, question paper said use 3.14 so I assumed this

        //scanner for reading input from user
        Scanner scLine = new Scanner(System.in);    

        //inputs and display messages
        System.out.println("Input the radius of a cylinder:");
        int radius = scLine.nextInt(); 

        System.out.println("Enter the length of the cylinder:");
        int length = scLine.nextInt();   
        
        //calculations and output
        double area = Math.pow(radius, 2) * pi;     

        System.out.println("The volume of the cylinder: " + (area * length));

        //close scanner
        scLine.close();  
    }
}

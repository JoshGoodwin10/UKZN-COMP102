import java.util.Scanner;

public class prac3question2 
{
    public static void main(String[] args) 
    {
        //Scanner
        Scanner scLine = new Scanner(System.in);

        //Inputs
        System.out.println("Enter a number: ");
        int userNum = scLine.nextInt();

        //If and else for perfect square check and output. Checked by seeing if square root of num equals rounded off square root of num. if equal, then num is a perfect square
        if (Math.sqrt(userNum) == Math.round(Math.sqrt(userNum)))
            System.out.println("The number " + userNum + " is a perfect square");
        
        else
            System.out.println("The number " + userNum + " is not a perfect square");
        
        //Close scanner    
        scLine.close();
    }    
}

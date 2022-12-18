import java.util.Scanner;

public class prac1question4 
{
    public static void main(String[] args) 
    {
        //scanner for reading input from user
        Scanner scLine = new Scanner(System.in);    

        //inputs and display messages
        System.out.println("Enter a width (meters):");
        double B = scLine.nextInt();   

        System.out.println("Enter a length (meters):");
        double L = scLine.nextInt();   

        System.out.println("Enter Cubic meters of grain per hectare:");
        double C = scLine.nextInt();   

        System.out.println("Enter a radius (meters):");
        double R = scLine.nextInt();  

        System.out.println("Enter a height (meters):");
        double H = scLine.nextInt();   

        //calculations
        double grainVolume = (B * L / 10000) * C;   

        double siloVolume = Math.PI * Math.pow(R, 2) * H;   

        double filled = (int)(grainVolume/siloVolume);      

        double remainder = (grainVolume/siloVolume - filled) * H;   

        double remainderCm3 = grainVolume%siloVolume;

        //outputs
        System.out.println("Number of filled silos = " + filled);
        System.out.println("Height of grain in unfilled silo (meters)= " + (remainder));
        System.out.println("Volume of grain in unfilled silo(cm^3)= " + remainderCm3);

        //close scanner
        scLine.close();
    }
}

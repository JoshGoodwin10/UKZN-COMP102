import java.io.*;
import java.util.*;

public class Question4 
{
    public static void main(String[] args) throws IOException
    {
        //Scanner for file
        Scanner scFile = new Scanner(new File("Athlete.java"));

        //Counter variables to store number of each brace
        int numOpenBrace = 0;
        int numClosedBrace = 0;

        //Data handling
        while (scFile.hasNextLine())
        {
            //String to store line from file
            String line = scFile.nextLine();

            //loop through the line, if either brace is in line, increase respective counter variable
            for (int i = 0; i < line.length(); i++)
            {
                if (line.charAt(i) == '{')
                    numOpenBrace++;
                
                else if (line.charAt(i) == '}')
                    numClosedBrace++;    
            }
        }

        //output and close scanner
        System.out.println("There are " + Math.abs((numClosedBrace - numOpenBrace)) + " braces missing");
        scFile.close();
    }
}

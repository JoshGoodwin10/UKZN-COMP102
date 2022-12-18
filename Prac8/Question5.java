import java.io.*;
import java.util.*;

public class Question5 
{
    public static void main(String[] args) throws IOException
    {
        //Scanner for file and PrintWriter
        Scanner scFile = new Scanner(new File("Athlete.java"));
        PrintWriter outfile = new PrintWriter(new File("headers.txt"));

        //Data handling
        while (scFile.hasNext())
        {
            //String to store line from file
            String line = scFile.nextLine();

            //if to check if line is a header
            if ((line.contains("public") || line.contains("private")) && line.contains("(") && line.contains(")") || line.contains("class"))
                //print to file    
                outfile.println(line);          
        }

        //close scanner and print writer
        outfile.close();
        scFile.close();
    }
}

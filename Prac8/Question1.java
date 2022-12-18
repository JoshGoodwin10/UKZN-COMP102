import java.io.*;
import java.util.*;

public class Question1
{
    public static void main(String[] args) throws IOException 
    {
        //Variables
        int numLines = 0;
        int numWords = 0;
        int numLetters = 0;

        //File handling and Scanner for file reading
        File inFile = new File("text.txt");
        Scanner scFile = new Scanner(inFile);

        //Data handling
        while(scFile.hasNextLine())
        {
            //Scanner for line from file
            Scanner scLine = new Scanner(scFile.nextLine());
            
            //Increases each time a new line is being read
            numLines++;

            //while the line still has elements
            while (scLine.hasNext())
            {
                //Incease word count
                numWords++;
                //Increase number of letters using length()
                numLetters = numLetters + scLine.next().length();
            }

            //Close line scanner
            scLine.close();
        }

        //Outputs
        System.out.println("There are " + numLines + " lines of text in the file");
        System.out.println("There are " + numWords + " words in the file");
        System.out.println("The average number length of words is " + (double) numLetters/numWords);

        //Close scanner
        scFile.close();
    }  
}
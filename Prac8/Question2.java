import java.io.*;
import java.util.*;

public class Question2 
{
    public static void main(String[] args) throws IOException
    {
        //Scanner to read in the file
        Scanner scFile = new Scanner(new File("seperateData.txt"));

        //Variables relating to each person; sum for sum of marks, num for number of marks received, used for avergae calculation
        double gSum = 0.0;
        double gNum = 0.0;

        double mNum = 0.0;
        double mSum = 0.0;

        double kNum = 0.0;
        double kSum = 0.0;

        //Variable to store mark being read in by the scanner
        double mark = 0.0;

        //PrintWriter for each person, uses first three lines of text file to create file using the person's name
        PrintWriter mFile = new PrintWriter(scFile.nextLine() + ".txt");
        PrintWriter gFile = new PrintWriter(scFile.nextLine() + ".txt");
        PrintWriter kFile = new PrintWriter(scFile.nextLine() + ".txt");

        //Data handling
        while (scFile.hasNextLine())
        {
            //Scanner to read each line from the file
            Scanner scLine = new Scanner(scFile.nextLine());

            //Name of the person who has received a mark
            String name = scLine.next();
            
            //Switch statement to see which person the mark belongs to. Double.parseDouble used because I was having issues with reading in 
            //the marks without it, not sure if necessary
            switch (name)
            {
                case "Gouws":
                    mark = Double.parseDouble(scLine.next());
                    gFile.println(mark);
                    gNum++;
                    gSum += mark;
                    break;

                case "Kingu":
                    mark = Double.parseDouble(scLine.next());
                    kFile.println(mark);
                    kNum++;
                    kSum += mark;
                    break;
                 
                case "Moodley":
                    mark = Double.parseDouble(scLine.next());
                    mFile.println(mark);
                    mNum++;
                    mSum += mark;
                    break;    
            }
            //Close line scanner            
            scLine.close();
        }
        //Outputs
        System.out.println("Average for Gouws: " + (gSum/gNum));
        System.out.println("Average for Kingu: " + (kSum/kNum));
        System.out.println("Average for Moodley: " + (mSum/mNum));

        //Close all the PrintWriters and file scanner
        gFile.close();
        mFile.close();
        kFile.close();
        scFile.close();
    }
}

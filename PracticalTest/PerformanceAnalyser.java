//222092144

import java.util.*;
import java.io.*;

public class PerformanceAnalyser 
{

    public static void main(String[] args) throws IOException 
    {
        // QUESTION 2.1 [15 marks]
        // Read in athlete information from text file and create an array of Athlete objects

        //Scanner for the file
        Scanner scFile = new Scanner(new File("athletes.txt"));
        //Create array of athlete objects
        Athlete[] aArr = new Athlete[Integer.parseInt(scFile.nextLine())];

        //loop through athlete array
        for (int i = 0; i < aArr.length; i++)
        {
            String line = scFile.nextLine();    //line from the text file
            Scanner scLine = new Scanner(line).useDelimiter(";");   //scanner for the line from the text file

            //Read in attributes from the file
            String fName = scLine.next();
            String sName = scLine.next();
            String campus = scLine.next();
            double[] sTimes = new double[5];

            for (int a = 0; a < 5; a++)
            {
                sTimes[a] = Double.parseDouble(scLine.next());  //.nextDouble wasn't working for some reason so I used this instead
            }

            //Put object in array
            aArr[i] = new Athlete(fName, sName, campus, sTimes);

            //close scanner
            scLine.close();
        }

        //close scanner
        scFile.close();

        // Test your methods
        System.out.println("Fastest Student: ");
        getFastestStudent(aArr);
        System.out.println("\n\nGood Howard Sprinters: ");
        showGoodHowardSprinters(aArr);

        //Gets character for search method
        System.out.println("\n\nEnter a letter to search for: ");
        Scanner scConsole = new Scanner(System.in);
        char searchLetter = scConsole.next().charAt(0);

        System.out.println("\nAverage time for student names beginning with " + searchLetter + ": ");
        searchStudents(aArr, searchLetter);

        //close scanner
        scConsole.close();
    }
   
    // QUESTION 2.2 [10 marks]
    // Method displays the student who ran the fastest once-off sprint
    private static void getFastestStudent(Athlete[] athletes) 
    {
        //array fill with default values that are all much bigger than ones in the file
        double sArr[] = {1000, 1000, 1000, 1000, 1000};
        //Create athlete with the default values
        Athlete fastestAthlete = new Athlete(null, null, null, sArr);

        //loop through athletes array 
        for (int i = 0; i < athletes.length; i++)
        {
            //if best time from array is faster than time of current fastest
            if (athletes[i].getBestTime() < fastestAthlete.getBestTime())
            {
                //change fastest athlete
                fastestAthlete = athletes[i];
            }
        }

        //output
        System.out.println(fastestAthlete.getName() + " " + fastestAthlete.getSurname() + " is the fastest student. Their best sprint time is: " + fastestAthlete.getBestTime());
    }

    // QUESTION 2.3 [15 marks]
    // Method displays all sprinters, from Howard campus, whose average sprint time is below the average
    // achieved by all students athletes who participated in the track day
    private static void showGoodHowardSprinters(Athlete[] athletes) 
    {
        double totalAvg = 0;

        //add all averages up
        for (int d = 0; d < athletes.length; d++)
        {
            totalAvg += athletes[d].getAverageTime();
        }

        //get average
        totalAvg = totalAvg/athletes.length;

        //loop through athletes array
        for (int i = 0; i < athletes.length; i++)
        {
            //if from howard campus and average time is less than total average 
            if (athletes[i].getCampus().equalsIgnoreCase("Howard") && (athletes[i].getAverageTime() < totalAvg))
            {
                //output
                System.out.println(athletes[i].toString() + "\n");
            }
        } 
    }
   
    // QUESTION 2.4 [20 marks]
    // Method receives an array of "Athlete" objects and a character.
    // It then caculates the average sprint time of all students whose name begins with the character.
    // Of this group, it displays those whose personal average sprint time is less than the group's average
    private static void searchStudents(Athlete[] athletes, char charStart) 
    {
        double totalAvg = 0;

        //add all averages up
        for (int d = 0; d < athletes.length; d++)
        {
            totalAvg += athletes[d].getAverageTime();
        }

        //get average
        totalAvg = totalAvg/athletes.length;

        //loop through athletes array
        for (int i = 0; i < athletes.length; i++)
        {
            //if name begins with character specified, and average is less than total average
            if (athletes[i].getName().charAt(0) == charStart && athletes[i].getAverageTime() < totalAvg)
            {
                //output
                System.out.println(athletes[i].toString()+ "\n");
            }
        }
    }
}

import java.io.*;
import java.util.*;

public class Question3 
{
    public static void main(String[] args) throws IOException
    {
        //Scanner for file and PrintWriter creation
        Scanner scFile = new Scanner(new File("emailText.txt"));
        PrintWriter outfile = new PrintWriter("emails.txt");

        
        //Data Handling
        while (scFile.hasNext())
        {   
            //Scanner for line from file         
            Scanner scLine = new Scanner (scFile.nextLine()).useDelimiter("   ");
            
            //Data handling
            while (scLine.hasNext())
            {
                //Split line into sArr using " " and varible to store eventual email address
                String line = scLine.next();
                String[] sArr = line.split(" ", 0);
                String email = "";

                for (int i = 0; i < sArr.length; i++)
                {
                    //if word in string array has @
                    if (sArr[i].contains("@"))
                    {
                        //if there is a period between the @ and end of the word
                        if (sArr[i].substring(i, sArr[i].length()).contains("."))
                        {
                            for (int a = 0; a < sArr[i].length(); a++)
                            {
                                //Uses  acsii values to get rid of any extra spaces before or after the emails
                                if (sArr[i].charAt(a) > 20)
                                    email += sArr[i].charAt(a);
                            }
                            //print email to file
                            outfile.println(email);
                        }
                    }
                }
            }            

            //Close line scanner
            scLine.close();
        }    

        //Close file scanner and print writer
        scFile.close();
        outfile.close();
    }
}

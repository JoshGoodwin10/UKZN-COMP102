import java.util.Scanner;

public class prac5question3 
{
    public static void main(String[] args) 
    {
        //Scanner
        Scanner scLine = new Scanner(System.in);    

        //Display Messages and variables
        System.out.println("Enter a string: ");
        String s = scLine.nextLine();
        int vowels = howMany(s, 'a') + howMany(s, 'e') + howMany(s, 'i') + howMany(s, 'o') + howMany(s, 'u');

        //Output and close scanner
        System.out.println("\"" + s + "\" has " + vowels + " vowels"); 
        scLine.close();
    }

    public static int howMany(String s, char c)
    {
        //variable
        int num = 0; 

        //check for char
        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == c)
            {
                num++;
            }
        }

        //return
        return num;
    }
}

package Question4;

public class StringComparator 
{
    //Class attributes
    private String first = "";
    private String second = "";

    //Constructor
    public StringComparator(String f, String s)
    {
        //assign inputted strings to class attributes
        first = f.toLowerCase();
        second = s.toLowerCase();
    }

    //Method to return string with greater number of vowels
    public String getVowels()
    {
        //all variables used in method
        int num1 = 0;
        int num2 = 0;
        String output = "";

        //loop through first word, count vowels
        for (int i = 0; i < first.length(); i++)
            if (first.charAt(i) == 'a' || first.charAt(i) == 'e' || first.charAt(i) == 'i' || first.charAt(i) == 'o' || first.charAt(i) == 'u')
                num1++;

        //loop through second word, count vowels        
        for (int a = 0; a < second.length(); a++)
            if (second.charAt(a) == 'a' || second.charAt(a) == 'e' || second.charAt(a) == 'i' || second.charAt(a) =='o' || second.charAt(a) == 'u')
                num2++;

        //ifs to see which counter variable is greatest, determine output        
        if (num1 == num2)
            output = "tie";

        else if (num1 > num2)
            output = first + " has the most vowels";

        else if (num2 > num1)
            output = second + " has the most vowels";  

        //output
        return output;
    }

    //Method to return string which appears first alphabetically
    public String getFirst()
    {
        //variable to store eventual output
        String output = "";

        //use compareTo method to check alphabetical order
        if (first.compareTo(second) < 0)
            output = first + " comes first alphabetically";

        else if (second.compareTo(first) < 0)
            output = second + " comes first alphabetically";
            
        else 
            output = "tie";    

        //output    
        return output;    
    }

    //Method to return string with higher count of specified character
    public String letterCount(char c)
    {
        //variables used in method
        String output = "";
        int num1 = 0;
        int num2 = 0;
        
        //loops going through each word, increase counter variables each times specified char is found
        for (int i = 0; i < first.length(); i++)
            if (first.charAt(i) == c)
                num1++;    

        for (int j = 0; j < first.length(); j++)
            if (second.charAt(j) == c)
                num2++;

        //ifs to check which counter is higher and fill output variable with relevant message
        if (num1 > num2)
            output = first + " has a greater count of the letter " + c;

        else if (num2 > num1)
            output = second + " has a greater cont of the letter " + c;
            
        else 
            output = "tie";

        //output
        return output;
    }
}

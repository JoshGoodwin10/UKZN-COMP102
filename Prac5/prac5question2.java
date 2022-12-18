import java.util.Scanner;

public class prac5question2 
{
    public static void main(String[] args) 
    {
        //Scanner
        Scanner scLine = new Scanner(System.in);

        //Input and Display Message
        System.out.println("Enter an id number: ");
        String idNum = scLine.next();

        //Output and close scanner
        System.out.println("\nYou were born on: " + displayBirthday(idNum));
        scLine.close();
    }

    public static String displayBirthday(String idNumber)
    {
        //Variables
        //I don't think we've been taught parseInt etc. I know it because I've used java alot prior to this year. I hope it's okay to use for the practical. 
        String birthday = "";
        int year = Integer.parseInt(idNumber.substring(0, 2));    
        String yearS = "";
        int monthInt = Integer.parseInt(idNumber.substring(2, 4));
        String month = ""; 
        int day = Integer.parseInt(idNumber.substring(4, 6));

        //Switch for converting month from int to String
        switch(monthInt)
        {
            case 1: 
                month = "January";
                break;
            case 2: 
                month = "Febreuary";
                break;
            case 3: 
                month = "March";
                break;
            case 4: 
                month = "April";
                break;
            case 5: 
                month = "May";
                break;
            case 6: 
                month = "June";
                break;
            case 7: 
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9: 
                month = "September";
                break;
            case 10: 
                month = "October";
                break;
            case 11: 
                month = "November";
                break;
            case 12: 
                month = "December";
                break;   

            default:
                month = "";
                break;
        }
        
        //If statements to deal with year
        if (year < 10)
            yearS = "200" + year;
        
        else if (year > 9 && year <= 22)
            yearS = "20" + year;
            
        else
            yearS = "19" + year;

        birthday = day + " " + month + " " + yearS;

        //return 
        return birthday;
    }
}

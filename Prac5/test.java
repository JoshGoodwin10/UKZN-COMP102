import java.util.Scanner;

public class test 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter id number: ");
        String id = scanner.next();
        System.out.println("\nYou were born on: " + displayBirthday(id));
        scanner.close();
    }

    public static String displayBirthday(String idNum)
    { 
        String birthday = "";
        int year = Integer.parseInt(idNum.substring(0, 2));    
        String yearString = "";
        int monthInt = Integer.parseInt(idNum.substring(2, 4));
        String monthString = ""; 
        int day = Integer.parseInt(idNum.substring(4, 6));

        if (monthInt == 1)  
        {
            monthString = "January";
        }

        if (monthInt == 2)
        {  
            monthString = "Febreuary";
        }
            
        if (monthInt == 3)
        {
            monthString = "March";
        } 

        if (monthInt == 4)
        {  
            monthString = "April";
        }

        if (monthInt == 5) 
        {
            monthString = "May";
        }

        if (monthInt == 6)  
        {
            monthString = "June";
        }

        if (monthInt == 7)
        {  
            monthString = "July";
        }
            
        if (monthInt == 8)
        {
            monthString = "August";
        } 

        if (monthInt == 9)
        {  
            monthString = "September";
        }

        if (monthInt == 10) 
        {
            monthString = "October";
        }

        if (monthInt == 11)
        {  
            monthString = "November";
        }

        if (monthInt == 12) 
        {
            monthString = "December";
        }

        if (year < 10)
            yearString = "200" + year;
        
        else if (year > 9 && year <= 22)
            yearString = "20" + year;
            
        else
            yearString = "19" + year;

        birthday = day + " " + monthString + " " + yearString;

        return birthday;
    }
}

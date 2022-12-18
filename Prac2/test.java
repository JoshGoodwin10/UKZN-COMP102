import java.util.Scanner;

public class test 
{
    public static void reverseMethod (int number)
    {
        if (number < 10)
        {
            System.out.println(number);
        }

        else
        {
            System.out.print(number%10);
            reverseMethod(number/10);
        }
    }

    public static void main(String[] args) 
    {
        int num = 0;
        System.out.println("Input a from 0 to 999: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.out.print("Reverse of the number is: ");     
        reverseMethod(num);
    }
}

public class prac4question4 
{
    public static void main(String[] args) 
    {
        //variables
        int intArray[][] = new int[4][4];    //4x4 array
        int sum = 0;

        //double loops
        for (int i = 0; i < 4; i++)    
        {
            for (int a = 0; a < 4; a++)    
            {
                intArray[a][i] = (int) (Math.random() * (21 - 0)) + 0;    //insert random values into array
                sum = sum + intArray[a][i];
            }
            
            //output and reset sum value
            System.out.println("The column sum for column " + (i + 1) + " is: " + sum);
            sum = 0;
        }
    }
}

public class prac4question2 
{
    public static void main(String[] args) 
    {
        //variables
        int intArray[][] = new int[4][4];    //4x4 array
        double sum = 0;    //sum of each row

        //double loops
        for (int i = 0; i < 4; i++)    
        {
            for (int a = 0; a < 4; a++)    
            {
                intArray[i][a] = (int) (Math.random() * 21);    //insert values into array
                sum = sum + intArray[i][a];
            }

            //output and resetting sum for next row
            System.out.println("The average of row " + (i + 1) + " is: " + sum/4);
            sum = 0;
        }
    }
}

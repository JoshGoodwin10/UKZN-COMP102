public class prac4question3 
{
    public static void main(String[] args) 
    {
        //variables
        int intArray[][] = new int[4][4];    //4x4 array
        int max = 0;    
        int min = 20;

        //double loops
        for (int i = 0; i < 4; i++)    
        {
            for (int a = 0; a < 4; a++)    
            {
                intArray[i][a] = (int) (Math.random() * 21);    //insert random values into array

                //check for max and mins
                max = Math.max(max, intArray[i][a]);
                min = Math.min(min, intArray[i][a]);
            }

            //output and reset max and min values
            System.out.println("Row " + (i + 1) + ": Max value = " + max + " | Min value = " + min);
            max = 0;
            min = 20;
        }
    }
}

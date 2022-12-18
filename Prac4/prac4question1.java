public class prac4question1 
{
    public static void main(String[] args) 
    {
        //Varaibles used to store array and each of the outputs
        int intArray[] = new int[100];
        int below200 = 0;
        int multiples50 = 0;
        int max1 = 0;
        int max2 = 0;
        int max3 = 0;

        //for loop for filling array and doing checks for each element
        for (int i = 0; i < 100; i++)
        {
            intArray[i] = (int) (Math.random()*(301-100)) + 100;    //insert random number between 100 and 300, array generated row by row

            if (intArray[i] < 200)    //element at i below 200  
                below200++;
            
            if (intArray[i] % 50 == 0)    //element at i is multiple of 50
                multiples50++;
            
            if (intArray[i] > max1)    //element at i is larger than previous max
            {
                //re-assign max numbers
                max3 = max2;
                max2 = max1; 
                max1 = intArray[i];
            }
            
            else if (intArray[i] > max2 && intArray[i] < max1)    //element at i is larger than max2 but smaller than max1
            {
                //re-assign max numbers
                max3 = max2;
                max2 = intArray[i];
            }

            else if (intArray[i] > max3 && intArray[i] < max2)    ///element at i is larger than max3 but smaller than max2
                max3 = intArray[i];    //re-assign max3
        }

        //outputs
        System.out.println(below200 + " numbers are below 200");
        System.out.println(multiples50 + " numbers are multiples of 50");
        System.out.println("The three largest numbers are: " + max1 + ", " + max2 + ", and " + max3);
    }
}

package Question1;

public class SquareMatrix 
{
    //class atribute
    private int iArr[][];

    //constructor
    public SquareMatrix(int r)
    {
        //check if more than 1 row and column will be in the matrix
        if (r >= 1)
        {
            //create array
            iArr = new int[r][r];

            //nested loops used to fill array with random numbers between 0 and 20
            for (int i = 0; i < r; i++)
            {
                for (int j = 0; j < r; j++)
                {
                    iArr[i][j] = (int) (Math.random() * 21);    //I assumed the range was 0 to 20 inclusive, question didn't specify
                }
            }
        }
    }

    //display square matrix
    public void display()
    {
        //double loops to print each element with a tab in between each for formatting
        for (int a = 0; a < iArr.length; a++)
        {
            for (int b = 0; b < iArr.length; b++)
            {
                System.out.print(iArr[a][b] + "\t");
            }
            System.out.println();
        }
    }

    //find and print row with greatest sum
    public String getGreatestRowSum()
    {
        //variables used in method
        String output = "";
        int rowSum = 0;
        int greatestRow = 0;
        int greatestSum = 0;

        //nested loops, i = row being counted
        for (int i = 0; i < iArr.length; i++)
        {
            //j = position of number in row
            for (int j = 0; j < iArr.length; j++)
                rowSum = rowSum + iArr[i][j];

            //compare sum of current row to row with greatest sum
            if (rowSum > greatestSum)
            {
                greatestSum = rowSum;
                greatestRow = i;
            }
                
            //reset rowSum for each new row being counted
            rowSum = 0;  
        }

        //fill output variable with elements from greatest row, greatestRow variable used to keep track of greatest row's row number
        for (int c = 0; c < iArr.length; c++)
            output = output + iArr[greatestRow][c] + "\t";
        
        //output
        return output;
    }

    //find and print row with least sum
    public String getLeastRowSum()
    {
        //variables used in method
        String output = "";
        int rowSum = 0;
        int leastRow = 0;
        int leastSum = 0;

        //nested loops, i = row being counted
        for (int i = 0; i < iArr.length; i++)
        {
            // j = position of element in each row
            for (int j = 0; j < iArr.length; j++)
            {
                rowSum = rowSum + iArr[i][j];
            }

            //compare sum of current row to value of leastSum
            if (rowSum < leastSum)
            {
                leastSum = rowSum;
                leastRow = i;
            }
                
            //reset rowSum for each new row
            rowSum = 0;  
        }

        //loop to fill output variable with elements from row with tab for formatting
        for (int c = 0; c < iArr.length; c++)
        {
            output = output + iArr[leastRow][c] + "\t";
        }
        
        //output
        return output;
    }
}

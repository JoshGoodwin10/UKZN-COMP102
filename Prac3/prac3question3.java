public class prac3question3 
{
    public static void main(String[] args) 
    {
        //For loop from 0 to 1000 (exclusive) checking with same method as prev. question.
        for (int i = 0; i < 1000; i++)
        {
            if (Math.sqrt(i) == Math.round(Math.sqrt(i)))
                System.out.println(i);
        }
    }    
}

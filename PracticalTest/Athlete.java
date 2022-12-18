//222092144

public class Athlete 
{
    //fields
    private String name;
    private String surname;
    private String campus;
    private double[] sprintTimes;
   
    //constructor
    public Athlete(String name, String surname, String campus, double[] sprintTimes) 
    {
        this.name = name;
        this.surname = surname;
        this.campus = campus;
        this.sprintTimes = sprintTimes;
    }
   
    //getters
    public String getName() 
    {
        return name;
    }
   
    public String getSurname() 
    {
        return surname;
    }
   
    public String getCampus() 
    {
        return campus;
    }
   
    // QUESTION 1.1 [5 marks]
    // Method returns the average time the athlete ran over the five races 
    public double getAverageTime() 
    {
        double avgTime = 0.0;

        //loop through array, adding up all the averages
        for (int i = 0; i < sprintTimes.length; i++)
        {
            avgTime += sprintTimes[i];
        }

        //output
        return avgTime/sprintTimes.length;
    }
   
    // QUESTION 1.2 [5 marks] 
    // Method returns the best 100m sprint time for an athlete
    public double getBestTime() 
    {
        //default value set as best time
        double bestTime = 1000;
      
        //loop through array
        for (int i = 0; i < sprintTimes.length; i++)
        {
            //if value in array is less than the current best time
            if (sprintTimes[i] < bestTime)
                bestTime = sprintTimes[i];
        }

        //output
        return bestTime;
    }
   
    // QUESTION 1.3 [5 marks]
    // Method returns a string which represents the current state of the object 
    public String toString() 
    {
        String temp = "Name: " + name + "\nSurname: " + surname + "\nCampus: " + campus + "\nTimes: ";

        //put all of the times in the temp varible
        for (int i = 0; i < sprintTimes.length; i++)
        {
            temp = temp + "[" + sprintTimes[i] + "] ";
        }

        //output
        return temp;
    }
}

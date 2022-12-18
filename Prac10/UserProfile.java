public class UserProfile 
{
    // constructor for UP
    public UserProfile(String uId, String fName, String lName, String ctry, int nFol) 
    {
        userId = uId;
        firstName = fName;
        lastName = lName;
        country = ctry;
        noOfFollowers = nFol;
        noOfTweets = 0;
        tweets = new String[2];
    }

    // getters
    public String getUserId() 
    {
        return userId;
    }

    public int getNoOfFollowers() 
    {
        return noOfFollowers;
    }

    public int getNoOfTweets() 
    {
        return noOfTweets;
    }

    // adds tweet to user profile
    public void addTweet(String t) 
    {
        // boolean to see if a tweet has been added to the object or not
        boolean beenAdded = false;

        // loop through tweets
        for (int i = 0; i < tweets.length; i++) 
        {
            // if one of the elements in the array is empty
            if (tweets[i] == null) 
            {
                // add t to array in position i
                tweets[i] = t;
                // set been added to true
                beenAdded = true;
                noOfTweets++;
                // break out of the loop
                break;
            }
        }

        // if tweet hasn't been added
        if (beenAdded == false) 
        {
            // create new temp array with size of 2x tweets array
            String[] temp = new String[tweets.length * 2];

            // loop through tweets array
            for (int a = 0; a < tweets.length; a++) 
            {
                // fill temp with elements from tweets
                temp[a] = tweets[a];
            }

            // add t to temp array at position of length of tweets array
            temp[tweets.length] = t;
            noOfTweets++;
            // change tweets array to now be the same as the temp array
            tweets = temp;
        }
    }

    // prints all of the tweets
    private String printTweets() 
    {
        // variable for outputted string
        String output = "";

        // loop through tweets array
        for (int p = 0; p < tweets.length; p++) 
        {
            if (tweets[p] == null)
            {
                output += "";
            }

            else
            {
                // fill output variable with contents of array
                output += tweets[p] + "\n";
            }
            
        }

        // return string
        return output;
    }

    // toString
    public String toString() 
    {
        return "ID: " + userId + "\n" +
                "First Name: " + firstName + "\n" +
                "Last Name: " + lastName + "\n" +
                "Country: " + country + "\n" +
                "Followers: " + noOfFollowers + "\n" +
                "# Tweets: " + noOfTweets + "\n" +
                "Tweets:\n" + printTweets();
    }

    // class attributes
    private String userId;
    private String firstName;
    private String lastName;
    private String country;
    private int noOfFollowers;
    private int noOfTweets;
    private String[] tweets;
}

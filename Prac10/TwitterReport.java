import java.util.*;
import java.io.*;

public class TwitterReport 
{

    public static void main(String[] args) throws IOException 
    {
        Scanner scProfiles = new Scanner(new File("profiles.dat"));
        Scanner scTweets = new Scanner(new File("tweets.dat"));
        PrintWriter outfile = new PrintWriter(new File("TwitterReport.txt"));

        UserProfile[] upArr = new UserProfile[Integer.parseInt(scProfiles.nextLine())];

        int count = 0;

        while (scProfiles.hasNextLine())
        {
            String line = scProfiles.nextLine();
            Scanner scLine = new Scanner(line);

            String id = scLine.next();
            String fName = scLine.next();
            String lName = scLine.next();
            String country = scLine.next();
            int followers = scLine.nextInt();

            upArr[count] = new UserProfile(id, fName, lName, country, followers);

            while (scTweets.hasNextLine())
            {
                String tweetLine = scTweets.nextLine();
                scLine = new Scanner(tweetLine).useDelimiter(":\\*:");

                String tweetID = scLine.next();
                String tweet = scLine.next();

                if (tweetID.equalsIgnoreCase("214507283"))
                {
                    upArr[count].addTweet(tweet);
                }
            }
            count++;
            scLine.close();
        }

        outfile.println("Most Famous: ");
        outfile.println(maxFollowers(upArr).toString());
        outfile.println("\nMost Active: ");
        outfile.println(maxTweets(upArr).toString());

        scProfiles.close();
        scTweets.close();
        outfile.close();
    }

    private static UserProfile maxFollowers(UserProfile[] users) 
    {
        UserProfile maxfollow = users[0];

        // from through array starting at 2nd element
        for (int i = 1; i < users.length; i++) 
        {
            // if follower count from 2nd element has more followers than maxfollow
            if (users[i].getNoOfFollowers() > maxfollow.getNoOfFollowers()) 
            {
                //update maxfollow object
                maxfollow = users[i];
            }
        }
        // return object with max followers
        return maxfollow;
    }

    private static UserProfile maxTweets(UserProfile[] users) 
    {
        // create variable to represent object with max tweet count. Set to first
        // element of array by default
        UserProfile maxtweets = users[0];

        // from through array starting at 2nd element
        for (int i = 1; i < users.length; i++) 
        {
            // if tweet count from 2nd element has more tweets than maxtweets
            if (users[i].getNoOfTweets() > maxtweets.getNoOfTweets()) 
            {
                // update maxtweets object
                maxtweets = users[i];
            }
        }

        // return object with max tweets
        return maxtweets;
    }
}

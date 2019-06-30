package com.vineethvasudevan.twittercrawl;

import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

/**
 * 
 * @author Vineeth Vasudevan
 *
 */
public class tweetStatus 
{
    public static void main( String[] args )
    {
    	//Auth credentials
    	ConfigurationBuilder cb = new ConfigurationBuilder();
    	cb.setDebugEnabled(true)
    	  .setOAuthConsumerKey("")
    	  .setOAuthConsumerSecret("")
    	  .setOAuthAccessToken("")
    	  .setOAuthAccessTokenSecret("");
    	TwitterFactory tf = new TwitterFactory(cb.build());
    	Twitter twitter = tf.getInstance();
    	
    	 try {
			Status status = twitter.updateStatus("This is a Test Tweet from the API");
			System.out.println(status.getUser());
		} catch (TwitterException e) {
			e.printStackTrace();
		}
    	
    	
    	
    }
    
}

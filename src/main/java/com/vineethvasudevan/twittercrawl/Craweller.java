package com.vineethvasudevan.twittercrawl;

import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

/**
 * Hello world!
 *
 */
public class Craweller 
{
    public static void main( String[] args )
    {
    	ConfigurationBuilder cb = new ConfigurationBuilder();
    	cb.setDebugEnabled(true)
    	  .setOAuthConsumerKey("")
    	  .setOAuthConsumerSecret("")
    	  .setOAuthAccessToken("")
    	  .setOAuthAccessTokenSecret("");
    	TwitterFactory tf = new TwitterFactory(cb.build());
    	Twitter twitter = tf.getInstance();
    	
    	 try {
			Status status = twitter.updateStatus("#Test Tweet");
		} catch (TwitterException e) {
			e.printStackTrace();
		}
    	
    	
    	
    }
    
}

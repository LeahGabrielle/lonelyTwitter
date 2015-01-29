package ca.ualberta.cs.lonelytwitter.test;

import java.util.ArrayList;

import ca.ualberta.cs.lonelytwitter.LonelyTweetModel;
import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.NormalTweetModel;
import ca.ualberta.cs.lonelytwitter.TweetList;
import android.test.ActivityInstrumentationTestCase2;

public class TweetListTests extends
		ActivityInstrumentationTestCase2<LonelyTwitterActivity> {

	public TweetListTests() {
		super(LonelyTwitterActivity.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testTweetList(){
		TweetList tweetlist = new TweetList();
		ArrayList<LonelyTweetModel> tweets = tweetlist.getTweets();
		assertNotNull("Tweet List not initialized", tweets);
	}
	
	public void testCounts(){
		TweetList tweetList = new TweetList();
		NormalTweetModel tweet = new NormalTweetModel("Hello");
		tweetList.addTweet(tweet);
		assertEquals("This should be one", 1, tweetList.getCounts());
	}
	
	public void testAdd(){
		TweetList tweetList = new TweetList();
		NormalTweetModel tweet1 = new NormalTweetModel("Hello");
	}
}

package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

public class TweetList {

	private ArrayList<LonelyTweetModel> tweetList;
	private int count;
	
	public TweetList(){
		tweetList = new ArrayList<LonelyTweetModel>();
		count=0;
	}
	
	public ArrayList<LonelyTweetModel> getTweets(){
		return tweetList;
	}
	
	public int getCounts(){
		return count;
	}
	
	public void addTweet(LonelyTweetModel tweet){
		for (LonelyTweetModel tweets: this.getTweets()){
			
		}
		tweetList.add(tweet);
		count++;
	}
	public boolean hasTweet(LonelyTweetModel tweet){
		return true;
	}
	
	public void removeTweet(LonelyTweetModel tweet){
		
	}
}
package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

public class TweetListModel {
	private ArrayList<LonelyTweetModel> tweets;
	
	
	public TweetListModel() {
		super();
		tweets = new ArrayList<LonelyTweetModel>();
	}


	public void add(LonelyTweetModel lonelyTweetModel) {
		if(tweets.contains(lonelyTweetModel))
			throw new IllegalArgumentException();
		else
			tweets.add(lonelyTweetModel);		
	}
	public int getCount() {
		return tweets.size();
	}


	public LonelyTweetModel getItem(int i) {

		return tweets.get(i-1);
	}


	public boolean hasTweet(LonelyTweetModel tweet) {
		if (tweets.contains(tweet))
			return true;
		return false;
	}


	public ArrayList<LonelyTweetModel> getTweets() {
		ArrayList<LonelyTweetModel> orderedTweets = new ArrayList<LonelyTweetModel>();
		orderedTweets = tweets;
		return orderedTweets;
	}


	public int getCharCount(int i) {
		return tweets.get(i).getText().length();
	}

}

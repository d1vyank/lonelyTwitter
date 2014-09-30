package ca.ualberta.cs.lonelytwitter.test;

import java.util.ArrayList;

import ca.ualberta.cs.lonelytwitter.LonelyTweetModel;
import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.TweetListModel;
import android.test.ActivityInstrumentationTestCase2;


public class TweetListModelTest extends ActivityInstrumentationTestCase2<LonelyTwitterActivity> {
	
	public TweetListModelTest() {
		super(LonelyTwitterActivity.class);
		}
	
	public void testFail() {
		fail("This test fails.");
	}
	public void testFiveisFive() {
		assertEquals(5,5);
	}
	public void testAddTweets() {
		TweetListModel tlm = new TweetListModel();
		tlm.add(new LonelyTweetModel("Test"));
		assertEquals(tlm.getCount(), 1);
	}
	public void testGetItem() {
		TweetListModel tlm = new TweetListModel();
		LonelyTweetModel firstTweet = new LonelyTweetModel("Test");
		tlm.add(firstTweet);
		assertSame(tlm.getItem(1), firstTweet);
	}
	public void testDuplicateTweet() {
		TweetListModel tlm = new TweetListModel();
		LonelyTweetModel firstTweet = new LonelyTweetModel("Test");
		tlm.add(new LonelyTweetModel("Test"));
		try {
			tlm.add(new LonelyTweetModel("Test"));
		} catch (Exception e) {
			assertEquals(e.getClass(), IllegalArgumentException.class);
		}
		
	}
	public void testGetTweets() {
		TweetListModel tlm = new TweetListModel();
		LonelyTweetModel firstTweet = new LonelyTweetModel("Test");
		LonelyTweetModel secondTweet = new LonelyTweetModel("Test2");
		tlm.add(firstTweet);
		tlm.add(secondTweet);
		ArrayList<LonelyTweetModel> tweets = new ArrayList<LonelyTweetModel>();
		tweets.add(firstTweet);
		tweets.add(secondTweet);
		assertEquals(tlm.getTweets(), tweets);
		
	}
	public void testHasTweet() {
		TweetListModel tlm = new TweetListModel();
		LonelyTweetModel firstTweet = new LonelyTweetModel("Test");
		tlm.add(new LonelyTweetModel("Test"));
		assertTrue(tlm.hasTweet(firstTweet));
	}
	public void testGetCount() {
		TweetListModel tlm = new TweetListModel();
		LonelyTweetModel firstTweet = new LonelyTweetModel("Test");
		tlm.add(firstTweet);
		assertEquals(tlm.getCharCount(0),4);
	}
}

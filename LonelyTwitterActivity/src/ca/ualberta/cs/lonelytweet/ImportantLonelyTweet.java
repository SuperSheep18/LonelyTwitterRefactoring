package ca.ualberta.cs.lonelytweet;

import android.annotation.SuppressLint;
import android.util.Log;

import java.io.Serializable;
import java.util.Date;

public class ImportantLonelyTweet extends LonelyTweet implements Serializable {

	public ImportantLonelyTweet() {
	}

	public ImportantLonelyTweet(String text) {
		this.tweetDate = new Date();
		this.tweetBody = text;
	}
	
	public void setTweetBody(String tweetBody) {
		this.tweetBody = tweetBody;
	}

	@Override
	public boolean isValid() {
		if (tweetBody.trim().length() == 0
				|| tweetBody.trim().length() > 20) {
			return false;
		}

		return true;
	}

	@Override
	public String toString() {
		String string = getTweetDate() + " | " + getTweetBody() ;
		Log.i("",string);
		return string;
	}

	@SuppressLint("DefaultLocale")
	public String getTweetBody() {
		return tweetBody.toUpperCase();
	}
}
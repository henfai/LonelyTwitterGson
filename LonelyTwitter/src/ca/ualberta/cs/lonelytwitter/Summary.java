package ca.ualberta.cs.lonelytwitter;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class Summary 
{	

	public long aveNumTweets;
	
	public long aveLength;


	public long getAveNumTweets()
	{
	
		return aveNumTweets;
	}

	
	public void setAveNumTweets(long l)
	{
	
		this.aveNumTweets = l;
	}

	
	public double getAveLength()
	{
	
		return aveLength;
	}

	
	public void setAveLength(long l)
	{
	
		this.aveLength = l;
	}

}
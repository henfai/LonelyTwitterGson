package ca.ualberta.cs.lonelytwitter;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.TextView;

public class SummaryActivity extends Activity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_summary);
		Intent intent = getIntent();
		long sc = intent.getExtras().getLong("sc");
		long lc = intent.getExtras().getLong("lc");
		TextView sc1 = (TextView) findViewById(R.id.sc);
		TextView lc1 = (TextView) findViewById(R.id.lc);
		sc1.setText(sc);
		lc1.setText(lc);
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.summary, menu);
		return true;
	}
	
	

}

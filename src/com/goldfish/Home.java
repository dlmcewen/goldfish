package com.goldfish;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class Home extends Activity {
	
	private TextView budgetTV;
	private TextView fishName;
	private TextView fishAge;
	private GoldFishData goldFishData;
	protected BudgetData budgetData;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fullscreen);
		
		goldFishData = new GoldFishData();
		budgetData = new BudgetData();
		
		budgetTV = (TextView)findViewById(R.id.budgetTV);
		fishName = (TextView)findViewById(R.id.fishName);
		fishAge = (TextView)findViewById(R.id.fishAge);
		
		budgetTV.setText("Budget: " + budgetData.getBudgetType().toString() );
		fishName.setText("Name: " + goldFishData.getFishName().toString() );
		
		if (goldFishData.getStringAge() == "1")	{
			fishAge.setText ("Age: " + goldFishData.getStringAge() + " Day!" );
		}
		else	{
			fishAge.setText ("Age: " + goldFishData.getStringAge() + " Days!" );
		}
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.home, menu);
		return true;
	}
	
	/** Called when the user clicks the budgets button */
	public void button_budgets(View v) {
<<<<<<< HEAD
	    Intent intent = new Intent(this, BudgetView.class);
=======
	    Intent intent = new Intent(this, BudgetPane.class);
>>>>>>> 37b35e99f341018a3f354258c274aa983ddc1d6a
	    startActivity(intent);
	}
	
	/** Called when the user clicks the settings button */
	public void button_settings(View v) {
	    Intent intent = new Intent(this, Settings.class);
	    startActivity(intent);
	}
	
	/** Called when the user clicks the add button */
	public void button_add(View view)	{
		// Go to manual entry screen
		Intent intent = new Intent(this, ManualEntry.class);
	    startActivity(intent);
	}

}

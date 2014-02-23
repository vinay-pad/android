
package com.example.myfirstapp;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class DisplayMessageActivity extends Activity {

    @SuppressLint("NewApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        // Make sure we're running on Honeycomb or higher to use ActionBar APIs
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
            // Show the Up button in the action bar.
            getActionBar().setDisplayHomeAsUpEnabled(true);
        }
	Intent intent = getIntent();
	String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
	// Create the text view
	TextView textView = new TextView(this);
	textView.setTextSize(40);
	textView.setText(message);

	// Set the text view as the activity layout
	setContentView(textView);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return true;
    }
}

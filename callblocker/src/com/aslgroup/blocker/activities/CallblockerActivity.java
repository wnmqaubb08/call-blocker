package com.aslgroup.blocker.activities;

import com.aslgroup.blocker.R;
import com.aslgroup.blocker.R.layout;
import com.aslgroup.view.data.Listener.CallBlockerOnClickListener;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class CallblockerActivity extends Activity {
    
	private Button mCallBlockBtn;
	// Create an anonymous implementation of OnClickListener
	private OnClickListener mCallBlockListener = new CallBlockerOnClickListener() {
		
		public void onClick(View view) {
			Intent intent = new Intent();
			intent.setClassName(getApplicationContext(), "com.aslgroup.blocker.activities.BlockCallActivity");
			startActivity(intent);
			
		}
	};

	
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        mCallBlockBtn = (Button) findViewById(R.id.blockCallBtn);
        mCallBlockBtn.setOnClickListener(mCallBlockListener);
    }
}
package com.hone.honeweb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class WelcomeActivity extends Activity {
//Jane's page
	private Button SkipButton;
	private Handler handler;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_welcome);
		SkipButton = (Button) findViewById(R.id.skip_button);
		SkipButton.setOnClickListener(skipButtonlistener);
		
		// 6 seconds redirect to TeamActivety
		handler = new Handler();
		handler.postDelayed(delayThread, 6000);
		
		
	}
	
	private OnClickListener skipButtonlistener = new OnClickListener(){
		@Override
		public void onClick(View v) {
				Intent skipToteam = new Intent(WelcomeActivity.this,TeamActivity.class);
				startActivity(skipToteam);
				handler.removeCallbacks(delayThread);
				finish();
		}
	};
	
	private Runnable delayThread = new Runnable() {
		public void run() {
			Intent i = new Intent(WelcomeActivity.this, TeamActivity.class);
            startActivity(i);
            //redirect to TeamActivity, then this page will disappear
            finish();
		}
	};
	
	
}
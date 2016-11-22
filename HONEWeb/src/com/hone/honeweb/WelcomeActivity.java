package com.hone.honeweb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


public class WelcomeActivity extends Activity {
//Jane's page
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_welcome);
		
		// 3 seconds redirect to TeamActivety
		new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(WelcomeActivity.this, TeamActivity.class);
                startActivity(i);
                //redirect to TeamActivity, then this page will disappear
                finish();
            }
        }, 3000);
		
		
	}
}

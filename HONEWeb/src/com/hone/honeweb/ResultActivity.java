package com.hone.honeweb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_result);
		
		Intent intent = this.getIntent();
		
		TextView firstView = (TextView) findViewById(R.id.textView1);
		TextView secondView = (TextView) findViewById(R.id.textView2);
		
		firstView.setText(intent.getStringExtra("first")+" ");
		secondView.setText(" "+intent.getStringExtra("second"));
	}
}

package com.hone.honeweb;

import java.util.Date;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

// chenlwh push as test aa
public class MainActivity extends Activity {
	private TextView textView;
	private TextView editView;
// test by petergaoa
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		textView = (TextView) findViewById(R.id.textView1);
		editView = (TextView) findViewById(R.id.editText1);
		Button submitButton = (Button) findViewById(R.id.button1);
		Button resultButton = (Button) findViewById(R.id.button2);
		
		submitButton.setOnClickListener(submitButtonListener);
		resultButton.setOnClickListener(resultButtonListener);
	}
	
	private OnClickListener submitButtonListener = new OnClickListener(){
		public void onClick(View arg0) {
			textView.setText("Submit Success!");
			
		}
	};
	
	private OnClickListener resultButtonListener = new OnClickListener(){
		@Override
		public void onClick(View v) {
			if(editView.getText()==null||editView.getText().length()==0){
				textView.setText("E-mail couldn't be null!");
			}else{
				Intent intent = new Intent(MainActivity.this, ResultActivity.class);
				intent.putExtra("first", editView.getText().toString());
				intent.putExtra("second", new Date().toString());
				startActivity(intent);
			}
			
			
		}
	};
}

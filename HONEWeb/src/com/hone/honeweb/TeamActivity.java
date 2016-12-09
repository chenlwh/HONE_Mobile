package com.hone.honeweb;

import com.hone.util.AppUtil;

import android.R.string;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.RelativeLayout;

public class TeamActivity extends Activity implements OnTouchListener, OnGestureListener{
	private GestureDetector gd = null;
	@SuppressWarnings("deprecation")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_team);
		
        Button nextpage1 = (Button) findViewById(R.id.button2);        
        Button nextpage2 = (Button) findViewById(R.id.button3);
		
        nextpage1.setOnClickListener(nextpageListener);              
		nextpage2.setOnClickListener(nextpageListener);
		
		gd = new GestureDetector((OnGestureListener) this);
		
		RelativeLayout ll = (RelativeLayout) findViewById(R.id.team_layout);
		ll.setOnTouchListener(this);
		ll.setLongClickable(true);
	}

    private OnClickListener nextpageListener = new OnClickListener() {
				
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			if(v.getId() == R.id.button2) {
			  Intent intent = new Intent(TeamActivity.this,FunctionActivity.class);
			  intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
			  intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
			  startActivity(intent);
			}
			else if(v.getId() == R.id.button3) { 			   
			  Intent intent = new Intent(TeamActivity.this,MenuActivity.class);
			  intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
			  intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
			  startActivity(intent);  
			}						
	    }
    };

	@Override
	public boolean onDown(MotionEvent e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
		if(e1.getX() - e2.getX() > AppUtil.FLING_MIN_DISTANCE&&Math.abs(velocityX) > AppUtil.FLING_MIN_VELOCITY){
			Intent intent = new Intent(TeamActivity.this,FunctionActivity.class);
			intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
			intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
			startActivity(intent);
//			 Toast.makeText(this, "向左手势", Toast.LENGTH_SHORT).show(); 

		}
		
		return false;
	}

	@Override
	public void onLongPress(MotionEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void onShowPress(MotionEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean onSingleTapUp(MotionEvent e) {
		// TODO Auto-generated method stub
		return false;
	}

	@SuppressLint("ClickableViewAccessibility")
	@Override
	public boolean onTouch(View v, MotionEvent event) {
		// TODO Auto-generated method stub
		return gd.onTouchEvent(event);
	}
}

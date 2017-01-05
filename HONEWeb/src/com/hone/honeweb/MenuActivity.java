package com.hone.honeweb;

import com.hone.util.AppUtil;
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
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class MenuActivity extends Activity implements OnTouchListener, OnGestureListener{
	private GestureDetector gd = null;
	@SuppressWarnings("deprecation")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu);
		
		ImageButton priceButton = (ImageButton) findViewById(R.id.price);
		ImageButton orderButton = (ImageButton) findViewById(R.id.order);
		ImageButton softwareButton = (ImageButton) findViewById(R.id.software);
		ImageButton publicationsButton = (ImageButton) findViewById(R.id.publications);
		
		OnClickListener oopsClickListenter = new OopsClickListener();
		OnClickListener soft1ClickListenter = new Soft1ClickListener();
		
		priceButton.setOnClickListener(soft1ClickListenter);
		orderButton.setOnClickListener(oopsClickListenter);
		softwareButton.setOnClickListener(oopsClickListenter);
		publicationsButton.setOnClickListener(oopsClickListenter);
		
		gd = new GestureDetector((OnGestureListener) this);
		
		LinearLayout ll = (LinearLayout) findViewById(R.id.menu_layout);
		ll.setOnTouchListener(this);
		ll.setLongClickable(true);
		
		priceButton.setOnTouchListener(this);
		priceButton.setLongClickable(true);
		orderButton.setOnTouchListener(this);
		orderButton.setLongClickable(true);
		softwareButton.setOnTouchListener(this);
		softwareButton.setLongClickable(true);
		publicationsButton.setOnTouchListener(this);
		publicationsButton.setLongClickable(true);
	}
	
	
	class OopsClickListener implements OnClickListener{
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent intent = new Intent(MenuActivity.this,OopsActivity.class);
			startActivity(intent);
			
		}
		
	}
	
	class Soft1ClickListener implements OnClickListener{
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent intent = new Intent(MenuActivity.this,Soft1Activity.class);
			startActivity(intent);
			
		}
	}	


	/* (non-Javadoc)
	 * @see android.view.GestureDetector.OnGestureListener#onDown(android.view.MotionEvent)
	 */
	@Override
	public boolean onDown(MotionEvent e) {
		// TODO Auto-generated method stub
		return false;
	}


	/* (non-Javadoc)
	 * @see android.view.GestureDetector.OnGestureListener#onFling(android.view.MotionEvent, android.view.MotionEvent, float, float)
	 */
	@Override
	public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
		if (e2.getX()-e1.getX() > AppUtil.FLING_MIN_DISTANCE && Math.abs(velocityX) >AppUtil.FLING_MIN_VELOCITY) {
			
			Intent intent = new Intent(MenuActivity.this, FunctionActivity.class);
			intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
			startActivity(intent);
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


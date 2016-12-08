package com.hone.honeweb;

import com.hone.util.AppUtil;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class FunctionActivity extends Activity implements OnTouchListener, OnGestureListener{
	private GestureDetector gd = null;
	@SuppressWarnings("deprecation")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_function);
	
		Button price = (Button) findViewById(R.id.function_price_btn);
		Button books = (Button) findViewById(R.id.function_pubs_btn);
		Button order = (Button) findViewById(R.id.function_order_btn);
		price.setOnClickListener(priceListener);
		books.setOnClickListener(booksListener);
		order.setOnClickListener(orderListener);
		
		gd = new GestureDetector((OnGestureListener) this);
		
		RelativeLayout ll = (RelativeLayout) findViewById(R.id.function_layout);
		ll.setOnTouchListener(this);
		ll.setLongClickable(true);
	}

    String price = "IBMers, Customers and Business Partners need access to the pricesOf Hardware, Software  and Services. Price applications can Be used to look up the list price Of single IBM items.";

    private OnClickListener priceListener = new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			TextView tv = (TextView)findViewById(R.id.function_details_tv);
			tv.setText(price);
	    }
    };
    

    String books = "The IBM Publication Centre supports IBM e-business strategy for all users  by supplying a central portal for  accessing and downloading all IBM publications.";

    private OnClickListener booksListener = new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			TextView tv = (TextView)findViewById(R.id.function_details_tv);
			tv.setText(books);
	    }
    };
    
    String order = "A Configuration(CFReport) can be Submitted to the order submission system, which will send it to  the fulfillment system.";

    private OnClickListener orderListener = new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			TextView tv = (TextView)findViewById(R.id.function_details_tv);
			tv.setText(order);
	    }
    };
    
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.function, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public boolean onDown(MotionEvent e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
		// TODO Auto-generated method stub
		if(e1.getX() - e2.getX() > AppUtil.FLING_MIN_DISTANCE&&Math.abs(velocityX) > AppUtil.FLING_MIN_VELOCITY)
		{
			Intent intent = new Intent(FunctionActivity.this,MenuActivity.class);
			intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
			startActivity(intent);

		}
		else if (e2.getX()-e1.getX() > AppUtil.FLING_MIN_DISTANCE && Math.abs(velocityX) >AppUtil.FLING_MIN_VELOCITY) {
			
			Intent intent = new Intent(FunctionActivity.this, TeamActivity.class);
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

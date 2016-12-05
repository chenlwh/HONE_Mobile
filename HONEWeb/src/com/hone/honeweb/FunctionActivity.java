package com.hone.honeweb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class FunctionActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_function);
		
		Button previous = (Button) findViewById(R.id.button1);
		Button next = (Button) findViewById(R.id.button2);
		previous.setOnClickListener(previousListener);
		next.setOnClickListener(nextListener);
		Button price = (Button) findViewById(R.id.button3);
		Button books = (Button) findViewById(R.id.button4);
		Button order = (Button) findViewById(R.id.button5);
		price.setOnClickListener(priceListener);
		books.setOnClickListener(booksListener);
		order.setOnClickListener(orderListener);
	}
	
	private OnClickListener previousListener = new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Intent intent = new Intent(FunctionActivity.this, TeamActivity.class);	    
		    startActivity(intent);
	    }
    };
    
    private OnClickListener nextListener = new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Intent intent = new Intent(FunctionActivity.this, MenuActivity.class);	    
		    startActivity(intent);
	    }
    };

    String price = (String) this.getResources().getText(R.string.function_price);
    private OnClickListener priceListener = new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			TextView tv = (TextView)findViewById(R.id.textView2);
			tv.setText(price);
	    }
    };
    
    String books = (String) this.getResources().getText(R.string.function_books);
    private OnClickListener booksListener = new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			TextView tv = (TextView)findViewById(R.id.textView2);
			tv.setText(books);
	    }
    };
    
    String order = (String) this.getResources().getText(R.string.function_order);
    private OnClickListener orderListener = new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			TextView tv = (TextView)findViewById(R.id.textView2);
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
}

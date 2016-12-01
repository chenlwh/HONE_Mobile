package com.hone.honeweb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class MenuActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu);
		
		ImageButton priceButton = (ImageButton) findViewById(R.id.price);
		ImageButton orderButton = (ImageButton) findViewById(R.id.order);
		ImageButton softwareButton = (ImageButton) findViewById(R.id.software);
		ImageButton publicationsButton = (ImageButton) findViewById(R.id.publications);
		
		OnClickListener oopsClickListenter = new OopsClickListener();
		
		priceButton.setOnClickListener(oopsClickListenter);
		orderButton.setOnClickListener(oopsClickListenter);
		softwareButton.setOnClickListener(oopsClickListenter);
		publicationsButton.setOnClickListener(oopsClickListenter);
	}
	
	
	class OopsClickListener implements OnClickListener{
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent intent = new Intent(MenuActivity.this,OopsActivity.class);
			startActivity(intent);
			
		}
		
	}
}


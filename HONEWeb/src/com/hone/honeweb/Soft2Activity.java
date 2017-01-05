package com.hone.honeweb;

import java.util.ArrayList;

import com.hone.adapter.PriceAdapter;
import com.hone.util.Person;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

public class Soft2Activity extends ListActivity {
private ArrayList<Person> persons = new ArrayList<Person>();
private PriceAdapter priceAdapter = null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
//		setContentView(R.layout.activity_soft2);
		
	    initData();
	    priceAdapter =new PriceAdapter(Soft2Activity.this, R.layout.activity_soft2, persons);
	    setListAdapter(priceAdapter);
	    registerForContextMenu(getListView());
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.soft2, menu);
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
	  protected void onListItemClick(ListView l, View v, int position, long id) {
	    super.onListItemClick(l, v, position, id);
	    Person person = persons.get(position);
	    Toast.makeText(Soft2Activity.this, person.getProgram()+":"+person.getFunction()
	        , Toast.LENGTH_LONG).show();
	    return;
	  }
	  private void initData(){
	    persons.add(new Person("1", "ljq1"));
	    persons.add(new Person("2", "ljq2"));
	    persons.add(new Person("3", "ljq3"));
	    persons.add(new Person("4", "ljq4"));
	    persons.add(new Person("5", "ljq5"));
	    persons.add(new Person("6", "ljq6"));
	    persons.add(new Person("7", "ljq7"));
	    persons.add(new Person("8", "ljq8"));
	    persons.add(new Person("9", "ljq9"));
	  }
}

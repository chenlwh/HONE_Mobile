package com.hone.adapter;

import java.util.List;

import com.hone.honeweb.R;
import com.hone.util.Person;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

@SuppressLint("InflateParams")
public class PriceAdapter extends ArrayAdapter {
private LayoutInflater layoutInflater = null;
private List<Person> persons;
	@SuppressWarnings("unchecked")
	public PriceAdapter(Context context, int resource, List objects) {
		super(context, resource, objects);
		// TODO Auto-generated constructor stub
	    layoutInflater = LayoutInflater.from(context);
	    persons = objects;
	}
	// get counts of records from adapter
	 @Override
    public int getCount(){
    	return persons.size();
    }
	 @Override
	public Object getItem(int position) {
	    return persons.get(position);
	}
	 @Override
	public long getItemId(int position) {
	    return position;
	}
	 public View getView(int position, View convertView, ViewGroup parent) {
	    ViewHolder holder;
	    if(convertView == null){
	      convertView = layoutInflater.inflate(R.layout.activity_soft2, null);
	      holder = new ViewHolder();
	      holder.program = (TextView)convertView.findViewById(R.id.soft_program);
	      holder.function = (TextView)convertView.findViewById(R.id.soft_function);
	      convertView.setTag(holder);
	    }else{
	      holder = (ViewHolder)convertView.getTag();
	    }
	    holder.program.setText(persons.get(position).getProgram());
	    holder.function.setText(persons.get(position).getFunction());
	    return convertView;
	  }     	
	  private static class ViewHolder{
		    private TextView program;
		    private TextView function;
		  }
		}

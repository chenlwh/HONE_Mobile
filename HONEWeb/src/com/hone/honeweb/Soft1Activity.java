package com.hone.honeweb;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.hone.util.AppUtil;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class Soft1Activity extends Activity {

    private TextView view;
    private Spinner spinner;
    private ArrayAdapter<String> adapter;	
	private TextView program;
	private TextView suffix;
	private TextView message1;
    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_soft1);
		
	    view = (TextView) findViewById(R.id.spinnertext1);		
	    spinner = (Spinner) findViewById(R.id.spinner1);
	 
        //将可选内容与ArrayAdapter连接起来
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,AppUtil.countrylist);
         
        //设置下拉列表的风格
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
         
        //将adapter 添加到spinner中
        spinner.setAdapter(adapter);
         
        //添加事件Spinner事件监听  
        spinner.setOnItemSelectedListener(new SpinnerSelectedListener());
         
        //设置默认值
        spinner.setVisibility(View.VISIBLE);
        
		program = (TextView) findViewById(R.id.program);
		suffix = (TextView) findViewById(R.id.suffix);
		
		message1 = (TextView) findViewById(R.id.soft1_msg);
		
		Button submitButton = (Button) findViewById(R.id.price_soft_but1);
		
		submitButton.setOnClickListener(submitButtonListener);
	}
	
    //使用数组形式操作
    class SpinnerSelectedListener implements OnItemSelectedListener{
 
        public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
                long arg3) {
            view.setText("Country name："+AppUtil.countrylist[arg2]);
        }
 
        public void onNothingSelected(AdapterView<?> arg0) {
        }
    }

	private OnClickListener submitButtonListener = new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub			
			Pattern p = Pattern.compile("[0-9]*"); 
			Matcher m = p.matcher(program.getText()); 
			
			if (program.getText()==null||program.getText().length()!=4||!m.matches()){
				message1.setText("Program number must consist of 4 digits");
			}else if(suffix.getText()==null||suffix.getText().length()!=3){
				message1.setText("Program number suffix must consist of 3 alphanumeric characters");	
			}else{	
			    Intent intent = new Intent(Soft1Activity.this,Soft2Activity.class);
				startActivity(intent);
			}	
		}
	};	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.soft1, menu);
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

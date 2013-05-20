package com.uuu.androidtestee;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Log.d("test", "View Git!!");
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void onButton1Clock(View v){
		Log.v("testee", "button clock");
		
		//editText1
		TextView textView1 = (TextView)findViewById(R.id.textView1);
		EditText editText1 = (EditText)findViewById(R.id.editText1);
		textView1.setText(editText1.getText().toString());
		Log.v("testee", "text View =" + textView1.getText().toString());		
	}
	
}

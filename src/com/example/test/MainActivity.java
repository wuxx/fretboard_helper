package com.example.test;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button)findViewById(R.id.btnC);
        TextView textview1 = (TextView)findViewById(R.id.textview1);
        TextView textview2 = (TextView)findViewById(R.id.textview2);

/*        
        btn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				  Toast tst = Toast.makeText(MainActivity.this, "111111111", Toast.LENGTH_SHORT);
		          tst.show();
		     	
			}
		});
*/		
		
    }

    public void clickHandler(View v){
    	switch (v.getId()) {
    	case R.id.btnC:
    		Toast.makeText(this, "Button D clicked!", Toast.LENGTH_SHORT).show();
    		TextView textview1 = (TextView)findViewById(R.id.textview1);
    		textview1.setText("button C");
    		break;    	
    	case R.id.btnD:
    		Toast.makeText(this, "Button D clicked!", Toast.LENGTH_SHORT).show();
    		TextView textview2 = (TextView)findViewById(R.id.textview2);
    		textview2.setText("button D");
    		break;
    	case R.id.btnE:
    		Toast.makeText(this, "Button E clicked!", Toast.LENGTH_SHORT).show();
    		break;
    	case R.id.btnF:
    		Toast.makeText(this, "Button F clicked!", Toast.LENGTH_SHORT).show();
    		break;
    	case R.id.btnG:
    		Toast.makeText(this, "Button G clicked!", Toast.LENGTH_SHORT).show();
    		break;
    	case R.id.btnA:
    		Toast.makeText(this, "Button A clicked!", Toast.LENGTH_SHORT).show();
    		break;
    	case R.id.btnB:
    		Toast.makeText(this, "Button B clicked!", Toast.LENGTH_SHORT).show();
    		break;
    	default:
    		Toast.makeText(this, "Unknown Button clicked!", Toast.LENGTH_SHORT).show();
    	}

    

    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}

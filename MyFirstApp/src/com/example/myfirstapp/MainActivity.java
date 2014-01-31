package com.example.myfirstapp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.EditText;

public class MainActivity extends Activity {

    public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
	
	public void sendMessage (View view){
		Intent intent = new Intent(this, DisplayMessageActivity.class);
//		EditText editText = (EditText) findViewById(R.id.edit_message);
//		String message = editText.getText().toString();
//		intent.putExtra(EXTRA_MESSAGE, message);
//		
//		WebView webview = (WebView) findViewById(R.id.webView1);
//		webview.loadUrl(message);
		
		//startActivity(WEBintent);
		//startActivity(intent);
	}
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getActionBar().setDisplayHomeAsUpEnabled(true);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);


        return super.onCreateOptionsMenu(menu);
    }
    


@Override
public boolean onOptionsItemSelected(MenuItem item) {
    // Handle presses on the action bar items
    switch (item.getItemId()) {
        case R.id.action_aboutUs:
            openAboutUs();
            return true;
        case R.id.action_contactUs:
            openContactUs();
            return true;
        default:
            return super.onOptionsItemSelected(item);
    	}
	}

public void openAboutUs(){
	Intent intent = new Intent(this,DisplayMessageActivity.class);
	intent.putExtra(EXTRA_MESSAGE, "coming from menu");
	startActivity(intent);
}


public void openContactUs(){
	Intent intent = new Intent(this,MapActivity.class);
	intent.putExtra(EXTRA_MESSAGE, "coming from menu");
	startActivity(intent);
}

}
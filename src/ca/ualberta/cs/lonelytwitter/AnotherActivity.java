package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class AnotherActivity extends Activity{
	
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		Button countButton = (Button) findViewById(R.id.count);
		countButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
			}

		});
	}

}

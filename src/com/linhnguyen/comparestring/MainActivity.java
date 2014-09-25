package com.linhnguyen.comparestring;

import java.lang.reflect.Array;
import java.util.ArrayList;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.InputFilter.LengthFilter;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {
	EditText edt1, edt2;
	TextView tvx;
	Button btn;

	public static ArrayList<String> pList = new ArrayList<String>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		edt1 = (EditText) findViewById(R.id.edt1);
		edt2 = (EditText) findViewById(R.id.edt2);
		tvx = (TextView) findViewById(R.id.tvx);
		btn = (Button) findViewById(R.id.btn);
		btn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				String string1 = edt1.getText().toString();
				String string2 = edt2.getText().toString();
				int sumSame = 0;
				int i = 0;
				//int found = 0;
				int length1 = string1.length();
				int length2 = string2.length();
				if (length1 != 0 && length2 != 0 && length2 <= length1){
					while (true) {
						int found = string1.indexOf(string2, i);
						
						if (found != -1) {
							sumSame++;
						}
						else break;
						i = found + 1;
						//found++;
					}
				}
				
				//string1.indexOf(subString, start)

//				int length1 = string1.length();
//				int length2 = string2.length();
//				if (length1 != 0 && length2 != 0 && length2 <= length1) {
//					int size = length1 - length2;
//					for (int i = 0; i <= size; i++) {
//						int j = 0;
//						while (string1.charAt(i + j) == string2.charAt(j)) {
//							j++;
//							if (j == length2) {
//								sumSame = sumSame + 1;
//								break;
//							}
//						}
//					}
//				}

				//tvx.setText(" " + sumSame);
				tvx.setText(" " + sumSame);
			}
		});

	}
}

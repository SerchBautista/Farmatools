package com.itsz.farmatools;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.Button;

public class Admin extends Activity {
	Admin mthis = null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		mthis = this;
		setContentView(R.layout.activity_admin);
		Button btn_altas = (Button)findViewById(R.id.btn_alta);
		btn_altas.setOnTouchListener(new OnTouchListener(){

			@Override
			public boolean onTouch(View v, MotionEvent event) {
				// TODO Auto-generated method stub
				if(event.getAction()==MotionEvent.ACTION_DOWN){
					return true;
				}
				if(event.getAction()==MotionEvent.ACTION_UP){
					Intent in = new Intent(mthis,com.itsz.farmatools.AltaProducto.class);
					startActivity(in);
					return true;
				}
				return false;
			}
		});
		
		Button btn_busqueda = (Button)findViewById(R.id.btn_busqueda);
		btn_busqueda.setOnTouchListener(new OnTouchListener(){

			@Override
			public boolean onTouch(View v, MotionEvent event) {
				// TODO Auto-generated method stub
				if(event.getAction()==MotionEvent.ACTION_DOWN){
					return true;
				}
				if(event.getAction()==MotionEvent.ACTION_UP){
					Intent in = new Intent(mthis,com.itsz.farmatools.BusquedaAdmin.class);
					startActivity(in);
					return true;
				}
				return false;
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_admin, menu);
		return true;
	}

}

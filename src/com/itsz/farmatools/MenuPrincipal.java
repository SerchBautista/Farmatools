package com.itsz.farmatools;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.Button;

public class MenuPrincipal extends Activity {
	MenuPrincipal mthis = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		mthis = this;
		setContentView(R.layout.activity_menu_principal);
		Button btn_ventas = (Button)findViewById(R.id.btn_ventas);
		btn_ventas.setOnTouchListener(new OnTouchListener(){

			@Override
			public boolean onTouch(View v, MotionEvent event) {
				// TODO Auto-generated method stub
				if(event.getAction()==MotionEvent.ACTION_DOWN){
					return true;
				}
				if(event.getAction()==MotionEvent.ACTION_UP){
					Intent in = new Intent(mthis,com.itsz.farmatools.Ventas.class);
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
					Intent in = new Intent(mthis,com.itsz.farmatools.Busqueda.class);
					startActivity(in);
					return true;
				}
				return false;
			}
		});
		Button btn_admin = (Button)findViewById(R.id.btn_admin);
		btn_admin.setOnTouchListener(new OnTouchListener(){

			@Override
			public boolean onTouch(View v, MotionEvent event) {
				// TODO Auto-generated method stub
				if(event.getAction()==MotionEvent.ACTION_DOWN){
					
					return true;
				}
				if(event.getAction()==MotionEvent.ACTION_UP){
					Intent in = new Intent(mthis,com.itsz.farmatools.Admin.class);
					startActivity(in);
					return true;
				}
				return false;
			}
		});
		Button btn_servicios = (Button)findViewById(R.id.btn_servicios);
		btn_servicios.setOnTouchListener(new OnTouchListener(){

			@Override
			public boolean onTouch(View v, MotionEvent event) {
				// TODO Auto-generated method stub
				if(event.getAction()==MotionEvent.ACTION_DOWN){
					return true;
				}
				if(event.getAction()==MotionEvent.ACTION_UP){
					Intent in = new Intent(mthis,com.itsz.farmatools.Servicios.class);
					startActivity(in);
					return true;
				}
				return false;
			}
		});
		Button btn_reportes = (Button)findViewById(R.id.btn_reportes);
		btn_reportes.setOnTouchListener(new OnTouchListener(){

			@Override
			public boolean onTouch(View v, MotionEvent event) {
				// TODO Auto-generated method stub
				if(event.getAction()==MotionEvent.ACTION_DOWN){
					return true;
				}
				if(event.getAction()==MotionEvent.ACTION_UP){
					Intent in = new Intent(mthis,com.itsz.farmatools.Reportes.class);
					startActivity(in);
					return true;
				}
				return false;
			}
		});
		Button btn_sin_stock = (Button)findViewById(R.id.btn_sin_stock);
		btn_sin_stock.setOnTouchListener(new OnTouchListener(){

			@Override
			public boolean onTouch(View v, MotionEvent event) {
				// TODO Auto-generated method stub
				if(event.getAction()==MotionEvent.ACTION_DOWN){
					return true;
				}
				if(event.getAction()==MotionEvent.ACTION_UP){
					
					Intent in = new Intent(mthis,com.itsz.farmatools.SinStock.class);
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
		getMenuInflater().inflate(R.menu.activity_menu_principal, menu);
		return true;
	}

}

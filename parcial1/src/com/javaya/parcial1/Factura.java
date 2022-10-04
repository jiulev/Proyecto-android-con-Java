package com.javaya.parcial1;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class Factura extends Activity {
TextView t1,t2,t3,t4,t5,t6,t7;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_factura);
		
		t1=(TextView) findViewById(R.id.textViewA);
		t2=(TextView) findViewById(R.id.textViewC);
		t3=(TextView) findViewById(R.id.textViewE);
		t4=(TextView) findViewById(R.id.textViewG);
		t5=(TextView) findViewById(R.id.textViewH);
		t6=(TextView) findViewById(R.id.textViewJ);
		t7=(TextView) findViewById(R.id.textViewL);
		Bundle b =getIntent().getExtras();
		t1.setText(b.getString("nom"));
		t2.setText(b.getString("cant"));
		t3.setText(b.getString("precio1"));
		t4.setText(b.getString("pago"));
		t5.setText(b.getString("envio"));
		t6.setText(b.getString("desc"));
		t7.setText(b.getString("total1"));
	}
public void regresar (View v){
finish();
	
	
}
	
}

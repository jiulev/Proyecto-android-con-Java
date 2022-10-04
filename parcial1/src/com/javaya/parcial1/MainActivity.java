package com.javaya.parcial1;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	EditText e1,e2,e3,e4;
    TextView t1,t2;
    RadioButton r1,r2,r3;
    CheckBox ch1;
	

	
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        e1 =(EditText) findViewById(R.id.editText1);
        e2 =(EditText) findViewById(R.id.editText2);
        e3 =(EditText) findViewById(R.id.editText3);
       
        
        t1=(TextView) findViewById(R.id.textView7);
        t2 = (TextView) findViewById(R.id.textView8);
        r1=(RadioButton) findViewById(R.id.radio0);
        r3=(RadioButton) findViewById(R.id.radio1);
        r2=(RadioButton) findViewById(R.id.radio2);
        ch1=(CheckBox) findViewById(R.id.checkBox1);
      
        
        
        
        
    }

public void importee (View v){
	float porc=0;
	String nombre= e1.getText().toString();
	
	String dato1= e2.getText().toString();
	
	String dato2= e3.getText().toString();
	
	
	 if(nombre.equals("")|| dato2.equals("")|| dato2.equals("")){
		 Toast t1= Toast.makeText(this, "Faltan Ingresar datos", Toast.LENGTH_LONG);
	 t1.show();
	    }
	 else{
	 
		 float precio= Float.parseFloat(dato1);
	
		 int cantidad=Integer.parseInt(dato2);

		 
		 porc=(precio*10)/100;

		 if (r1.isChecked()) {
						 precio=precio-porc; 
						 t2.setText(" -10 %");
						 
			} else if (r2.isChecked()) {
				 precio=precio-0; 
				 t2.setText(" 0 %");
				 
				
			}  else {
				 precio=precio+porc; 
				 t2.setText(" +10 %");
			}
	
	 
 float importe=(precio*cantidad);
 
	
 if (ch1.isChecked()){ importe=importe+100; }
 
 
 
 
    t1.setText(""+importe);
    
	 }   
}

    
public void factura (View v){
	
	
	Intent i= new Intent(this,Factura.class);
	
	String nombre= e1.getText().toString();
	String cant= e3.getText().toString();
	String precio1= e2.getText().toString();
	String pago= "";
	String desc="";
	String envio= "";
	
	String total1=t1.getText().toString();
	
	
	
	if (r1.isChecked()){pago="contado";
	desc="Descuento del 10%";}
	else if (r2.isChecked()){pago="Un pago con tarjeta";
	desc=" - ";}
	else if (r3.isChecked()){pago="Tres cuotas con tarjeta"; desc="Recargo del 10%";}
	 if (ch1.isChecked()) envio="Costo de envio $100"; 
	 else  envio="Sin envio";
	 
	i.putExtra("nom", nombre);
	
	i.putExtra("cant", cant);
	i.putExtra("precio1", precio1);
	i.putExtra("pago", pago);
	i.putExtra("envio", envio);
	i.putExtra("desc", desc);
	i.putExtra("total1", total1);
	
	 startActivity(i);
} 
    
}  


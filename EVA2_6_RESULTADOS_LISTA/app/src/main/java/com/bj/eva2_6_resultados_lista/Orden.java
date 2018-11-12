package com.bj.eva2_6_resultados_lista;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Orden extends AppCompatActivity {

    EditText cantidadET, precioET;
    Intent result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orden);
        cantidadET = findViewById(R.id.cantidadET);
        precioET = findViewById(R.id.precioET);
        result = getIntent();
    }

    public double calcularTotal(){
        int cantidad = Integer.parseInt(cantidadET.getText().toString());
        double precio = Double.parseDouble(precioET.getText().toString());
        return cantidad * precio;
    }

    public void aceptarOrden(View v){
        result.putExtra("total", calcularTotal());
        setResult(Activity.RESULT_OK, result);
        finish();
    }
}

package com.bj.eva2_6_resultados_lista;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView restaTV, totalTV;
    Intent restaInt, ordenInt;
    final int LISTA_CODE = 420;
    final int ORDEN_CODE = 69;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        restaTV = findViewById(R.id.restaTV);
        totalTV = findViewById(R.id.totalTV);
        restaInt = new Intent(this, ListaRestaurantes.class);
        ordenInt = new Intent(this, Orden.class);
    }

    public void seleccionRest(View v){
        startActivityForResult(restaInt,LISTA_CODE);
    }

    public void crearOrden(View v){
        startActivityForResult(ordenInt, ORDEN_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == LISTA_CODE){
            if(resultCode == Activity.RESULT_OK){
                int restauranteId = data.getIntExtra("restauranteId", 0);
                restaTV.setText(Datos.restaurantes[restauranteId]);
            }
        }
        if(requestCode == ORDEN_CODE){
            if(resultCode == Activity.RESULT_OK){
                totalTV.setText("Total: $" + data.getDoubleExtra("total", 0.0));
            }
        }
    }
}

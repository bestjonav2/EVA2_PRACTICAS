package com.bj.eva2_6_resultados_lista;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListaRestaurantes extends AppCompatActivity implements ListView.OnItemClickListener{

    ListView restaurantesLV;
    Intent restaInt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_restaurantes);
        restaurantesLV = findViewById(R.id.restaurantesLV);
        restaurantesLV.setOnItemClickListener(this);
        restaurantesLV.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Datos.restaurantes));
        restaInt = getIntent();
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        restaInt.putExtra("restauranteId", i);
        setResult(Activity.RESULT_OK, restaInt);
        finish();
    }
}

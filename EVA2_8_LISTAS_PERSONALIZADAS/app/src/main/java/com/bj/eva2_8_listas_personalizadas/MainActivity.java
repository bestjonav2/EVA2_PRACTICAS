package com.bj.eva2_8_listas_personalizadas;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MainActivity extends AppCompatActivity {

    List<Clima> climas;
    ListView listaClimas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        climas = new ArrayList<Clima>();
        climas.add(new Clima("Chihuahua",5,"Nublado", R.drawable.cloudy));
        climas.add(new Clima("Monterrey",3,"Nublado", R.drawable.cloudy));
        climas.add(new Clima("Delicias",7,"Lluvia ligera", R.drawable.light_rain));
        climas.add(new Clima("Aldama",0,"Lluvioso", R.drawable.rainy));
        climas.add(new Clima("Ciudad Juarez",-3,"Soleado", R.drawable.sunny));
        listaClimas = findViewById(R.id.climasLV);
    }
}

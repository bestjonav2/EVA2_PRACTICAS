package com.bj.eva2_2_intentos_implicitos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class secundaria extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundaria);
    }

    public void cerrarActividad(View v){
        finish();
    }
}

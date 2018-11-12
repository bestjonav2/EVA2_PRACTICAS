package com.bj.eva2_3_bundles_extras;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView msgTV;
    Intent leerMsg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        msgTV = findViewById(R.id.mensajeTV);
        leerMsg = getIntent();
        msgTV.setText(leerMsg.getStringExtra("msg"));

    }

    public void cerrarActividad(View v){
        finish();
    }
}

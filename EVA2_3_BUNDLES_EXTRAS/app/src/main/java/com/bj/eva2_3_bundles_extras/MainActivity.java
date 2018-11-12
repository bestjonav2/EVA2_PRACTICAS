package com.bj.eva2_3_bundles_extras;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Intent segundaAct;
    EditText mensaje;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mensaje = findViewById(R.id.mensajeET);
        segundaAct = new Intent(this, Main2Activity.class);
    }

    public void abrirActividad(View v){
        String msg = mensaje.getText().toString();
        segundaAct.putExtra("msg", msg);
        startActivity(segundaAct);
    }
}

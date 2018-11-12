package com.bj.eva2_10_cuadros_dialogo;

import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickAlerta1(View v){
        new AlertDialog.Builder(this).setTitle("Alerta 1").setMessage("Holaaaaaaaaaaaaaa").setPositiveButton("Simon", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(),"POSITIVE", Toast.LENGTH_SHORT).show();
            }
        }).setNegativeButton("Nel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(), "NEGATIVE", Toast.LENGTH_SHORT).show();
            }
        }).create().show();
    }

    public void clickAlerta2(View v){
        final Dialog alertaPersonalizada = new Dialog(this);
        alertaPersonalizada.setContentView(R.layout.mi_cuadro_dialogo);
    }
}

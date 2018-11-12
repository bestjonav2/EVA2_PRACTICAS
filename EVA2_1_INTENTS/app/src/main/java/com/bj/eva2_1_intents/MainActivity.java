package com.bj.eva2_1_intents;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText telefonoET;
    Intent marcarInt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        telefonoET = findViewById(R.id.telefonoET);
    }

    public void onClick(View v){
        String tel = telefonoET.toString();
        tel = "tel: " + tel;
        marcarInt = new Intent(Intent.ACTION_DIAL, Uri.parse(tel));
        startActivity(marcarInt);
    }

    public void onClick2(View v){
        String tel = telefonoET.toString();
        tel = "tel: " + tel;
        marcarInt = new Intent(Intent.ACTION_CALL, Uri.parse(tel));
        startActivity(marcarInt);
    }

    public void browseOnClick(View v){

        marcarInt = new Intent(Intent.ACTION_WEB_SEARCH);
        marcarInt.putExtra(SearchManager.QUERY,"Tacos");
        startActivity(marcarInt);
    }
}

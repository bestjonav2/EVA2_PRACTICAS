package com.bj.eva2_7_intentos_resultados;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView result;
    Intent contactosIntent;
    Uri contactosUri;
    final int CONTACTOS_ID = 69;
    Intent imagenesIntent;
    Uri imagenesUri;
    final int IMAGENES_ID = 420;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = findViewById(R.id.resultTV);
        contactosUri = ContactsContract.Contacts.CONTENT_URI;
        contactosIntent = new Intent(Intent.ACTION_PICK, contactosUri);
        imagenesUri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        imagenesIntent = new Intent(Intent.ACTION_PICK, imagenesUri);
    }

    public void contactosClick(View v){
        startActivityForResult(contactosIntent, CONTACTOS_ID);
    }

    public void imagenesClick(View v){
        startActivityForResult(imagenesIntent, IMAGENES_ID);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode){
            case CONTACTOS_ID:
                if(resultCode == Activity.RESULT_OK){
                    String intentResult = data.getDataString();
                    result.setText(intentResult);
                    //data = new Intent(Intent.ACTION_DIAL);
                }
                break;
            case IMAGENES_ID:
                if(resultCode == Activity.RESULT_OK){
                    String intentResult = data.getDataString();
                    result.setText(intentResult);
                }
                break;
        }
    }
}

package com.bj.eva2_5_activity_for_result;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    EditText messageET;
    Intent sendData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        messageET = findViewById(R.id.messageET);
        sendData = getIntent();
    }

    public void sendMessage(View v){
        String msg = messageET.getText().toString();
        sendData.putExtra("msg", msg);
        setResult(Activity.RESULT_OK, sendData);
        finish();
    }
}

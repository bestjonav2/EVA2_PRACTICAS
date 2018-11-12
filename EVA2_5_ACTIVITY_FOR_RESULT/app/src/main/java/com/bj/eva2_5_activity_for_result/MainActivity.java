package com.bj.eva2_5_activity_for_result;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Intent secondActivity;
    TextView resultTV;
    final int requestCode = 420;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultTV = findViewById(R.id.resultTV);
        secondActivity = new Intent(this, SecondActivity.class);
    }

    public void openActivity(View v){
        startActivityForResult(secondActivity, requestCode);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == this.requestCode){
            if(resultCode == Activity.RESULT_OK){
                resultTV.setText(data.getStringExtra("msg"));
            }
        }
    }
}

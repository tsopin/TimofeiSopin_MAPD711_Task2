package com.example.tsopin.timofeisopin_mapd711_task2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent i = getIntent() ;

        TextView outputText1 = (TextView)findViewById(R.id.outputText1);
                outputText1.setText(R.string.FullName);
    }
}
package com.example.tsopin.timofeisopin_mapd711_task2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_first);
    }
    public void sendButtonClick(View v)
    {
        Intent i=new Intent(FirstActivity.this, SecondActivity.class);
        startActivity(i);
    }
}
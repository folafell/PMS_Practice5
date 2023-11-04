package com.example.last_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnWeb;
    Button btnMap;
    Button btnCall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnWeb = (Button) findViewById(R.id.btnWeb);
        btnMap = (Button) findViewById(R.id.btnMap);
        btnCall = (Button) findViewById(R.id.btnCall);

        btnWeb.setOnClickListener(this);
        btnMap.setOnClickListener(this);
        btnCall.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        if (view.getId() == R.id.btnWeb)
        {
            intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://developer.android.com"));
            startActivity(intent);
        }
        if (view.getId() == R.id.btnMap)
        {
            intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("geo:-0.45609946, -90.26607513"));
            startActivity(intent);
        }
        if (view.getId() == R.id.btnCall)
        {
            intent = new Intent();
            intent.setAction(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:12345"));
            startActivity(intent);
        }
    }
}
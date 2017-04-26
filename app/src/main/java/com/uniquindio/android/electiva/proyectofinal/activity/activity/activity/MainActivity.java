package com.uniquindio.android.electiva.proyectofinal.activity.activity.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.uniquindio.android.electiva.proyectofinal.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ingresar(View view){
        Intent intent = new Intent(this, VistaDosActivity.class);
        startActivity(intent);
    }
}

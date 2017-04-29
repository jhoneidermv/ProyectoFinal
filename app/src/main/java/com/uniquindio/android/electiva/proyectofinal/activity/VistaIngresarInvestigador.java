package com.uniquindio.android.electiva.proyectofinal.activity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.uniquindio.android.electiva.proyectofinal.R;

/**
 * Created by camilo marin on 26/04/2017.
 */

public class VistaIngresarInvestigador extends AppCompatActivity{
    Spinner lista;
    Drawable drawable;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista_ingresar_investigador);


        lista=(Spinner)findViewById(R.id.spinner2);
        String[] valores = {"uno","dos","tres","cuatro","cinco","seis", "siete", "ocho"};
        lista.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, valores));

    }
}

package com.uniquindio.android.electiva.proyectofinal.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.uniquindio.android.electiva.proyectofinal.R;
import com.uniquindio.android.electiva.proyectofinal.fragments.AgregarInvestigadorFragment;


/**
 * Created by camilo marin on 25/04/2017.
 */

public class VistaDosActivity extends AppCompatActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista_dos);
    }

    public void fragmentAgregar(View view){
        AgregarInvestigadorFragment agregarInvestigadorFragment =  new AgregarInvestigadorFragment();
        agregarInvestigadorFragment.show(getSupportFragmentManager(),"Investigador");
  }
}

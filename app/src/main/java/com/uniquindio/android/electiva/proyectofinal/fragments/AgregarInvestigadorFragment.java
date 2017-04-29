package com.uniquindio.android.electiva.proyectofinal.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

import com.uniquindio.android.electiva.proyectofinal.R;
import com.uniquindio.android.electiva.proyectofinal.activity.VistaIngresarGrupoInvestigacion;
import com.uniquindio.android.electiva.proyectofinal.activity.VistaIngresarInvestigador;

/**
 * Created by camilo marin on 25/04/2017.
 */

public class AgregarInvestigadorFragment extends DialogFragment implements View.OnClickListener{

    RadioButton radioButtonInvestigador;
    RadioButton radioButtonGrupo;
    Button button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        getDialog().setTitle(getResources().getString(R.string.titulo_fragmento_agregar_investigador));
        return inflater.inflate(R.layout.fragment_agregar, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        radioButtonInvestigador =  (RadioButton) getView().findViewById(R.id.rbInsertarInvestigador);
        radioButtonGrupo =  (RadioButton) getView().findViewById(R.id.rbInsertarGrupoInvestigacion);

        radioButtonInvestigador.setOnClickListener((View.OnClickListener) this);
        radioButtonGrupo.setOnClickListener((View.OnClickListener) this);

        button = (Button) getView().findViewById(R.id.btnIngresarFragment);
        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                if(radioButtonInvestigador.isChecked()){
                    formularioInvestigador(getView());
                } else if(radioButtonGrupo.isChecked()){
                    formularioGrupoInvestigacion(getView());
                }else{
                    Toast.makeText(getContext(), "Seleccione una de las opciones", Toast.LENGTH_SHORT).show();
                }


            }
        });


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnIngresarFragment:

        }
    }

    public void formularioInvestigador(View view){
        Intent intent = new Intent(this.getContext(), VistaIngresarInvestigador.class);
        startActivity(intent);
    }

    public void formularioGrupoInvestigacion(View view){
        Intent intent = new Intent(this.getContext(), VistaIngresarGrupoInvestigacion.class);
        startActivity(intent);
    }
}

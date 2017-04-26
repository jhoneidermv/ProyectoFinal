package com.uniquindio.android.electiva.proyectofinal.activity.activity.activity.fragments;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;

import com.uniquindio.android.electiva.proyectofinal.R;

/**
 * Created by camilo marin on 25/04/2017.
 */

public class AgregarInvestigadorFragment extends DialogFragment implements View.OnClickListener{

    RadioButton radioButtonInvestigador;
    RadioButton radioButtonGrupo;

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


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.rbInsertarInvestigador:
                Log.v("alerta","Se selecciono el boton de investigador");
                break;
            case R.id.rbInsertarGrupoInvestigacion:
                Log.v("alerta","Se selecciono el boton de grupo de investigación");
                break;
        }
    }
}

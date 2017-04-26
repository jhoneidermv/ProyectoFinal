package com.uniquindio.android.electiva.proyectofinal.activity.activity.activity.fragments;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.uniquindio.android.electiva.proyectofinal.R;

/**
 * Created by camilo marin on 25/04/2017.
 */

public class AgregarInvestigadorFragment extends DialogFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        getDialog().setTitle(getResources().getString(R.string.titulo_fragmento_agregar_investigador));
        return inflater.inflate(R.layout.fragment_agregar, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }
}

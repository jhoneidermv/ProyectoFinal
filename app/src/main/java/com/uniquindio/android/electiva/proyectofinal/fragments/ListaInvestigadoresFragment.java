package com.uniquindio.android.electiva.proyectofinal.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.uniquindio.android.electiva.proyectofinal.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ListaInvestigadoresFragment extends Fragment {
    private RecyclerView listadoInvestigadores;

    public void setListadoInvestigadores(RecyclerView listadoInvestigadores) {
        this.listadoInvestigadores = listadoInvestigadores;
    }

    public ListaInvestigadoresFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_lista_investigadores, container, false);
    }

}

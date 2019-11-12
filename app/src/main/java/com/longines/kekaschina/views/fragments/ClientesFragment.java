package com.longines.kekaschina.views.fragments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.longines.kekaschina.R;
import com.longines.kekaschina.base.BaseFragment;
import com.longines.kekaschina.base.OnItemClickListener;
import com.longines.kekaschina.models.Platillo;
import com.longines.kekaschina.views.interfaces.ClienteView;

/**
 * A simple {@link Fragment} subclass.
 */
public class ClientesFragment extends BaseFragment implements ClienteView, OnItemClickListener<Platillo
        > {


    public ClientesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_clientes, container, false);
        return view;
    }

    @Override
    protected void initPresenter() {

    }

    @Override
    protected void initComponents() {

    }

    @Override
    public void onItemClick(Platillo platillo) {

    }
}

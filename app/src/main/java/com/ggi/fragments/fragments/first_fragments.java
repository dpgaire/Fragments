package com.ggi.fragments.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.ggi.fragments.R;


public class first_fragments extends Fragment implements View.OnClickListener {

    private Button btnCalcualte;
    private EditText etFirst,etSecod;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_first_fragments,container,false);

        etFirst=view.findViewById(R.id.etfirst);
        etSecod=view.findViewById(R.id.etsecond);
        btnCalcualte=view.findViewById(R.id.btnCslculatetwono);

        btnCalcualte.setOnClickListener(this);
        return view;

    }

    @Override
    public void onClick(View v) {
        int first=Integer.parseInt(etFirst.getText().toString());
        int second=Integer.parseInt(etSecod.getText().toString());
        int results=first+second;

        Toast.makeText(getActivity(), "Sum is"+results, Toast.LENGTH_SHORT).show();

    }
}

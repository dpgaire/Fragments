package com.ggi.fragments.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.ggi.fragments.Calculation;
import com.ggi.fragments.R;


public class CheckPalindrome extends Fragment implements View.OnClickListener{

EditText etnumber;
Button btnPalindrome;
    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

       View view=inflater.inflate(R.layout.fragment_check_palindrome,container,false);
       btnPalindrome=view.findViewById(R.id.btnPlalindrome);
       etnumber=view.findViewById(R.id.etpalnum);
        btnPalindrome.setOnClickListener(this);
       return view;
    }

    @Override
    public void onClick(View v) {
        int panNo;
        boolean results;
        panNo=Integer.parseInt(etnumber.getText().toString());
        Calculation ca=new Calculation(panNo);
        results=ca.CheckPalindrome();

        if(results=true){
            Toast.makeText(getContext(), "Thsi is palindrome number", Toast.LENGTH_SHORT).show();

        }
        else {
            Toast.makeText(getContext(), "Thsi is not palindrome number", Toast.LENGTH_SHORT).show();

        }
    }
}

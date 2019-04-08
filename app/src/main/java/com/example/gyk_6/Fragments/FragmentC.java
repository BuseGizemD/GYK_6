package com.example.gyk_6.Fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.gyk_6.DataTransferListener;
import com.example.gyk_6.R;

public class FragmentC extends Fragment {
    private int numberOne = 0, numberTwo = 0;
    TextView txtResult;
    Button btnCalculate;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_c, container, false);

        txtResult = view.findViewById(R.id.frag_c_text);
        btnCalculate = view.findViewById(R.id.frag_c_calculate);
        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate();
            }
        });

        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    public void sendData(int birinciSayi, int ikinciSayi) {
        this.numberOne = birinciSayi;
        this.numberTwo = ikinciSayi;
    }

    public void calculate() {
        txtResult.setText(String.valueOf(this.numberOne + this.numberTwo));
    }

    /* Activity'e data gönderme methodu */
    /*public void sendToActivityData() {
        int s1 = Integer.parseInt(ed_one.getText().toString());
        int s2 = Integer.valueOf(ed_two.getText().toString());

        DataTransferListener listener = (DataTransferListener) getActivity();
        listener.sumData(s1, s2);
    }*/
}
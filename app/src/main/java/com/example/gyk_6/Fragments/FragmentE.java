package com.example.gyk_6.Fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.gyk_6.DataTransferListener;
import com.example.gyk_6.R;

public class FragmentE extends Fragment {
    EditText ed1, ed2;
    Button sendBtn;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_e, container,false);

        ed1 = view.findViewById(R.id.frag_e_one);
        ed2 = view.findViewById(R.id.frag_e_two);
        sendBtn = view.findViewById(R.id.frag_e_button);
        sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int one = Integer.parseInt(ed1.getText().toString());
                int two = Integer.parseInt(ed2.getText().toString());
                DataTransferListener listener = (DataTransferListener) getActivity();
                listener.sumData(one, two);
            }
        });
        return view;
    }
}

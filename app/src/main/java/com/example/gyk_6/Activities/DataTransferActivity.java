package com.example.gyk_6.Activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.gyk_6.DataTransferListener;
import com.example.gyk_6.Fragments.FragmentA;
import com.example.gyk_6.Fragments.FragmentB;
import com.example.gyk_6.Fragments.FragmentC;
import com.example.gyk_6.Fragments.FragmentD;
import com.example.gyk_6.Fragments.FragmentE;
import com.example.gyk_6.R;

public class DataTransferActivity extends AppCompatActivity implements DataTransferListener {
    EditText firstEd, secondEd;
    FragmentManager manager;
    TextView txtData;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_transfer);

        initialize();
    }

    private void initialize() {
        manager = getSupportFragmentManager();

        firstEd = findViewById(R.id.ed_one);
        secondEd = findViewById(R.id.ed_two);
        txtData = findViewById(R.id.activity_data_text);

        FragmentE fragmentE = new FragmentE();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.frame_layout, fragmentE, "fragE");
        transaction.commit();
    }

    public void addFragmentCwithData(View v) {
        int numberOne = Integer.parseInt(firstEd.getText().toString());
        int numberTwo = Integer.valueOf(secondEd.getText().toString());

        FragmentC fragmentC = new FragmentC();
        fragmentC.sendData(numberOne, numberTwo);
        /*fragmentC.numberOne = numberOne;
        fragmentC.numberTwo = numberTwo;*/
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.frame_layout, fragmentC, "fragC");
        transaction.commit();
    }

    public void addFragmentDwithData(View v) {
        int numberOne = Integer.parseInt(firstEd.getText().toString());
        int numberTwo = Integer.valueOf(secondEd.getText().toString());

        FragmentD fragmentD = new FragmentD();

        Bundle bundle = new Bundle();
        bundle.putInt("first", numberOne);
        bundle.putInt("second", numberTwo);

        fragmentD.setArguments(bundle);
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.frame_layout, fragmentD, "fragD");
        transaction.commit();
    }

    @Override
    public void sumData(int number_one, int number_two) {
        txtData.setText("Fragment'tan gelen :" + String.valueOf(number_one + number_two));
    }
}

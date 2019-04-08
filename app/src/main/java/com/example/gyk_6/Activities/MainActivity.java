package com.example.gyk_6.Activities;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.gyk_6.Fragments.FragmentA;
import com.example.gyk_6.Fragments.FragmentB;
import com.example.gyk_6.R;

public class MainActivity extends AppCompatActivity {
    FragmentManager manager;
    EditText firstEd, secondEd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialize();
    }

    private void initialize() {
        manager = getSupportFragmentManager();
    }

    public void addFragmentA(View v) {
        FragmentA fragmentA = new FragmentA();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.fragment_layout, fragmentA, "fragA");
        transaction.commit();
    }

    public void addFragmentB(View v) {
        FragmentB fragmentB = new FragmentB();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.fragment_layout, fragmentB, "fragB");
        transaction.commit();
    }

    public void removeFragmentA(View v) {
        FragmentA fragmentA = (FragmentA) manager.findFragmentByTag("fragA");
        FragmentTransaction transaction = manager.beginTransaction();
        if (fragmentA != null) {
            transaction.remove(fragmentA);
            transaction.commit();
        } else {
            Toast.makeText(this, "Fragment A bulunamadı", Toast.LENGTH_LONG).show();
        }
    }

    public void removeFragmentB(View v) {
        FragmentB fragmentB = (FragmentB) manager.findFragmentByTag("fragB");
        FragmentTransaction transaction = manager.beginTransaction();
        if (fragmentB != null) {
            transaction.remove(fragmentB);
            transaction.commit();
        } else {
            Toast.makeText(this, "Fragment B bulunamadı", Toast.LENGTH_LONG).show();
        }
    }

    public void replaceByFragmentA(View v) {
        FragmentA fragmentA = new FragmentA();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.fragment_layout, fragmentA, "fragA");
        transaction.commit();
    }

    public void replaceByFragmentB(View v) {
        FragmentB fragmentB = new FragmentB();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.fragment_layout, fragmentB, "fragB");
        transaction.commit();
    }

    public void attachFragmentA(View v) {

        FragmentA fragmentA = (FragmentA) manager.findFragmentByTag("fragA");
        FragmentTransaction transaction = manager.beginTransaction();
        if (fragmentA != null) {
            transaction.attach(fragmentA);
            transaction.commit();
        } else {
            Toast.makeText(this, "Fragment A bulunamadı", Toast.LENGTH_LONG).show();
        }
    }

    public void detachFragmentA(View v) {

        FragmentA fragmentA = (FragmentA) manager.findFragmentByTag("fragA");
        FragmentTransaction transaction = manager.beginTransaction();
        if (fragmentA != null) {
            transaction.detach(fragmentA);
            transaction.commit();
        } else {
            Toast.makeText(this, "Fragment A bulunamadı", Toast.LENGTH_LONG).show();
        }
    }

    public void showFragmentA(View v) {
        FragmentA fragmentA = (FragmentA) manager.findFragmentByTag("fragA");
        FragmentTransaction transaction = manager.beginTransaction();

        if (fragmentA != null) {
            transaction.show(fragmentA);
            transaction.commit();
        } else {
            Toast.makeText(this, "Fragment A bulunamadı", Toast.LENGTH_LONG).show();
        }
    }

    public void hideFragmentA(View v) {
        FragmentA fragmentA = (FragmentA) manager.findFragmentByTag("fragA");
        FragmentTransaction transaction = manager.beginTransaction();

        if (fragmentA != null) {
            transaction.hide(fragmentA);
            transaction.commit();
        } else {
            Toast.makeText(this, "Fragment A bulunamadı", Toast.LENGTH_LONG).show();
        }
    }
}

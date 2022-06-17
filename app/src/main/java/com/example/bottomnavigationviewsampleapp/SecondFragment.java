package com.example.bottomnavigationviewsampleapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

public class SecondFragment extends Fragment {


    Button btDoSomething;
    EditText etTypeSomething;
    // The onCreateView method is called when Fragment should create its View object hierarchy,
    // either dynamically or via XML layout inflation.

    MainActivity activity;

    public SecondFragment (MainActivity mainActivity) {
        activity = mainActivity;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        // Defines the xml file for the fragment
        return inflater.inflate(R.layout.fragment_secound, parent, false);
    }

    // This event is triggered soon after onCreateView().
    // Any view setup should occur here.  E.g., view lookups and attaching view listeners.
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        // Setup any handles to view objects here
        // EditText etFoo = (EditText) view.findViewById(R.id.etFoo);
        etTypeSomething = (EditText) view.findViewById(R.id.etTypeSomething);
        btDoSomething = (Button) view.findViewById(R.id.btDoSomething);


        btDoSomething.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.fragment1.changeText("test");
            }
        });
    }
}
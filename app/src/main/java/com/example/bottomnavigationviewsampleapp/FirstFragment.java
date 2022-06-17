package com.example.bottomnavigationviewsampleapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import org.w3c.dom.Text;

public class FirstFragment extends Fragment {
    // The onCreateView method is called when Fragment should create its View object hierarchy,
    // either dynamically or via XML layout inflation.

    TextView tvReceive;

    String str = "initial text";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        // Defines the xml file for the fragment
        return inflater.inflate(R.layout.fragment_first, parent, false);
    }

    // This event is triggered soon after onCreateView().
    // Any view setup should occur here.  E.g., view lookups and attaching view listeners.
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        // Setup any handles to view objects here
        tvReceive = (TextView) view.findViewById(R.id.tvReceive);
    }

    @Override
    public void onResume() {
        super.onResume();
        tvReceive.setText(str);
    }

    public void changeText(String inputFromSecondFragment) {
        str = inputFromSecondFragment;
    }
}
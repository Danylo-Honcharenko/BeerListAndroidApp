package com.example.studyandroid;

import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class Beer {
    private final TextView textResult;
    private final Spinner spinner;

    public Beer(TextView textResult, Spinner spinner) {
        this.spinner = spinner;
        this.textResult = textResult;
    }

    public void find(View v) {
        String beerResult = String.valueOf(spinner.getSelectedItem());
        textResult.setText(beerResult);
    }
}

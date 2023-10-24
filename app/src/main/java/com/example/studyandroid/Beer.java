package com.example.studyandroid;

import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class Beer {
    private final TextView textResult;
    private final Spinner spinner;
    private final BeerBrands brand = new BeerBrands();

    public Beer(TextView textResult, Spinner spinner) {
        this.spinner = spinner;
        this.textResult = textResult;
    }

    public void find(View v) {
        String beerResult = String.valueOf(spinner.getSelectedItem());
        List<String> product = brand.get(beerResult);
        StringBuilder brandFormat = new StringBuilder();
        product.forEach(w -> brandFormat.append(w).append("\n"));
        textResult.setText(brandFormat);
    }
}

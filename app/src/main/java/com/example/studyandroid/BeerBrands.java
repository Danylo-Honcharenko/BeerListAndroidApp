package com.example.studyandroid;

import java.util.ArrayList;
import java.util.List;

public class BeerBrands {
    public List<String> get(String beer) {
        List<String> brands = new ArrayList<>();
        if (beer.equals("Amber")) {
            brands.add("Jack Amber");
            brands.add("Red Moose");
        } else {
            brands.add("Jail Pale Ale");
            brands.add("Gout Stout");
        }
        return brands;
    }
}

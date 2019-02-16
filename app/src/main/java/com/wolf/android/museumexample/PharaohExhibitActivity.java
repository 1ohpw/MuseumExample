package com.wolf.android.museumexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public class PharaohExhibitActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pharoah_exhibit);

        ArrayList<Exhibit> pharaohsList = new ArrayList<>();
        pharaohsList.add(new Exhibit("Khufu", R.drawable.khufu));
        pharaohsList.add(new Exhibit("Khafre", R.drawable.khafre));
        pharaohsList.add(new Exhibit("Menkaure", R.drawable.menkaure));
        pharaohsList.add(new Exhibit("Shepseskaf", R.drawable.shepseskaf));
        pharaohsList.add(new Exhibit("Userkaf", R.drawable.userkaf));
        pharaohsList.add(new Exhibit("Sahure", R.drawable.sahure));
        pharaohsList.add(new Exhibit("Neferirkare", R.drawable.neferirkare));

        ExhibitsAdapter pharaohsAdapter = new ExhibitsAdapter(this, pharaohsList);
        GridView pharaohsGridview = findViewById(R.id.pharaohs_grid_view);
        pharaohsGridview.setNumColumns(2);
        pharaohsGridview.setAdapter(pharaohsAdapter);
    }
}

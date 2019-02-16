package com.wolf.android.museumexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class ExhibitsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exhibits);
    }

    public void goToPharaohExhibit(View view) {
        Intent intent = new Intent(this, PharaohExhibitActivity.class);
        startActivity(intent);
    }
}

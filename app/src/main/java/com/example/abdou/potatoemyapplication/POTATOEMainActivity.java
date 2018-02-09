package com.example.abdou.potatoemyapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class POTATOEMainActivity extends AppCompatActivity {

    CheckBox checkbox;
    ImageView image;
    String bodypart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_potatoemain);
    }

    public void checkClicked(View v) {
        Log.d("potato", "checkClicked: ");
        checkbox = (CheckBox) v;
        bodypart = checkbox.getText().toString();


        if (bodypart.contentEquals("Arms")) {
            image = findViewById(R.id.arms);
        }
        else if (bodypart.contentEquals("Ears")) {
            image = findViewById(R.id.ears);
        }
        else if (bodypart.contentEquals("Eyebrows")) {
            image = findViewById(R.id.eyebrows);
        }
        else if (bodypart.contentEquals("Eyes")) {
            image = findViewById(R.id.eyes);
        }
        else if (bodypart.contentEquals("Glasses")) {
            image = findViewById(R.id.glasses);
        }
        else if (bodypart.contentEquals("Hat")) {
            image = findViewById(R.id.hat);
        }
        else if (bodypart.contentEquals("Mouth")) {
            image = findViewById(R.id.mouth);
        }
        else if (bodypart.contentEquals("Mustache")) {
            image = findViewById(R.id.mustache);
        }
        else if (bodypart.contentEquals("Nose")) {
            image = findViewById(R.id.nose);
        }
        else if (bodypart.contentEquals("Shoes")) {
            image = findViewById(R.id.shoes);
        }



        if (checkbox.isChecked()) {
            image.setVisibility(View.VISIBLE);
        }
        else {
            image.setVisibility(View.INVISIBLE);
        }
    }

}

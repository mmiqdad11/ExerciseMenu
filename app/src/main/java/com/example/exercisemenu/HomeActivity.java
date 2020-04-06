package com.example.exercisemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    Button bLingkaran;
    Button bPersegi;
    Button bPersegiPanjang;
    Button bSegitiga;
    Button bTrapesium;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

    }
}

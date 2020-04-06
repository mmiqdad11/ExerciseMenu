package com.example.exercisemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button bsign;
    EditText edNama;
    EditText edPass;
    String pw;
    String usnm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.edNama = (EditText) findViewById(R.id.editUN);
        this.edPass = (EditText) findViewById(R.id.editPass);
        Button button = (Button) findViewById(R.id.btnok);
        this.bsign = button;
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MainActivity mainActivity = MainActivity.this;
                mainActivity.usnm = mainActivity.edNama.getText().toString();
                MainActivity mainActivity2 = MainActivity.this;
                mainActivity2.pw = mainActivity2.edPass.getText().toString();
                if (!MainActivity.this.usnm.equals("admin") || !MainActivity.this.pw.equals("123")) {
                    Toast.makeText(MainActivity.this.getApplicationContext(), "Password Salah", Toast.LENGTH_LONG).show();
                    return;
                }
                MainActivity.this.startActivity(new Intent(MainActivity.this.getApplicationContext(), HomeActivity.class));
            }
        });
    }
}

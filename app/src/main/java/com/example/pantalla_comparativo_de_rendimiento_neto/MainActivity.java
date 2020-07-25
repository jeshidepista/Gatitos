package com.example.pantalla_comparativo_de_rendimiento_neto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btm = findViewById(R.id.botom);
        btm.setOnClickListener(this);

        ImageButton imb = findViewById(R.id.imageButton);
        imb.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }
}
package com.example.eva2_exa_restaurante;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnCapturar, btnMostrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCapturar = findViewById(R.id.btnCapturar);
        btnCapturar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ClaseCapturar.class);
                startActivity(i);
            }
        });

        btnMostrar = findViewById(R.id.btnMostrar);
        btnMostrar.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Restaurante.class);
                startActivity(i);
            }
        });
    }
}

package com.example.eva2_exa_restaurante;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onCapturar (View v){
        Intent Capturar = new Intent(this, Capturar.class);
        startActivity(Capturar);
    }

    public void onMostrar (View v){
        Intent Mostrar = new Intent(this, Mostrar.class);
        startActivity(Mostrar);
    }

    public void onSalir (View v){
        Intent Mostrar = new Intent(this, Mostrar.class);
        finish();
    }
}

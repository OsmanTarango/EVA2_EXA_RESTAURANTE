package com.example.eva2_exa_restaurante;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Evaluacion extends AppCompatActivity {

    TextView txtVwNombRes, txtVwDescRes, txtVwDirTelRes;
    Button btn1Star, btn2Star, btn3Star, btnVolver;
    Intent califa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evaluacion);
        txtVwNombRes = findViewById(R.id.txtVwNombRes);
        txtVwDescRes = findViewById(R.id.txtVwDescRes);
        txtVwDirTelRes = findViewById(R.id.txtVwDirTelRes);
        btn1Star = findViewById(R.id.btn1Star);
        btn2Star = findViewById(R.id.btn2Star);
        btn3Star = findViewById(R.id.btn3Star);
        btnVolver = findViewById(R.id.btnVolver);

        Intent inDatos = getIntent();
        String nomb = inDatos.getStringExtra("Nomb");
        String desc = inDatos.getStringExtra("Desc");
        String dirtel = inDatos.getStringExtra("DirTel");
        txtVwNombRes.setText(nomb);
        txtVwDescRes.setText(desc);
        txtVwDirTelRes.setText(dirtel);

        califa = new Intent();

        btn1Star.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                califa.putExtra("Star", "1");
                setResult(Activity.RESULT_OK, califa);
                finish();
            }
        });
        btn2Star.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                califa.putExtra("Star", "2");
                setResult(Activity.RESULT_OK, califa);
                finish();
            }
        });
        btn3Star.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                califa.putExtra("Star", "3");
                setResult(Activity.RESULT_OK, califa);
                finish();
            }
        });

        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setResult(Activity.RESULT_CANCELED);
                finish();
            }
        });

    }
}

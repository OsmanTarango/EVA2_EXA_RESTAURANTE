package com.example.eva2_exa_restaurante;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class ClaseCapturar extends AppCompatActivity {
    EditText nom = findViewById(R.id.etNombre),
             desc = findViewById(R.id.etDescripcion),
             dir = findViewById(R.id.etDireccion);
    String nombre, descripcion, direccion;
    int imagen;
    ImageView img;
    Intent intSelImg;
    final int im = 2;
    Restaurantes xd = new Restaurantes(imagen,nombre, descripcion, direccion);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clase_capturar);
        img = findViewById(R.id.imageView);
        intSelImg = new Intent(this, ClaseSelImg.class);


    }

    public void onClick(View v){
        startActivityForResult(intSelImg, im);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == Activity.RESULT_OK){
            img.setImageResource(data.getIntExtra("image", 0));
            imagen = data.getIntExtra("image", 0);
            Toast.makeText(this,"Se armó",Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(this,"No lo c",Toast.LENGTH_LONG).show();
        }
    }

    public void guardar(View v){
        nombre = nom.getText().toString();
        descripcion = desc.getText().toString();
        direccion = dir.getText().toString();
        xd.setImagen(imagen);
        xd.setNombre(nombre);
        xd.setDescripcion(descripcion);
        xd.setDireccion(direccion);

    }
}

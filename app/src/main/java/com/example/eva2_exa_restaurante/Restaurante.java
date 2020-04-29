package com.example.eva2_exa_restaurante;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Restaurante extends AppCompatActivity {
    Intent inDatos;
    TextView txtVwTitulo;
    ListView lstVwRest;

/*    GetRestaurant[] rests = {
            new GetRestaurant("Restaurant a", "Descripcion a", "Dir y Tel a", R.drawable.rest),
            new GetRestaurant("Restaurant b", "Descripcion b", "Dir y Tel b", R.drawable.rest),
    };*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurante);
        txtVwTitulo = findViewById(R.id.txtVwTitulo);
        lstVwRest = findViewById(R.id.lstVwRest);
        RestaurantAdapter ra = new RestaurantAdapter(this, R.layout.rest_layout, GetRestaurant.rests );
        lstVwRest.setAdapter(ra);
        lstVwRest.setOnItemClickListener(new ListView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                inDatos = new Intent(getApplicationContext(), Evaluacion.class);
                inDatos.putExtra("Nomb", GetRestaurant.rests[position].getNomb());
                inDatos.putExtra("Desc", GetRestaurant.rests[position].getDesc());
                inDatos.putExtra("DirTel", GetRestaurant.rests[position].getDirTel());
                startActivityForResult(inDatos, 1);

            }
        });

                int imagen = getIntent().getIntExtra("imagen", 0);
                String nombre = getIntent().getStringExtra("nombre"),
                descripcion = getIntent().getStringExtra("descripcion"),
                direccion = getIntent().getStringExtra("direccion");
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(resultCode == Activity.RESULT_OK) {
            switch (data.getStringExtra("Star")) {
                case "1":

                    Toast.makeText(this, "1 Estrella", Toast.LENGTH_SHORT).show();
                    break;
                case "2":
                    Toast.makeText(this, "2 Estrellas", Toast.LENGTH_SHORT).show();
                    break;
                case "3":
                    Toast.makeText(this, "3 Estrellas", Toast.LENGTH_SHORT).show();
                    break;

            }} else {
            Toast.makeText(this, "Cancelado", Toast.LENGTH_SHORT).show();
        }
    }

}
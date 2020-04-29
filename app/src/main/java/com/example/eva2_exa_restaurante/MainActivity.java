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

public class MainActivity extends AppCompatActivity {
    Intent inDatos;
    TextView txtVwTitulo;
    ListView lstVwRest;
    Restaurant[] rests = {
            new Restaurant("Restaurant a", "Descripcion a", "Dir y Tel a", R.drawable.rest),
            new Restaurant("Restaurant b", "Descripcion b", "Dir y Tel b", R.drawable.rest),
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtVwTitulo = findViewById(R.id.txtVwTitulo);
        lstVwRest = findViewById(R.id.lstVwRest);
        lstVwRest.setAdapter(new RestaurantAdapter(this, R.layout.rest_layout, rests));
        lstVwRest.setOnItemClickListener(new ListView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                inDatos = new Intent(getApplicationContext(), Evaluacion.class);
                inDatos.putExtra("Nomb", rests[position].getNomb());
                inDatos.putExtra("Desc", rests[position].getDesc());
                inDatos.putExtra("DirTel", rests[position].getDirTel());
                startActivityForResult(inDatos, 1);
            }
        });


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

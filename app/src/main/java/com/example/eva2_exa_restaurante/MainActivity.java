package com.example.eva2_exa_restaurante;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;
import com.example.*;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView txtVwTitulo;
    ListView lstVwRest;
    Restaurant[] rests = {
            new Restaurant("a", "a", "a", R.drawable.rest),
            new Restaurant("b", "b", "b", R.drawable.rest),
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtVwTitulo=findViewById(R.id.txtVwTitulo);
        lstVwRest = findViewById(R.id.lstVwRest);
        lstVwRest.setAdapter(new RestaurantAdapter(this, R.layout.rest_layout, rests));
    }


}

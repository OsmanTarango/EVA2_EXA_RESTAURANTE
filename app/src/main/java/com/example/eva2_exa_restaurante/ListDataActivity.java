package com.example.eva2_exa_restaurante;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;

public class ListDataActivity extends AppCompatActivity {
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_data);

        imageView = findViewById(R.id.imageView);
        Intent intent = getIntent();
        int receivedImage = intent.getIntExtra("image",0);

        imageView.setImageResource(receivedImage);
        //enable back Button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);

    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}

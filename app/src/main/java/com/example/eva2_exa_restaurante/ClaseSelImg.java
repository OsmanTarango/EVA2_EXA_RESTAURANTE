package com.example.eva2_exa_restaurante;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;

public class ClaseSelImg extends AppCompatActivity{
    ListView listView;

    int[] imagenes = {R.drawable.img,
                         R.drawable.img2,
                         R.drawable.img3,
                         R.drawable.img4,
                         R.drawable.img5,
                         R.drawable.img6,
                         R.drawable.img7,
                         R.drawable.img8,
                         R.drawable.img9,
                         R.drawable.img10,};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clase_sel_img);
        //finding listview
        listView = findViewById(R.id.listview);

        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getApplicationContext(), ListDataActivity.class);
                intent.putExtra("image",imagenes[i]);
                setResult(Activity.RESULT_OK, intent);
                finish();

            }
        });
    }
    private class CustomAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return imagenes.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            View view1 = getLayoutInflater().inflate(R.layout.row_data,null);
            //getting view in row_data
            ImageView image = view1.findViewById(R.id.images);
            image.setImageResource(imagenes[i]);
            return view1;



        }
    }

}

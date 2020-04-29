package com.example.eva2_exa_restaurante;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.w3c.dom.Text;

public class RestaurantAdapter extends ArrayAdapter <GetRestaurant> {
    GetRestaurant [] objects;
    Context context;
    int resource;


    public RestaurantAdapter(@NonNull Context context, int resource, @NonNull GetRestaurant[] objects) {
        super(context, resource, objects);
        this.objects= objects;
        this.resource = resource;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView == null) {

            convertView = ((Activity) context).getLayoutInflater().inflate(resource, parent, false);
        }

        ImageView imgVwIcon;
        TextView txtVwNomb, txtVwDesc, txtVwDirTel, txtVwEstrellas;

        imgVwIcon= convertView.findViewById(R.id.imgVwIcon);
        txtVwNomb= convertView.findViewById(R.id.txtVwNomb);
        txtVwDesc= convertView.findViewById(R.id.txtVwDesc);
        txtVwDirTel= convertView.findViewById(R.id.txtVwDirTel);
        txtVwEstrellas = convertView.findViewById(R.id.txtVwEstrellas);

        imgVwIcon.setImageResource(objects[position].getIcon());
        txtVwNomb.setText(objects[position].getNomb());
        txtVwDesc.setText(objects[position].getDesc());
        txtVwDirTel.setText(objects[position].getDirTel());



        return convertView;


    }

    public void actualizar(GetRestaurant [] rest) {
        this.objects = rest;
        this.notifyDataSetChanged();
    }

}

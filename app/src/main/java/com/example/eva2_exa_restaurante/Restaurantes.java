package com.example.eva2_exa_restaurante;

public class Restaurantes {
    public int imagen;
    public String nombre;
    public String descripcion;
    public String direccion;

//static Restaurantes[] array;

    public Restaurantes(int imagen, String nombre, String descripcion, String direccion) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.direccion = direccion;
        //Restaurantes[] array = new Restaurantes{imagen, nombre, descripcion, direccion};
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
/**
    public void llenarArray(int imagen, String nombre, String descripcion, String direccion){
        array = new Restaurantes{imagen, nombre, descripcion, direccion};
    }**/
}

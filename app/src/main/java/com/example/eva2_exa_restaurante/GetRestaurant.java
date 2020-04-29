package com.example.eva2_exa_restaurante;

public class GetRestaurant {

    private String nomb, desc, dirTel;
    private int icon;


    public GetRestaurant(String nomb, String desc, String dirTel, int icon) {
        this.nomb = nomb;
        this.desc = desc;
        this.dirTel = dirTel;
        this.icon = icon;
    }


    public String getNomb() {
        return nomb;
    }

    public String getDesc() {
        return desc;
    }

    public String getDirTel() {
        return dirTel;
    }

    public int getIcon() {
        return icon;
    }


}
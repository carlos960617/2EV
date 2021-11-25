package com.company.viernes_26.floristeria;

public class Envio {

    private String direccion;
    private int distancia;
    private double costeKm;


    public void setDireccion(String d){
        direccion = d;
    }

    public void setDistancia(int km){
        distancia = km;
    }

    public void setCosteKm(){
        costeKm = distancia * 0.1;
        //cada km cuesta 10 centimos
    }

}

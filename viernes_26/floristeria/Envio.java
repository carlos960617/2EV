package com.company.viernes_26.floristeria;

import java.util.Scanner;

public class Envio {

    Scanner sc = new Scanner(System.in);

    private String direccion;
    private int distancia;
    private double costeKm;


    public void setDireccion() {
        direccion = sc.nextLine();
    }

    public String getDireccion(){
        return direccion;
    }

    public void setDistancia(int km){
        distancia = km;
    }

    public void setCosteKm(){
        costeKm = distancia * 0.1;
        //cada km cuesta 10 centimos
    }

    public double getCosteKm(){
        return costeKm;
    }


}

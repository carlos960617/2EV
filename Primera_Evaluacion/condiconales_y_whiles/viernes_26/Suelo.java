package com.company.Primera_Evaluacion.condiconales_y_whiles.viernes_26;

public class Suelo {
    private double ancho;
    private double largo;

    public Suelo(double anchoC, double largoC){
        if(anchoC<0){
            anchoC = 0;
        }
        if(largoC<0){
            largoC= 0;
        }
        ancho = anchoC;
        largo = largoC;
    }

    public double getArea(){
        return ancho * largo;
    }


}

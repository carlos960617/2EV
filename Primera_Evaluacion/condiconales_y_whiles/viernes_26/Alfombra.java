package com.company.Primera_Evaluacion.condiconales_y_whiles.viernes_26;

public class Alfombra {
    private double coste;

    public Alfombra(double costeC){
        if(costeC<0){
            costeC = 0;
        }
        coste = costeC;
    }

    public double getCoste(){
        return coste;
    }

}

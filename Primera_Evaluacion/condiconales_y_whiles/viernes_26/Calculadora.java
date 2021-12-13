package com.company.Primera_Evaluacion.condiconales_y_whiles.viernes_26;

public class Calculadora {
    private Suelo suelo1;
    private Alfombra alfombra1;

    public Calculadora(Suelo s1, Alfombra a1){
        suelo1 = s1;
        alfombra1 = a1;
    }

    public double getCosteTotal(){
        return suelo1.getArea() * alfombra1.getCoste();
    }
}

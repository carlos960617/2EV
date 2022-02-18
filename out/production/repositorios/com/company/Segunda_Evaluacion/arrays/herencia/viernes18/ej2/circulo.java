package com.company.Segunda_Evaluacion.arrays.herencia.viernes18;

public class circulo {

    public double radio;

    public circulo(double radio){
        if(radio < 0){
            this.radio = 0;
        }else{this.radio = radio;}

    }

    public double getRadio(){
        return radio;
    }

    public double getArea(){
        return radio * radio * Math.PI;
    }
}

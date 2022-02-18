package com.company.Segunda_Evaluacion.arrays.herencia.viernes18;

public class vehiculo {

    public String matricula;
    public int maxSpeed;
    public double antiguedad;
    public String color;
    public double peso;
    public int velocidadActual;


    public vehiculo(String matricula, int maxSpeed, double antiguedad, String color, double peso, int velocidadActual){
        this.matricula = matricula;
        this.maxSpeed = maxSpeed;
        this.antiguedad = antiguedad;
        this.color = color;
        this.peso = peso;
        this.velocidadActual = velocidadActual;

    }

    public void masSpeed(int a, int t){
        velocidadActual = a/t;
    }

    public void setColor (String color){
        this.color = color;
    }

    public int getmaxSpeed(){
        return maxSpeed;
    }

    public static void main(String[] args) {

    }
}

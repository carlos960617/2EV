package com.company.Primera_Evaluacion.condiconales_y_whiles.viernes_26;

public class mundoAlfombra {

    public static void main(String[] args) {

        Alfombra alfombra = new Alfombra(3.5);
        Suelo suelo = new Suelo(2.75, 4.0);
        Calculadora calculadora = new Calculadora(suelo, alfombra);
        System.out.println("total= " + calculadora.getCosteTotal());
        alfombra = new Alfombra(1.5);
        suelo = new Suelo(5.4, 4.5);
        calculadora = new Calculadora(suelo, alfombra);
        System.out.println("total= " + calculadora.getCosteTotal());

        //valores negativos

        alfombra = new Alfombra(-5.5);
        Calculadora calculadora2 = new Calculadora(suelo, alfombra);
        System.out.println("Precio de metro negativo = "+calculadora2.getCosteTotal());

        suelo = new Suelo(-4.9, -1.2);
        Calculadora calculadora3 = new Calculadora(suelo, alfombra);

        System.out.println("Valores ancho y largo negativos = "+calculadora3.getCosteTotal());



    }




}

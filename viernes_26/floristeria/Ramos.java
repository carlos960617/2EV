package com.company.viernes_26.floristeria;

import java.util.Scanner;

public class Ramos {

    Scanner sc = new Scanner(System.in);

    private String flor1;
    private String flor2;
    private String flor3;
    private String flor4;
    private String dedicatoria;
    private int cantidad;
    private boolean regalo;
    private int elaboracion;

    public int getElaboracion() {
        return elaboracion;
    }

    public void setFlor(String flor1){
        System.out.println("Elige las flores de las que quieres que se componga tu ramo. \n " +
                "Puedes elegir entre cuatro tipos diferentes: rosa, lirio, tulipan y clavel");
        flor1 = sc.nextLine();
        flor2 = sc.nextLine();
        flor3 = sc.nextLine();
        flor4 = sc.nextLine();

    }

    public void setDedicatoria(String texto){
        System.out.println("Introduce el texto que quieras que acompañe tu ramo");

        dedicatoria = sc.nextLine();
    }

    public void setCantidad(int numero){

        System.out.println("Elige de cuantas flores quieres que se componga tu ramo de 1 a 50 flores.");
        cantidad = numero;
    }

    public static void main(String[] args) {

        System.out.println("Bienvenide al sirvicio on-line de ");


    }
}

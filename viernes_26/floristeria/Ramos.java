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

    public boolean getRegalo(){
        return regalo;
    }

    public int getElaboracion() {
        return elaboracion;
    }

    public void setFlor(){
        System.out.println("Elige las flores de las que quieres que se componga tu ramo. \n " +
                "Puedes elegir entre cuatro tipos diferentes: rosa, lirio, tulipan y clavel");
        for(int i = 0; i<4; i++){
            String entrada = sc.nextLine();
            if(i==0){
                flor1 = entrada;
                System.out.println("Siguiente flor(si solo quieres un tipo en concreto repitelo):");
            } else if (i == 1) {
                flor2 = entrada;
                System.out.println("Siguiente flor(si solo quieres un tipo en concreto repitelo):");
            } else if (i==2){
                flor3 = entrada;
                System.out.println("Siguiente flor(si solo quieres un tipo en concreto repitelo):");
            }else{flor4=entrada;}

        }

    }

    public void setDedicatoria(String texto){
        //System.out.println("Introduce el texto que quieras que acompañe tu ramo");

        dedicatoria = sc.nextLine();
    }

    public void setCantidad(int numero){

        System.out.println("Elige de cuantas flores quieres que se componga tu ramo de 1 a 50 flores.");
        cantidad = numero;
    }

    public static void main(String[] args) {

        System.out.println("Bienvenide al sirvicio on-line de ");


    }

    public void esRegalo(boolean x){
        regalo = x;
    }

    public void setElaboracion(){
        if(cantidad < 5 ){
            elaboracion = 1;
        }else if(cantidad <25){
            elaboracion = 2;
        }else{elaboracion = 3;}

    }
}

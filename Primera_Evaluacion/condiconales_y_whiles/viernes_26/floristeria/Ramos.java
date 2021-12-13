package com.company.Primera_Evaluacion.condiconales_y_whiles.viernes_26.floristeria;

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
    private double precio;

    public String getDedicatoria(){
        return dedicatoria;
    }

    public void setPrecio(){
        precio = cantidad * 3;
        if(regalo){
            precio += 10;
        }
    }

    public double getPrecio(){
        return precio;
    }

    public boolean getRegalo(){
        return regalo;
    }

    public int getElaboracion() {
        return elaboracion;
    }

    public void setFlor(){
        System.out.println("Elige las flores de las que quieres que se componga tu ramo. \n" +
                "Puedes elegir entre cuatro tipos diferentes: rosa, lirio, tulipan y clavel");
        for(int i = 0; i<4; i++){
            String entrada = sc.nextLine();
            if(i==0){
                flor1 = entrada;
                System.out.println("Siguiente flor(enter si no quieres mas):");
            } else if (i == 1) {
                flor2 = entrada;
                System.out.println("Siguiente flor(enter si no quieres mas):");
            } else if (i==2){
                flor3 = entrada;
                System.out.println("Siguiente flor(enter si no quieres mas):");
            }else{flor4=entrada;}

        }

    }

    public void setDedicatoria(){

        dedicatoria =  sc.nextLine();
    }

    public void setCantidad(int numero){
        cantidad = numero;
        setElaboracion();
    }

    public int getCantidad(){
        return cantidad;
    }

    public void esRegalo(boolean x){
        regalo = x;
    }

    public void setElaboracion(){
        //dias que tarda en prepararse
        if(cantidad < 5 ){
            elaboracion = 1;
        }else if(cantidad <25){
            elaboracion = 2;
        }else{elaboracion = 3;}

    }

    public String getFlor(){
        return flor1 +" "+ flor2 +" "+ flor3 +" "+ flor4;
    }
}

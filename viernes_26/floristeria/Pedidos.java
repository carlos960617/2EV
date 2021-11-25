package com.company.viernes_26.floristeria;

import java.util.Scanner;

public class Pedidos {

    Scanner sc = new Scanner(System.in);

    private String contacto;
    private double descuento;
    private int plazoEtrega;
    double precioFinal;

    public void setPrecioFinal(Envio gastos, Ramos precio){

        precioFinal = (gastos.getCosteKm() + precio.getPrecio()) - descuento;

    }

    public double getPrecioFinal(){
        return precioFinal;
    }

    public void setDescuento(double d){
        descuento = d;
    }

    public double getDescuento(){
        return descuento;
    }

    public String getContacto() {
        return contacto;
    }

    public int getPlazoEtrega() {
        return plazoEtrega;
    }

    public void setContacto(String tlf){

        tlf = sc.nextLine();

        while(tlf.length() != 9){
            System.out.println("Lo siento el numero no es valido, compruebe que tenga 9 digitos");
            tlf = sc.nextLine();
        }

        contacto = tlf;
    }

    public void setPlazo (Ramos ramo){

        if (ramo.getElaboracion() <= 2){
            plazoEtrega =  5;
        }else{plazoEtrega =  12;}


    }
}

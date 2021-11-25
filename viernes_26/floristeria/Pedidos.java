package com.company.viernes_26.floristeria;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

public class Pedidos {

    Scanner sc = new Scanner(System.in);

    private String contacto;
    private Ramos ramo;
    private Envio envio;
    private double descuento;
    private int plazoEtrega;

    public void setContacto(String tlf){

        while(tlf.length() != 9){
            System.out.println("Por favor introduce un telefono válido.");
            tlf = sc.nextLine();
        }

        contacto = tlf;
    }

    public int setPlazo (String direccion, Ramos ramo){

        int tardanza;

        if (Objects.equals(direccion, "Comunidad Valenciana") && ramo.getElaboracion() == 2){
            tardanza =  5;
        }else{return tardanza =  12;}

        return tardanza;

    }

    public static void main(String[] args) {

        /*Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM");
        String fechaActual = formatter.format(date);
        String mesActual = fechaActual.substring(3,5);
        String diaMes = fechaActual.substring(0,2);

        System.out.println(mesActual);*/

        Scanner sc = new Scanner(System.in);
        Ramos ramo1 = new Ramos();

        System.out.println("Bienvenida a ramos a domicilio.");
        ramo1.setFlor();

        System.out.println("¿Quieres que te lo envolvamos para regalo?");
        ramo1.esRegalo(sc.nextBoolean());

        if(ramo1.getRegalo()){
            System.out.println("Introduce la dedicatoria que quieras añadir a tu regalo");
            ramo1.setDedicatoria(sc.nextLine());
        }else{
            System.out.println("No hay problema.");
        }

    }
}

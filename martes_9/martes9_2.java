package com.company;

import java.util.Scanner;

public class martes9_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.println("Introduce la distancia de tu viaje en Km:");

        int trayecto = sc.nextInt();

        System.out.println("Introduce numero de pasajeros:");

        int pasajeros = sc.nextInt();

        double precioI = 0;

        double precioG = 0;

        double add = 0;

        if (trayecto <= 200){

            precioI = 20;
            precioG = (20)*pasajeros;

        }else if(trayecto <400){

            add = trayecto - 200;

            precioI = (add*0.03)+20;

            precioG = (precioI)*pasajeros;


        }else if(trayecto > 400){

            add = trayecto - 200;

            precioI = ((add*0.03)+20)*0.85;

            precioG = (precioI)*pasajeros;

        }else{
            System.out.println("Esta distancia no es valida.");
        }

        if (pasajeros >= 3){

            precioI *= 0.90;

            precioG = (precioI)*pasajeros;
        }

        System.out.println("El precio del billete por persona es de "+precioI+ " euros  \n" +
                "el precio total es de "+precioG+ " euros.");

    }


}

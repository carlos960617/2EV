package com.company;

import java.util.Scanner;

public class BuenosDias {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una hora valida");

        int hora= sc.nextInt();

        if(hora >= 6 && hora <=13){
            System.out.println("¡Buenas días!");
        }else if (hora >= 14 && hora <=20){
            System.out.println("¡Buenas tardes!");
        }else if (hora >=21 && hora <=24){
            System.out.println("¡Buenas noches!");
        }else if (hora >=1 && hora <=5){
            System.out.println("¡Que tarde! A dormir ahora mismo...");
        }else{
            System.out.println("Esta hora no existe");
        }

    }
}

package com.company;

import java.util.Scanner;

public class EjemplosCondicionales {

    public static void main(String[] args) {


        Scanner sc = new Scanner (System.in);

        System.out.println("Introduce la nota a evaluar:");

        int nota = sc.nextInt();

        if(nota >= 5){
            System.out.println("¡Enhorabuena, has aprobado!");
        }else{
            System.out.println("Oh no, estas fuera...");
        }

        System.out.println("¡Hasta luego!");

    }

}

package com.company;

import java.util.Scanner;

public class T4_2$7tablaSimbolos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el ancho de la tabla:");

        int ancho = sc.nextInt();

        System.out.println("Introduce el alto de la tabla:");

        int alto = sc.nextInt();

        int j;

        for(int i=0; i<alto; i++){
            for(j=0; j<ancho; j++){
                System.out.print("*");

            }
            System.out.println("");

        }
    }
}

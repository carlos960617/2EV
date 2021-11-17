package com.company.T4_1;

import java.util.Scanner;

public class T4_AlquilaCoches {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int edad = sc.nextInt();
        int credito = sc.nextInt();


        if (edad >= 21 && credito >= 10000){

            System.out.println("Eres apto para alquilar un coche");
        }

        /*if (edad >= 18 && credito >= 10000){

            System.out.println("Eres apto para alquilar un coche");
        }*/

        /*Una persona con 25 años y 10000 puede alquilar un coche
	    Una persona con 21 años y 9000 euros no puede alquilar el coche

	    Si sustituimos el && por el || ambas personas pueden alquilar un
	    coche porque con que se cumpla una de las condiciones es suficiente,
	    en el primer caso se cumple la condicion del dinero y en el segundo
	    la de la edad

         */
    }
}

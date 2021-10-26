package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class T4_2$Sueldos2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer sueldo:");
        int sueldo= sc.nextInt();
        System.out.println("El sueldo maximo es "+sueldo+" y el sueldo minimo es "+sueldo+".");
        int sueldomax = 1;
        int sueldomin = 0;

        while (sueldo != 0){

            System.out.println("Introduce el siguiente sueldo:");
            if ((sueldo = sc.nextInt())== 0){

                System.out.println("Se acabó");

            }else{
                if (sueldo > sueldomax) {
                    sueldomax = sueldo;
                    sueldomin = sueldo;
                    System.out.println("El sueldo maximo es " + sueldomax + " ");

                } else if (sueldo < sueldomax && sueldo < sueldomin) {
                    sueldomin = sueldo;
                    System.out.println("El sueldo maximo es " + sueldomax + " y el sueldo minimo es " + sueldomin + ".");
                }




            }






        }

    }

}

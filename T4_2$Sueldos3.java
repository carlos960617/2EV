package com.company;

import java.util.Scanner;

public class T4_2$Sueldos3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer sueldo:");

        int s1 = sc.nextInt();

        int MAX = s1;
        int MIN = s1;

        System.out.println("El sueldo maximo es "+MAX+" y el sueldo minimo es "+MIN+".");

        int s2 = 1;

        while(s2 !=0){

            System.out.println("Introduce el siguiente sueldo:");

            if ((s2 = sc.nextInt()) == 0){

                System.out.println("Se ha recibido un sueldo con valor 0");

            }else{

                if(s2 >= MAX){
                    MAX = s2;
                    System.out.println("El sueldo maximo es "+MAX+" y el sueldo minimo es "+MIN+".");
                }
                if(s2 <= MIN){
                    MIN = s2;
                    System.out.println("El sueldo maximo es "+MAX+" y el sueldo minimo es "+MIN+".");
                }

            };



        }
    }
}

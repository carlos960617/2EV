package com.company.Segunda_Evaluacion.arrays.Matrices;

import java.util.Scanner;

public class ejSlide36 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el numero de filas");
        int filas = 0;

        while(filas<2) {
            filas = sc.nextInt();
            System.out.println("El numero de filas tiene que ser dos o mas");

        }


        System.out.println("Introduce el numero de columnas");
        int columnas =0;

        for(int i=0;i<filas;i++){

            while(columnas <1){
                columnas = sc.nextInt();
                System.out.println("El numero de columnas debe ser mas de 1");
            }

        }


        int[][] matriz = new int[filas][];





    }
}

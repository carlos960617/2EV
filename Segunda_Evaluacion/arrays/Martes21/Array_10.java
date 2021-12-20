package com.company.Segunda_Evaluacion.arrays.Martes21;

import java.util.Arrays;
import java.util.Scanner;

public class Array_10 {

    static Scanner sc = new Scanner(System.in);

    public static int[] rellenaArray(int[] array){

        for(int i = 0;i<array.length;i++){
            System.out.println("Introduce el siguiente valor para tu array");
            array[i] = sc.nextInt();
        }

        return array;
    }

    public static boolean equals (int[] array1, int[] array2){

        boolean esIgual = true;

        Arrays.sort(array1);
        Arrays.sort(array2);

        if(array1.length != array2.length){
            esIgual = false;
            System.out.println("Los arrays ni siquiera tienen la misma longitud");
        }else{
            for(int i= 0; i<array1.length;i++){
                if(array1[i] != array2[i]){
                    esIgual = false;
                    System.out.println("Los arrays no contienen los mismos elementos");
                }
            }
        }



        return esIgual;
    }

    public static void main(String[] args) {



        System.out.println("Elige la longitud del array1");

        int longitud1 = sc.nextInt();

        System.out.println("Elige la longitud del array2");

        int longitud2 = sc.nextInt();

        int[] array1 = new int[longitud1];
        int[] array2 = new int[longitud2];

        System.out.println("Vamos a crear tu primer array");
        rellenaArray(array1);

        System.out.println("Vamos a crear tu segundo array");
        rellenaArray(array2);

        System.out.println("Comprobando si los arrays son iguales...");

        System.out.println(equals(array1, array2));


    }
}

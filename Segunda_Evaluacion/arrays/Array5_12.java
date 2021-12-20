package com.company.Segunda_Evaluacion.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array5_12 {

    static Scanner sc = new Scanner(System.in);

    public static int[] rellenaArray(int[] array){

        for(int i = 0;i<array.length;i++){
            System.out.println("Introduce el siguiente valor para tu array");
            array[i] = sc.nextInt();
        }

        return array;
    }

    public static boolean esCapicua (int[] array){

        int[] arrayInv = new int[array.length];

        boolean esCapicua = false;

        for(int i=0;i<array.length;i++){
            arrayInv[array.length-(1+i)] = array[i];
        }

        for(int i=0;i<array.length;i++){
            if(array[i] != arrayInv[i]){

                esCapicua =  false;

            }else{

                esCapicua =  true;
                }
        }

        return esCapicua;
    }

    public static void main(String[] args) {

        System.out.println("Longitud del array");

        int[] array = new int[sc.nextInt()];

        System.out.println("Rellena tu array");

        rellenaArray(array);

        System.out.println("Comprobando si es capicua...");
        System.out.println(esCapicua(array));
    }
}

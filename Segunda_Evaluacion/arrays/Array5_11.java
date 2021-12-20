package com.company.Segunda_Evaluacion.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array5_11 {

    static Scanner sc = new Scanner(System.in);

    public static int[] rellenaArray(int[] array){

        for(int i = 0;i<array.length;i++){
            System.out.println("Introduce el siguiente valor para tu array");
            array[i] = sc.nextInt();
        }

        return array;
    }
    

    
    public static void reverse(int[] array){

        int[] arrayInv = new int[array.length];

        for(int i=0;i<array.length;i++){
            arrayInv[array.length-(1+i)] = array[i];
        }

        for(int i=0;i<array.length;i++){
            array[i] = arrayInv[i];
        }
        
    }

    public static void main(String[] args) {

        System.out.println("Longitud del array");
        
        int[] array = new int[sc.nextInt()];

        System.out.println("Rellena tu array");
        
        rellenaArray(array);

        System.out.println("Invirtiendo array...");

        reverse(array);

        System.out.println(Arrays.toString(array));
    }
}

package com.company.Segunda_Evaluacion.arrays.Martes21;

import java.util.Arrays;

public class Array_9 {

    public static boolean equals (int[] array1, int[] array2){

        boolean esIgual = true;

        Arrays.sort(array1);
        Arrays.sort(array2);

        for(int i= 0; i<array1.length;i++){
            if(array1[i] != array2[i]){
                esIgual = false;
            }
        }

        return esIgual;
    }

    public static void main(String[] args) {


    }
}

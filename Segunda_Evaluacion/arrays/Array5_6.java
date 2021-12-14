package com.company.Segunda_Evaluacion.arrays;

import java.util.Scanner;

public class Array5_6 {

    static Scanner sc = new Scanner(System.in);

    public static int[] rellenaArrays(int[] array){


        for(int i=0;i<array.length;i++){
            System.out.println("Introduce un numero para completar tu array");
            array[i] = sc.nextInt();
        }

        return array;

    }

    public static int[] sumaArray(int[] array1, int[] array2){
        int[] array3 = new int[array1.length];
        for(int i=0;i<array1.length;i++){
            array3[i]= array1[i] + array2[i];
        }

        return array3;

    }

    public static void main(String[] args) {


        System.out.println("Elige el tamaño de tus arrays");

        // declarar un array con valores por defecto int[] array = {5,4,7,2,9,4,2,1}

        int tam= sc.nextInt();

        int[] a1 = new int[tam];

        int[] a2 = new int[tam];

        System.out.println("Vamos a rellenar el primer array");

        rellenaArrays(a1);

        System.out.println("Vamos a rellenar el segundo array");

        rellenaArrays(a2);

        int[] a3 = sumaArray(a1, a2);

        for(int i = 0;i<tam;i++){

            System.out.println(a3[i]);

        }

    }
}

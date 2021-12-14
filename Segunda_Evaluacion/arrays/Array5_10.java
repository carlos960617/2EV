package com.company.Segunda_Evaluacion.arrays;

import java.util.Scanner;

public class Array5_10 {

    static Scanner sc = new Scanner(System.in);

    public static int[] rellenaArrays(int[] array){


        for(int i=0;i<array.length;i++){
            System.out.println("Introduce un numero para completar tu array");
            array[i] = sc.nextInt();
        }

        return array;

        }

    public static int[] ordenaArray(int[] array){

        int[] arrayOrdenado = new int[array.length];

        int contador=0;

        for(int i = 0;i<array.length;i++){
            if(array[i]%2 == 0){
                arrayOrdenado[contador]=array[i];
                contador++;
            }
        }
        //System.out.println("Contador= "+contador);

        for(int i = 0;i<array.length;i++){
            if(array[i]%2 != 0){
                arrayOrdenado[contador]=array[i];
                contador++;
            }
        }

        return arrayOrdenado;
    }

    public static void imprimirArray(int[] tabla){

        for(int i=0;i<tabla.length;i++){
            System.out.print(tabla[i]+" ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Define el tamaño de tu array");

        int tam = sc.nextInt();
        int[] array = new int[tam];

        array = rellenaArrays(array);

        int[] arrayOrdenado = ordenaArray(array);

        imprimirArray(arrayOrdenado);





    }
}

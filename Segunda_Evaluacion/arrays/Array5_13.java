package com.company.Segunda_Evaluacion.arrays;

import java.util.Scanner;

public class Array5_13 {
    static Scanner sc = new Scanner(System.in);

    public static int[] rellenaArray(int[] array){

        for(int i = 0;i<array.length;i++){
            System.out.println("Introduce el siguiente valor para tu array");
            array[i] = sc.nextInt();
        }

        return array;
    }


    public static int[] ocurrencias(int[] array){

        int[] ocurrencia= new int[array.length];

        for(int i = 0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
                if(array[j] == array[i]){
                    ocurrencia[i] ++;
                }

            }
        }

        return ocurrencia;


    }

    //Ya funciona pero sale informacion repetida, a ver como controlas eso.

    public static void muestraOcurrencias(int[] arrayOc, int[] array){


        int filtro = 0;
        for(int i = 0;i<array.length;i++){
            if(arrayOc[i] > 1){
                System.out.println("El numero "+array[i]+" se repite "+arrayOc[i]+" veces");
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("Decide la longitud de array");

        int[] array = new int[sc.nextInt()];

        System.out.println("Rellena tu array");

        rellenaArray(array);

        System.out.println("Muy bien, estamos comprobando el numero de ocurrencias");

        System.out.println("Aqui esta lo que buscabas ¿¡CONTENTE!?");

        muestraOcurrencias(ocurrencias(array), array);

    }
}

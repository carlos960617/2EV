package com.company.Segunda_Evaluacion.arrays;

import java.util.Scanner;

public class Array5_7 {

    static Scanner sc = new Scanner(System.in);

    public static double[] rellenaArrays(double[] array){


        for(int i=0;i<array.length;i++){
            array[i] = sc.nextInt();
        }

        return array;

    }

    public static double calculaMedia(double[] array){

        double media = 0.0;
        double suma = 0.0;
        for(int i=0; i<array.length;i++){
            suma += array[i];
        }

        media = suma/(array.length);

        return media;
    }

    public static double[] notasSuperiores(double[] array, double media){
        int contador = 0;
        for(int i=0;i<array.length;i++){
            if(array[i] > media){
                contador ++;
            }
        }
        //System.out.println("Valor del contador= "+ contador);

        double[] array2 = new double[contador];
        int contador2 = 0;
        for(int i=0;i<array.length;i++){
            if(array[i] > media){
                array2[contador2] = array[i];
                contador2++;
            }
        }

        return array2;
    }

    public static void muestraArray(double[] array){

        for(int i= 0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el numero de alumnos de la clase");

        int tam = sc.nextInt();

        double[] notas = new double[tam];

        System.out.println("Introduce las notas de tus alumnos");

        double[] notasRellenas = rellenaArrays(notas);

        muestraArray(notasRellenas);

        System.out.println("\nEsta es la media de las notas");

        double media = calculaMedia(notasRellenas);

        System.out.println(media);

        double[] notasAltas = notasSuperiores(notasRellenas, media);

        System.out.println("\nEstas son las notas superiores a la media");

        muestraArray(notasAltas);

        System.out.println();
    }
}

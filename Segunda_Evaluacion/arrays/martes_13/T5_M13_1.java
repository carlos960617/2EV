package com.company.Segunda_Evaluacion.arrays.martes_13;

import java.util.Scanner;

public class T5_M13_1 {

    static Scanner sc = new Scanner(System.in);


    public static void mostrarTabla(int[] tabla){

        for(int i=0;i<tabla.length;i++){
            if(i%2 == 0 && i != 0){
                System.out.print(tabla[i]+"-");
            }else if(i == tabla.length-1) {
                System.out.print(tabla[i]+"}");
            }else if(i == 0){
                System.out.print("{"+tabla[i]+"-");
            }else{System.out.print(tabla[i]+", ");}

        }
    }

    public static int[] combinator(int[] tabla1, int[] tabla2){
        int[] tabla3 = new int[tabla1.length + tabla2.length];

        int indice1 = 0;
        int indice2 = 0;

        for(int i=0; i<tabla3.length;i++){
            if(i%2 == 0){
                tabla3[i] = tabla1[indice1];
                indice1++;
            }else{
                tabla3[i] = tabla2[indice2];
                indice2 ++;}
        }

        return tabla3;
    }

    /* Version del metodo COMBINATOR pero utilizando el hecho de que el inidice del primer array
    siempre se coloca de 2 en dos (2x) y el de array 2 de dos en dos +1 (2x+1)
    array[2x] = array1[i];
    array3[(2x)+1] = array2[i];
     */

    public static int[] leerTabla(int tam){
        int[] tabla = new int[tam];

        for(int i = 0;i<tam;i++){
            System.out.println("Intrdouce el valor para tu tabla en índice "+i+" :");
            tabla[i]=sc.nextInt();
        }
        return tabla;
    }

    public static void main(String[] args) {

        int tam=10;

        System.out.println("Vamos a crear la primera tabla:");
        int[] tabla1 = leerTabla(tam);

        System.out.println("Muy bien, ahora la segunda:");

        int[] tabla2 = leerTabla(tam);

        System.out.println("Combinando...");

        int[] tablaCombinada = combinator(tabla1, tabla2);

        System.out.println("Este es el resultado de tus tablas combinadas:");

        mostrarTabla(tablaCombinada);



    }


}

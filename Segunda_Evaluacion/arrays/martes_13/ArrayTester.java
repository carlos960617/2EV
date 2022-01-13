package com.company.Segunda_Evaluacion.arrays.martes_13;

import java.util.Scanner;

public class ArrayTester {

    static Scanner sc = new Scanner(System.in);

    public static int[] transformarArray(int[] tabla){

        int[] soloPares = new int[tabla.length];

        for(int i=0;i<tabla.length;i++){
            if(tabla[i]%2 == 0){
                soloPares[i]= tabla[i];
            }else{soloPares[i] = -1;}
        }


        return soloPares;
    }

    public static void imprimirArray(int[] tabla){

        for(int i=0;i<tabla.length;i++){
            System.out.print(tabla[i]+" ");
        }
    }

    public static int[] leerEnteros(int tam){
        int[] tabla = new int[tam];

        for(int i = 0;i<tam;i++){
            System.out.println("Intrdouce el valor para tu tabla en índice "+i+" :");
            tabla[i]=sc.nextInt();
        }
        return tabla;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("¿De que longitud quieres tu array?");

        int tam = sc.nextInt();

        int[] tabla1 = new int[tam];

        System.out.println("Vamos a crear la tabla:");

        tabla1 = leerEnteros(tam);

        System.out.println("Esta es tu tabla:");

        imprimirArray(tabla1);

        System.out.println("\nEsta es tu tabla filtrando los impares:");

        int[] tablaFiltrada = transformarArray(tabla1);

        imprimirArray(tablaFiltrada);
    }
}

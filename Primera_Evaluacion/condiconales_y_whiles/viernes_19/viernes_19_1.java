package com.company.Primera_Evaluacion.condiconales_y_whiles.viernes_19;

import java.util.Scanner;

public class viernes_19_1 {

    public static boolean esImpar(int numero){

        return numero > 0 && numero%2!= 0;
    }

    public static int sumarImpares(int inicio, int fin){

        int suma = 0;

        if(inicio > 0 && fin >= inicio){

            for(int i=inicio; i<=fin;i++){
                if(esImpar(i)){
                    suma += i;
                }
            }

        }else{suma = -1;}

        return suma;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce dos numeros para averiguar el sumatorio de los primos comprendidos entre estos (ambos incluidos)");

        int init = sc.nextInt();

        int end = sc.nextInt();

        int result = sumarImpares(init, end);

        System.out.println("El resultado es: "+result);



    }
}

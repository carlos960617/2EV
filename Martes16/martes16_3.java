package com.company;

import java.util.Scanner;

public class martes16_3 {

    public static void sumaImpares (int n){

        /*Lo tenías mal porque habías calculado sumatorio de los impares entre 0 y n
        cuando habia que calcular los primeros n impares
        LEE BIEN LOS ENUNCIADOS CARIÑO
         */

        int sum = 0;

        int impar = 0;

        for(int i =0;impar<n;i++){
            if(i%2!=0){
                sum += i;
                impar++;
            }
        }

        System.out.println("La suma de los "+n+" primeros numeros impares es = "+sum+".");
    }

    public static void main(String[] args) {

        System.out.println("Introduce el sumatorio de cuantos impares quieres que calculemos:");

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        sumaImpares(n);

    }
}

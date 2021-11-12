package com.company;

import java.util.Scanner;

public class martes16_3 {

    public static void sumaImpares (int n){

        int impar = 0;

        for(int i =0;i<=n;i++){
            if(i%2!=0){
                impar += i;
            }
        }

        System.out.println("La suma de los "+n+" primeros numeros impares es = "+impar+".");
    }

    public static void main(String[] args) {

        System.out.println("Introduce el sumatorio de cuantos impares quieres que calculemos:");

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        sumaImpares(n);

    }
}

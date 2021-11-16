package com.company;

import java.util.Scanner;

public class martes16_2 {

    public static void primos(int n){

        //Hay que añadir un contador para saber cuantos primos hay, no solo imprimri el valor de los primos.

        System.out.print("Estos son los numeros primos entre 1 y "+n+": 2");

        int count=1;

        boolean esPrimo = true;

        for(int i=3;i<=n;i++){

            esPrimo = true;
            for(int j=2; j<i;j++){
                if(i%j == 0){

                    esPrimo = false;
                }

            }

            if (esPrimo){
                System.out.print(", "+i);
                count++;
            }
        }

        System.out.println("\nLa cantidad de primos es: "+count+".");

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número para averiguar cuantos primos hay entre este y el 1:");

        int tope = sc.nextInt();

        primos(tope);
    }


}

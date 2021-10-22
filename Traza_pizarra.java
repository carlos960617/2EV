package com.company;

public class Traza_pizarra {

    public static void main(String[] args) {

        int i=0;
        int n=4;
        int sum=0;

        while(i<=n){

            sum=sum+i;
            System.out.println("Sum="+sum+".");
            i=i+1;
            System.out.println("I = "+i+".");

        }

        System.out.println("El resultado es "+sum+".");

        /*
        i=0
        i=1
        sum=1

        --FIN DE PRIMERA INTERACION--

        i=2
        sum=3

        --FIN SEGUNDA ITERACION--

         */


    }
}
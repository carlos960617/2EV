package com.company;

import java.util.Scanner;

public class viernes12_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer número de la serie:");

        int a = sc.nextInt();

        System.out.println("Introduce el segundo número de la serie:");

        int b = sc.nextInt();

        System.out.println("Introduce cuántos números quieres que tenga la serie:");

        int tope = sc.nextInt();

        System.out.print("Serie: "+a+", "+b+", ");

        for(int i = 0; i<tope-2;i++){

            int c = a + b;

            a=b;
            b=c;

            if(i == tope-4){
                System.out.print(c+" y ");
            }else if( i == tope-3){
                System.out.print(c+". ");
            }else{
                System.out.print(c+", ");
            }

        }
    }
}

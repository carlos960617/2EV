package com.company;

import java.util.Scanner;

public class DoWhile2 {

    public static void main(String[] args) {

        int valor;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Escribe un numero entre 1 y 10:");
            valor = sc.nextInt();
        }while(valor <= 10 && valor>=1);
        System.out.println("Has instroducido:"+valor+".");
    }

}

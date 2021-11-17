package com.company.condiconales_y_whiles;

import java.util.Scanner;

public class DoWhile1 {

    public static void main(String[] args) {
        int valor;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Escribe un entero > 100:");
            valor = sc.nextInt();
        }while(valor <= 100);
        System.out.println("Has instroducido:"+valor+".");
    }
}

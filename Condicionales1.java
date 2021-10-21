package com.company;

import java.util.Scanner;

public class Condicionales1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("¿Eres el propietario de la máquina? (Introduce \"true\" o \"false\")");

        boolean isOwner = sc.nextBoolean();

        if (isOwner){
            System.out.println("Hola, bienvenido al sistema");
        }
    }
}

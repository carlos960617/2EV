package com.company.Segunda_Evaluacion.arrays;

import java.util.Scanner;

public class Array5_9 {

    public static void compruebaDNI(String dni){

        char letra= dni.charAt(dni.length()-1);

        String numero = dni.substring(0,8);

        int numeroN = Integer.parseInt(numero);

        System.out.println(numeroN);

        int resto = numeroN%23;

        System.out.println(resto);

        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";

        char prueba = '5';

        for(int i=0;i<23;i++){
            if(i == resto){
                System.out.println(letras.charAt(i));
                prueba = letras.charAt(i);
            }
        }

        if(prueba == letra){
            System.out.println("La letra es correcta");
        }else{
            System.out.println("La letra es incorrecta");
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String DNI = sc.nextLine();

        compruebaDNI(DNI);
    }
}

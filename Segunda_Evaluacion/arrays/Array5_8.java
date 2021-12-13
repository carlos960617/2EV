package com.company.Segunda_Evaluacion.arrays;

import java.util.Scanner;

public class Array5_8 {

    public static int cuentaVocal(String cadena, char letra){

        int contador= 0;

        for(int i=0;i<cadena.length();i++){

            if(cadena.charAt(i) == letra){
                contador ++;
            }

        }

        return contador;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la cadena");

        String cadena = sc.nextLine();

        System.out.println("Introduce el caracter a contar");

        char vocal = sc.next().charAt(0);

        System.out.println(cuentaVocal(cadena, vocal));



    }
}

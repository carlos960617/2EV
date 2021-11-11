package com.company;


import java.util.Scanner;

public class viernes12_2{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una frase sin usar mayúsculas para averiguar cuantas vocales contiene:");

        String cadena = sc.nextLine();

        int longitud = cadena.length();

        int vocalContador= 0;

        int letraContador=0;

       while(letraContador<longitud){

            char test = cadena.charAt(letraContador);

            if( test == 'a' || test == 'e' || test == 'i' || test=='o' || test=='u'){
                vocalContador++;
            }

            letraContador++;
        }

        System.out.println("La cadena introducida contiene "+vocalContador+ " vocales.");


    }
}

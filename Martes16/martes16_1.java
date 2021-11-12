package com.company;

import java.util.Scanner;

public class martes16_1 {

    public static void palabras(String cadena){

        int countEspacios = 1;

        for(int i=0; i<cadena.length(); i++){ //fijate que length cuenta desde 1 y los index van desde 0, por lo que va a ver un length 7 que no se corresponde con ningun caracter y eso da error
            if(cadena.charAt(i) == ' '){
                countEspacios++;
            }
        }

        System.out.println("Tu cadena tiene "+countEspacios+" palabras");

    }

    public static void main(String[] args) { //que es eso de que el metodo tiene que ser static para poder llamarlo?

        System.out.println("Introduce una frase para averiguar cuantas palabras tiene");

        Scanner sc = new Scanner(System.in);

        String cadena = sc.nextLine();

        martes16_1.palabras(cadena);



    }
}

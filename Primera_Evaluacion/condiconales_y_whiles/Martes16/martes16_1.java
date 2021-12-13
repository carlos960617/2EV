package com.company;

import java.util.Scanner;

public class martes16_1 {

    public static int palabras(String cadena){

        /*
        Cuando en el enunciado especifica "devolver" significa que el
        metodo tiene que ser del tipo de dato que se quiere conseguir
        no puede ser un void con un print porque sino despues no se puede
        reutilizar ese valor en el resto de main*/

        int countEspacios = 1;

        for(int i=0; i<cadena.length(); i++){ //fijate que length cuenta desde 1 y los index van desde 0, por lo que va a ver un length 7 que no se corresponde con ningun caracter y eso da error
            if(cadena.charAt(i) == ' '){
                countEspacios++;
            }
        }

        return countEspacios;

    }

    public static void main(String[] args) { //que es eso de que el metodo tiene que ser static para poder llamarlo?

        System.out.println("Introduce una frase para averiguar cuantas palabras tiene");

        Scanner sc = new Scanner(System.in);

        String cadena = sc.nextLine();

        int numWords = martes16_1.palabras(cadena);

        System.out.println("Tu cadena tiene "+numWords+" palabras");

        String extract = "Me duele la barriga";

        System.out.println(extract.substring(3,8));

    }
}

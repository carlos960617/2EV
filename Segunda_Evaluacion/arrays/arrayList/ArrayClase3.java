package com.company.Segunda_Evaluacion.arrays.arrayList;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class ArrayClase3 {

    static Scanner sc = new Scanner(System.in);

    public static void cadenaMasLarga(ArrayList<String> a){

        int compare = 0;
        String max = null;

        for(String S: a){
            if(S.length() > compare){
                max = S;
                compare = S.length();
            }
        }

        System.out.println("La cadena mas larga es: "+max);
    }

    public static void leerArray(ArrayList<String> a){

        System.out.println("Introduce tu primera cadena");

        String cadena = sc.nextLine();

        while(!cadena.equalsIgnoreCase("FIN")){
            a.add(cadena);
            System.out.println("Siguient cadena. (FIN para salir)");
            cadena=sc.nextLine();
        }
    }

    public static void main(String[] args) {

        ArrayList<String> cadenas = new ArrayList<>();

        leerArray(cadenas);

        cadenaMasLarga(cadenas);
    }
}

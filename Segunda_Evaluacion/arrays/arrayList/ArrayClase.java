package com.company.Segunda_Evaluacion.arrays.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

public class ArrayClase {

    public static void tradicional(ArrayList<Integer> a){

        int aux = a.get(a.size()-1);

       for(int i=a.size()-2;i>=0;i--){
           a.set(i+1,a.get(i));
       }
        a.set(0, aux);

        System.out.println("Metodo 2="+ a);



    }

    public static void avanzaPuesto(ArrayList<Integer> a){

        a.add(0,(a.get(a.size()-1)));
        a.remove(a.size()-1);
    }

    public static void main(String[] args) {

        ArrayList<Integer> cadena = new ArrayList();

        cadena.add(15);
        cadena.add(22);
        cadena.add(4);
        cadena.add(56);
        cadena.add(71);
        cadena.add(10);

        ArrayList cadena2 = new ArrayList(cadena);


        avanzaPuesto(cadena);
        System.out.println(cadena);


        tradicional(cadena2);





    }
}

package com.company.Segunda_Evaluacion.arrays.arrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayClase2 {

    static Scanner sc = new Scanner(System.in);

    public static ArrayList<String> cargaArray(ArrayList<String> a){
        System.out.println("Introduce el primer nombre");
        String nombre = sc.nextLine();
        while( !nombre.equals("salir")){

            a.add(nombre);
            System.out.println("Introduce el siguiente nombre:");
            nombre = sc.nextLine();
        }

        return a;
    }

    public static ArrayList<String> revierteArray(ArrayList<String> a){

        ArrayList<String> invertido = new ArrayList<>(a);

        for(int i=0, j=a.size()-1;j<=0;j--, i++ ){
            invertido.add(i, a.get(j));
        }
        System.out.println("Array invertido="+invertido);

        return invertido;
    }

    public static void main(String[] args) {



        ArrayList<String> nombres = new ArrayList();

        cargaArray(nombres);

        revierteArray(nombres);


    }
}

package com.company.Segunda_Evaluacion.arrays.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayList2 {

    public static void imprimeArray (ArrayList<ArrayList<Object>> a){

        for(ArrayList x: a){
            System.out.println(x);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Object>> arrayAlumnos = new ArrayList();
        ArrayList<Object> arrayNotas;

        System.out.println("Introduce el nombre del alumno (\"salir\" para acabar)");
        String alumno = sc.nextLine();

        while(!alumno.equals("salir")){

            arrayNotas = new ArrayList();

            arrayNotas.add(alumno);
            System.out.println("Introduce la primera nota del alumno");
            int elemento = sc.nextInt();

            while(elemento >= 0 ){

                arrayNotas.add(elemento);
                System.out.println("Siguiente nota (cierra con nota negativa)");
                elemento = sc.nextInt();
                sc.nextLine();

            }

            arrayAlumnos.add(arrayNotas);

            System.out.println("Introduce el siguiente alumno");
            alumno = sc.nextLine();

        }

        imprimeArray(arrayAlumnos);

    }
}

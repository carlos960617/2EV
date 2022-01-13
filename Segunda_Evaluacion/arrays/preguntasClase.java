package com.company.Segunda_Evaluacion.arrays;

import java.util.Scanner;

public class preguntasClase {

    //¿Se puede crear un contador que reaccione a cuantas clases o variables de cierto tipo se van creando a lo largo del programa?

    /*Para iterar por distintos arrays, cogería el contador de arrays creados de la pregunta anterior, y crearia un contador
    con el valor de arrays creados sumandole uno cada vez que almacene un valor en un array, volviendo al primer array cuando sumo
    al ultimo: Añado valor a array1: contador+1 = 1 añado valor a array2: contador+1 = 2 añado valor a array3: contador+1 = 3
    ahora añado valor a array1: contador+1 = 1 (ciclico como si los numeros fuesen finitos)
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Tu primer grupo de arrays");

        int arrayAmount = sc.nextInt();
        int counter = 0;

        while(arrayAmount != -1){

            if(arrayAmount != -1 && counter<arrayAmount){

                System.out.println(counter);
                counter++;
            }else{counter=1;
                System.out.println(counter);}
        }

        System.out.println("Siguiente grupo de arrays");

        arrayAmount = sc.nextInt();




    }
}

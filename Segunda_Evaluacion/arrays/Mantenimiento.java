package com.company.Segunda_Evaluacion.arrays;

import java.util.Scanner;

public class Mantenimiento {

    static Scanner sc = new Scanner(System.in);

    public static int[] altaElemento(int[] array){
        //la nueva tabla va a tener como longitud una unidad mas que la tabla que se pase como parametro
        int[] tabla2 = new int[array.length+1];
        if(array.length != 0){
            for(int i=0;i<array.length;i++){
                tabla2[i] = array[i];
            }

        }
        System.out.println("Introduce el valor nuevo de tu tabla:");
        tabla2[array.length-1] = sc.nextInt();

        return tabla2;
    }

    public static void consultaElemento(int[] tabla){
        int i=0;
        if(tabla.length !=0){
            do{
                System.out.println("Introduce el indice del elemento a consultar");
                i=sc.nextInt();
                System.out.println("El elemento en indice "+i+ "tiene valor= "+tabla[i]);

            }while(i<0 || i>tabla.length-1);


        }else{
            System.out.println("No hay elementos que consultar");
        }
    }

    public static void main(String[] args) {

        System.out.println("Elige lo que quieras hacer\n" +
                "1. Alta elemento en la lista\n" +
                "2. Consulta de un elemento de la lista\n" +
                "3. Modificación de un elemento de la lista\n" +
                "4. Baja de un elemento de la lsita\n" +
                "5. Listado de todos los elementos de la lista\n" +
                "0. Salida.");
    }
}

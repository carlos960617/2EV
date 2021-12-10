package com.company.arrays;

import java.util.Scanner;

public class Aarray_Tabla_Enteros {

    static Scanner sc = new Scanner(System.in);

    public static int[] altaElemento(int[] array){
        //la nueva tabla va a tener como longitud una unidad mas que la tabla que se pase como parametro
        int[] tabla2 = new int[array.length+1];
        if(array.length != 0){
            for(int i=0;i<array.length-1;i++){
                tabla2[i] = array[i];
            }

        }
        System.out.println("Introduce el valor nuevo de tu tabla:");
        tabla2[array.length] = sc.nextInt();

        return tabla2;
    }

    public static void consultaElemento(int[] tabla){
        int i=0;
        if(tabla.length !=0){
            do{
                System.out.println("Introduce el indice del elemento a consultar");
                i=sc.nextInt();

            }while(i<0 || i>tabla.length-1);
            System.out.println("El elemento en indice "+i+ "tiene valor= "+tabla[i]);

        }else{
            System.out.println("No hay elementos que consultar");
        }
    }

    public static void main(String[] args) {
        int[] tabla = new int[0];

        int eleccion=80;

        do {

            System.out.println("Elige lo que quieras hacer\n" +
                    "1. Alta elemento en la lista\n" +
                    "2. Consulta de un elemento de la lista\n" +
                    "3. Modificación de un elemento de la lista\n" +
                    "4. Baja de un elemento de la lsita\n" +
                    "5. Listado de todos los elementos de la lista\n" +
                    "0. Salida.");

            eleccion = sc.nextInt();

            while (eleccion < 0 || eleccion > 5) {
                System.out.println("Este numero no es valido");
                eleccion = sc.nextInt();
            }

            System.out.println("Opcion seleccionada: " + eleccion);

            boolean salida = false;

            do {

                switch (eleccion) {
                    case 1:
                        char repetir = 's';
                        do {
                            //se puede sobreescribir a una tabla de longitud X una nueva tabla de longitud diferente
                            tabla = altaElemento(tabla);
                            System.out.println("Desea continuar?");
                            repetir = sc.next().charAt(0);
                        } while (repetir == 's');
                        salida = true;
                        System.out.println();
                        break;
                    case 2:
                        consultaElemento(tabla);
                        break;
                    case 0:
                        salida = true;
                        break;

                }


            } while (salida == false);




        }while(eleccion != 0);

    }
}

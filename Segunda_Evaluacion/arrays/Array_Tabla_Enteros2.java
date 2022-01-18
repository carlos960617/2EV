package com.company.Segunda_Evaluacion.arrays;

import java.util.Scanner;

public class Array_Tabla_Enteros2 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[] arrayNumeros = new int[0];

        boolean salida = false;

        int opcion;

        do{
            do{
                System.out.println("""
                Elige lo que quieras hacer
                1. Alta elemento en la lista
                2. Consulta de un elemento de la lista
                3. Modificación de un elemento de la lista
                4. Baja de un elemento de la lsita
                5. Listado de todos los elementos de la lista
                0. Salida.""");

                opcion= sc.nextInt();
            }while(opcion<0 || opcion >5);

            switch (opcion){
                case 1:

                    // para saber si querimos seguir repitiendo un case o salirnos de este:

                    char repetir = 's';

                    do{

                        arrayNumeros = altaElemento(arrayNumeros);
                        System.out.println("Quieres dar de alta otr numero?");
                        repetir = sc.next().charAt(0);

                    }while(repetir == 's');

                    break;
                case 2:

                    int numero = consultaElemento(arrayNumeros);

                    //te falta la condicion de que se filtre que el numero resctado es correcto
                    // if(numero != )

                    break;
                case 3:

                    break;
                case 4:

                    break;

                case 5:
                    listaElementos(arrayNumeros);
                    break;
                case 0:
                    salida = true;
                    break;
            }


        }while(salida == false);




    }

    public static  int[] altaElemento(int[] arrayE){
        int[] arrayN = new int[arrayE.length+1];

        if(arrayE.length > 0){

            for(int i= 0;i<arrayE.length;i++){
                arrayN[i] = arrayE[i];
            }

        }else{
            System.out.println("No hay elementos que copiar");
        }



        System.out.println("Añade el valor nuevo para tu array");

        //tambien puedes indicar el indice con [arrayE.length]
        arrayN[arrayN.length-1] = sc.nextInt();

        return arrayN;

    }

    public static void listaElementos(int[] arrayE){

        System.out.println("Array: ");

        for(int i = 0; i<arrayE.length;i++){
            System.out.print(" "+arrayE[i]);

        }

        System.out.println();
    }

    public static int consultaElemento(int[] array){
        System.out.println("Introduce el índice del elemento que quieres consultar \n" +
                "Numero entre 0 y " + (array.length-1));
        int i = sc.nextInt();

        if(i>=0 && i<= array.length-1){
            return array[i];
        }else{return -1;}

    }
}

package com.company.Segunda_Evaluacion.arrays.Martes21;

import java.util.Arrays;

public class Referencias {

    public static void muestraArray(int[] array){

        for(int i= 0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }

    public static void main(String[] args) {

        /*int[] array1 = {4, 8, 9 ,7};

        muestraArray(array1);

        int[] array2 = array1;

        System.out.println(" ");

        muestraArray(array2);*/


        /*int[] array = new int[5];
        int[] otroArray = array;

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(otroArray));


        otroArray[0] = 3;

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(otroArray));*/

        /*

       Puedes almacenar en una referencia un array que ya existe así:
       int[]array = new int[longitud1]; direccion de memoria:A
       array = new int[longitud2]; direccion de memoria: B

       tambien puedes reescribir la direccion de memoria especificando los nuevos valores.
        array = new int[]{1,2,3,4} dirección de memoria: C */




    }
}

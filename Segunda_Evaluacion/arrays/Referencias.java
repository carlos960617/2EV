package com.company.Segunda_Evaluacion.arrays;

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


        /*int[] array = {2,4,5,6,7};
        int[] otroArray = array;

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(otroArray));


        otroArray[0] = 3;

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(otroArray));

        /*

       Puedes almacenar en una referencia un array que ya existe así:
       int[]array = new int[longitud1]; direccion de memoria:A
       array = new int[longitud2]; direccion de memoria: B

       tambien puedes reescribir la direccion de memoria especificando los nuevos valores.
        array = new int[]{1,2,3,4} dirección de memoria: C */


        /*Arrays de caracteres:
        char[] vocales = {a,e,i,o,u}
        cuando haces sout the chararraysse imprime la cadena de valores directmente no la direccion de mmeoira SORPRESA!

        Cuando defines un objeto sin inizialicarlo con new tiene valor null

         */


        /** Copiar un array en otro
         int totalLength = src.length + dst.length;

         int[] dstTemp = new int[totalLength];

         for(int i = 0, j=0;i<totalLength;i++){
         if(i < dst.length){
         dstTemp[i] = dst[i];
         }else{
         dstTemp[i] = src[j];
         j++;
         }

         dst = dstTemp;
         */

        int[] array1 = {9,2,3,4,5};

        Arrays.sort(array1);

        System.out.println(Arrays.toString(array1));





    }
}

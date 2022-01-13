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

        /*int[] array1 = {9,2,3,4,5};

        Arrays.sort(array1);

        System.out.println(Arrays.toString(array1));*/


        /*
        * COLLECTIONS:
        * Arrays.sort(arrayName, Collections.reverseOrder()).
        * Solo se puede utilizar sobre arrays de objetos asiqeu si tienes un int[] array tienes que convertirlo en integer[] array porque Integer es
        * una version objeto de int
        * */


        /*Metodos de ordenacion:
        Burbuja: el primero y el menos eficiente va comparando los ints de dos en dos y si el segundo es mas bajo que el primero pues los cambia de sitio
        * En la primera optimizacion se arrastran al final del array los digitos que son mas altos y asi a cada vuelta se le resta el numero de vueltas que das
        porque no necesitas iterar hasta donde esta guardado el mas alto.
        La tercera optimizacion utiliza un booleando para parar el forloop cuando el interruptor no se altere porque haya un mayor antes que un menor

        De ordenacion por seleccion:
        Va colocando los mas pequeños al principio*/





    }
}

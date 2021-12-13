package com.company.Segunda_Evaluacion.arrays;

public class Arrays0712 {

    //mismo tipo de datos

    public static void main(String[] args) {

        //declaracion array de longitud 10 con valor preestablecido 0

        int[] myArray = new int[10];

        //inicializar valores

        int[] myArray2 = {2,4,5,6,5,2,5,7};

        System.out.println(myArray[0]);

        System.out.println(myArray2.length);

        //cargar un array atraves de un for

        for(int i =0; i<myArray.length; i++){
            myArray[i] = i;
        }

        //imprimimos valores array

        for(int i =0; i<myArray.length; i++){
            System.out.print(myArray[i]+" ");
        }

        //sobreescribimos el valor de un elemento

        myArray[0]=200;

        System.out.println("\n"+myArray[0]);

        //sobreescribir varios valores a la vez





    }
}

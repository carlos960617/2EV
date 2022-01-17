package com.company.Segunda_Evaluacion.arrays.Viernes14Enero;

public class Programa {

    public static void main(String[] args) {

        int longitud = args.length;

        System.out.println("La longitud del array del main es de "+ longitud+" elementos.\n" +
                "Y su contenido es:");


        for(int i=0; i<args.length; i++ ){
            System.out.println(args[i]);
        }


    }
}

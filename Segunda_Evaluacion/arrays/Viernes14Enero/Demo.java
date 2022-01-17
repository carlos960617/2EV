package com.company.Segunda_Evaluacion.arrays.Viernes14Enero;

import java.util.Arrays;

public class Demo {

    public static void main(String[] args) {

        int total= 0;

        for(int i=0; i<args.length;i++){


        total += Integer.parseInt(args[i]);

        }

        System.out.println("La suma de "+ Arrays.toString(args)+" es igual a "+total);
    }
}

package com.company.Segunda_Evaluacion.arrays;

import java.util.Scanner;

public class Array5_7 {

    static Scanner sc = new Scanner(System.in);

    public static double[] rellenaArrays(double[] array){


        for(int i=0;i<array.length;i++){
            array[i] = sc.nextInt();
        }

        return array;

    }

    public static void main(String[] args) {

        double[] notas = new double[24];

        System.out.println("Introduce las notas de tus alumnos");

        rellenaArrays(notas);


    }
}

package com.company.arrays;

import java.util.Scanner;

public class Array5_4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] myArray2 = new int[5];

        for(int i=0;i<myArray2.length;i++){
            myArray2[i] += sc.nextInt();
        }

        int suma=0;

        for(int i=0;i<myArray2.length;i++){
            suma += myArray2[i];
        }

        double media = suma/(double)myArray2.length;

        System.out.println(media+" ");



    }
}

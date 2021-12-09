package com.company.arrays;

import java.util.Scanner;

public class Array5_2 {

    //como declarar metodos que devuelvan arrays:

    /*public static int[] metodo{
        return
    }*/
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] myArray2 = new int[5];

        for(int i=0;i<myArray2.length;i++){
            myArray2[i] = sc.nextInt();
        }

        for(int i = 0; i<myArray2.length;i++){
            System.out.println(myArray2[i]+" ");
        }

    }
}

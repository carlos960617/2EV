package com.company.Segunda_Evaluacion.arrays;

import java.util.Scanner;

public class Array5_3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] myArray2 = new int[5];

        for(int i=0;i<myArray2.length;i++){
            myArray2[i] += sc.nextInt();
        }

        for(int i=myArray2.length-1;i>=0;i--){
            System.out.println(myArray2[i]+" ");
        }
    }
}

package com.company.Segunda_Evaluacion.arrays;

public class Array5_1 {

    public static void main(String[] args) {

        int[] myArray2 = {3, 54, 10, 4, 1000};

        for(int i = 0; i<myArray2.length;i++){
            System.out.println(myArray2[i]+" ");
        }

    }

    public static int[] reverse(int[] array){

        int[] array2 = new int[array.length];

        for(int i=array.length-1, j=0;i>=0;i--, j++){
            array2[j] = array[i];
        }

        return array2;
    }

    public static int max(int[] array){

        int max = array[0];

        for (int j : array) {
            if (j > max) {
                max = j;
            }
        }

        return max;
    }

    public static int min(int[] array){

        int min = array[0];

        for (int j : array) {
            if (j < min) {
                min = j;
            }
        }

        return min;
    }

    public static int sum(int[] array){
        int sum = 0;

        for(int i : array){
            sum += i;
        }

        return sum;
    }






}

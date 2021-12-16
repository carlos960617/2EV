package com.company.Segunda_Evaluacion.arrays.Martes21;

public class Array_11 {

    public static boolean isArrayOn (int[] src, int[] dst) {
        int coincide = 0;

        for(int i = 0;i<dst.length;i++){

            for(int j = 0;j<src.length;j++){
                if(dst[i] == src[j]){
                    coincide++;
                }
            }
        }

        if(coincide >= src.length){
            return true;
        }else{return false;}
    }

    public static void main(String[] args) {

        int[] array = {3, 5, -5, 6, 27, 44, 69, -100, 1, 0, 2000};

        int[] array2 = {2000, 69, -100};

        System.out.println(isArrayOn(array2, array));


    }
}

package com.company.Segunda_Evaluacion.arrays;

public class Array5_5 {

    public static void main(String[] args) {

        double[] array1 = new double[5];

        for(int i=0;i<array1.length;i++){
            array1[i] += (int)(Math.random()*11);
        }

        double numMax=0;
        double numMin=10;

        for(int i=array1.length-1;i>=0;i--){
            if(array1[i]>numMax){
                numMax = array1[i];
            }
            if(array1[i]<numMin){
                numMin=array1[i];
            }

        }

        System.out.println(numMax + " "+ numMin);
    }
}

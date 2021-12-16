package com.company.Segunda_Evaluacion.arrays.Martes21;

public class Arrays21_1 {

    public static void main(String[] args) {

        /*int[] array = {22, 5, 19, 1, -17, 0, -1, 19, 24, -13};

        int max = array[0];

        /*for(int i =0;i<array.length;i++){
            if(array[i]>max){
                max = array[i];
            }
        }

        System.out.println("Numero máximo: "+max);

       /* int[] array = {-35, -13, -77, -46, -82, -2, -26};

        int min=array[0];

        /*for(int i =0;i<array.length;i++){
            if(array[i]<min){
                min = array[i];
            }
        }*/

        /*for(int num:array){
            if(num>max){
                max = num;
            }
        }

        System.out.println("Numero máximo: "+max);



        /*for (int num:array){
            if(num<min){
                min = num;
            }
        }


        System.out.println("Numero mínimo: "+min);*/

        double[] array = {-47.39, 24.96, -1.02, 3.45, 14.21, 32.6, 19.42};

        double sum=0;
        double media=0;

        for (double num:array){
            sum += num;
        }

        media = sum/array.length;

        System.out.println("La media de tu array es: "+media);

    }
}

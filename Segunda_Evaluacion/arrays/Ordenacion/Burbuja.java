package com.company.Segunda_Evaluacion.arrays.Ordenacion;

public class Burbuja {

    public static void main(String[] args) {

        int[] array = {24, 18, 90, 1, 0, 85, 34, 18};

        boolean intercambio = true;

        int i=0;
        int aux=0;


        while (intercambio){
            intercambio = false;
            for (int j = 0 ; j < array.length-1-i ; j++) {
                if (array[j] > array[j + 1] ) {
                    aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                    intercambio = true;
                }
            }


            i++;
        }


    }

}

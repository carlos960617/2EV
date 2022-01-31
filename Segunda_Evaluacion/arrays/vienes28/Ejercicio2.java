package com.company.Segunda_Evaluacion.arrays.vienes28;

public class Ejercicio2 {

    public static int[][] cargaArray(int[][] a){

        for(int i = 0; i<a.length;i++){
            for(int j= 0;j <a[i].length;j++) {

                if(i == j){
                    a[i][j] = 1;
                }else{
                    a[i][j] = 0;
                }

            }
        }

        return a;
    }

    public static void main(String[] args) {

        int[][] matriz = new int[7][7];

        matriz = cargaArray(matriz);

        Ejercicio1.muestraArray(matriz);


    }
}

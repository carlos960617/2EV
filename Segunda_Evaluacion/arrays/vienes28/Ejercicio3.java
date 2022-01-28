package com.company.Segunda_Evaluacion.arrays.vienes28;

public class Ejercicio3 {

    public static int[][] cargaArray(int[][] a){

        for(int i = 0; i<a.length;i++){
            for(int j= 0;j <a[i].length;j++){
                if(i == 0 || j == 5 || i==7 || j==0){
                    a[i][j] = 1;
                }else{
                    a[i][j] = 0;
                }
            }
        }

        return a;
    }


    public static void main(String[] args) {

        int[][] matriz = new int[8][6];

        cargaArray(matriz);

        Ejercicio1.muestraArray(matriz);


    }
}

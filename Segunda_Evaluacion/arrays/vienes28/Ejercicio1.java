package com.company.Segunda_Evaluacion.arrays.vienes28;

public class Ejercicio1 {

    public static int[][] cargaArray(int[][] a){

        for(int i = 0; i<a.length;i++){
            for(int j= 0;j <a[i].length;j++){
                a[i][j] = (int)(Math.random()*11);
            }
        }

        return a;
    }

    public static int[][] sumaArrays(int[][] a, int[][] b){
        int[][] suma = new int[a.length][a[0].length];

        for(int i = 0; i<a.length;i++){
            for(int j= 0;j <a[i].length;j++){
                suma[i][j] = a[i][j] + b[i][j];
            }
        }

        return suma;
    }

    public static void muestraArray(int[][] a){

        for(int i = 0; i<a.length;i++){
            for(int j= 0;j <a[i].length;j++){
                if(a[i][j] < 10){
                    System.out.print("0"+a[i][j]+" ");
                }else{
                    System.out.print(a[i][j]+" ");
                }

            }

            System.out.println("");
        }

        System.out.println("--------");

    }

    public static void main(String[] args) {

        //Ejercicio 1.

        int[][] matriz1 = new int[3][3];

        int[][] matriz2 = new int[3][3];

        //Rellenamos los arrays

        matriz1 = Ejercicio1.cargaArray(matriz1);
        matriz2 = Ejercicio1.cargaArray(matriz2);

        //Sumamos los arrays

        int[][] matrizSuma = Ejercicio1.sumaArrays(matriz1, matriz2);

        //Mostramos el resultado

        Ejercicio1.muestraArray(matriz1);

        Ejercicio1.muestraArray(matriz2);

        Ejercicio1.muestraArray(matrizSuma);

    }
}

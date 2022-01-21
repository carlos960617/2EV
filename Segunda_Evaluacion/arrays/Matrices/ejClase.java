package com.company.Segunda_Evaluacion.arrays.Matrices;

import java.util.Scanner;

public class ejClase {

    public static void main(String[] args) {

        int[][] matriz = new int[5][4];

        System.out.println("Introduce los valores para la matriz de longitud 5x4");

        Scanner sc = new Scanner(System.in);

        for(int i=0;i<5;i++){
            for(int j=0;j<4;j++){
                matriz[i][j]= sc.nextInt();

            }
        }

        for(int i=0;i<5;i++){
            for(int j=0;j<4;j++){
                System.out.print(matriz[i][j]+" ");

            }
            System.out.println("");
        }

    }
}

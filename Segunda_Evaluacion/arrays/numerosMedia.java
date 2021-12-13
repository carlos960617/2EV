package com.company.Segunda_Evaluacion.arrays;

import java.util.Scanner;

public class numerosMedia {

    public static Double mostrarMedia(int[] n){
        double media;
        int suma = 0;
        for(int i=0;i<n.length;i++){
            suma += n[i];

        }

        return media = suma/n.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("De cuantos elementos se compone tu array?");

        int tamanyo = sc.nextInt();

        int[] serie = new int[tamanyo];

        int i = 0;


        do{
            System.out.println("Introduce numero");
            serie[i] += sc.nextInt();
            i++;
        }while(i<tamanyo);

        System.out.println(mostrarMedia(serie));

    }
}

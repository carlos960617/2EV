package com.company.Segunda_Evaluacion.arrays.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayList1 {

    static Scanner sc = new Scanner(System.in);

    public static int mediaArrayL(ArrayList<Integer> a1, int result){

        int media = result/a1.size();
        System.out.println("La media es = "+media);

        return media;


    }

    public static int sumaArrayL(ArrayList<Integer> a1){

        int result = 0;


        for(int i=0;i<a1.size();i++){
            result += a1.get(i);
        }
        System.out.println("\nLa suma es = "+result);

        return result;
    }

    public static ArrayList<Integer> imprimeArrayL(ArrayList<Integer> a1){


       for(int i=0;i<a1.size();i++){
           System.out.print(a1.get(i)+ " ");
       }

       return a1;
    }

    public static ArrayList<Integer> cargaArrayL(ArrayList<Integer> a1){

        System.out.println("Vamos a crear tu array.");
        int nextInt= sc.nextInt();

        while(nextInt != 0){
            a1.add(nextInt);
            System.out.println("Introduce el siguiente número");
            nextInt = sc.nextInt();
            if(nextInt!= 0){
                a1.add(nextInt);
            }
        }

        return a1;
    }


    public static void main(String[] args) {


        ArrayList<Integer> arrayL1 = new ArrayList();

        cargaArrayL(arrayL1);

        imprimeArrayL(arrayL1);

        int suma = sumaArrayL(arrayL1);

        mediaArrayL(arrayL1, suma);


    }
}

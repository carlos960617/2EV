package com.company.Segunda_Evaluacion.arrays.febreromartes1;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayList {

    static Scanner sc = new Scanner(System.in);


    public static void mayorMedia (ArrayList<Integer> a, int media){

        for(int i = 0;i<a.size();i++){
            if(a.get(i) > media ){
                System.out.println(a.get(i)+": mayor a la media");
            }else{
                System.out.println(a.get(i)+": menor a la media");
            }
        }
    }

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

        System.out.println("Vamos a crear tu array. Introduce el primer numero:");

        int nextInt= sc.nextInt();
        while(nextInt != -99){
            a1.add(nextInt);
            System.out.println("Siguiente (para acabar introduce \"-99\")");
            nextInt = sc.nextInt();
            if(nextInt != -99){
                a1.add(nextInt);
            }
        }

        return a1;
    }

    public static void main(String[] args) {

        ArrayList<Integer> collecionInt = new ArrayList();

        cargaArrayL(collecionInt);

        imprimeArrayL(collecionInt);

        int total = sumaArrayL(collecionInt);

        int media = mediaArrayL(collecionInt, total);

        mayorMedia(collecionInt, media);






    }
}

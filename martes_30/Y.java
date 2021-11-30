package com.company.martes_30;

import java.util.Random;
import java.util.Scanner;

public class Y {

    public static void main(String[] args) {

        Random rndm = new Random();

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero entre 5 y 15");

        int n = sc.nextInt();

        int bign = n;
        int x=0;

        for(int i=0; i<bign-((bign/2)-1);i++){
            for(int k=0;k<x ;k++){
                System.out.print(" ");
            }
            for(int j=0;j<n;j++){
                if(j==0 || j==n-1){
                    System.out.print(rndm.nextInt(  10));
                }else{
                    System.out.print("  ");
                }
            }

            System.out.println(" ");
            n--;
            x++;
        }
        for(int i=bign/2; i<bign;i++){
            for(int j=0;j<((bign/2)+2);j++){
                System.out.print(" ");
            }
            System.out.println(rndm.nextInt(10));

        }
    }
}

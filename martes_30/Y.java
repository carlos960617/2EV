package com.company.martes_30;

import java.util.Random;
import java.util.Scanner;

public class Y {

    public static void main(String[] args) {

        Random rndm = new Random();

        Scanner sc = new Scanner(System.in);

        int bigN;

        do{

            System.out.println("Introduce un numero entre 5 y 15");

            bigN = sc.nextInt();

        }while(bigN >15 || bigN<5 || bigN%2 == 0 );

        int n = bigN;
        int h = 0;
        int sum = 0;
        int num;
        int prod = 1;

        for (int i = 0; i<bigN/2;i++){
            for(int k=0; k<=h;k++){
                System.out.print(" ");
            }
            for(int j = 0; j<n;j++){
                if(j==0 || j==n-1){
                    num = rndm.nextInt(10 - 1) +1;
                    System.out.print(num);
                    sum += num;
                    prod *= num;
                }else{
                    System.out.print(" ");
                }
            }
            n -=2;
            h++;
            System.out.println(" ");
        }

        for (int i = 0; i<=bigN/2;i++){
            for(int j=0; j<=bigN/2+1;j++){
                if(j==bigN/2+1){
                    num = rndm.nextInt(10-1)+1;
                    System.out.print(num);
                    sum += num;
                    prod *= num;
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println(" ");
        }

        System.out.println("El sumatorio de los numeros es = "+sum+"\n" +
                "Y el producto = "+prod);

        /*int bign = n;
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

        }*/
    }
}

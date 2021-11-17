package com.company.T4_1;

import java.util.Scanner;

public class T4$7_Menorde20 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n=0;

        while(n <=20){

            n = sc.nextInt();

            if(n>20){
                System.out.println("Este numero es demasiado grande, chao.");
            }else{System.out.println("Numero introducido = "+n+".");}


        }
    }
}

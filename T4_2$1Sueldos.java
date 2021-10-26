package com.company;

import java.util.Scanner;

public class T4_2$1Sueldos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sueldo = 0;
        int sueldomax = 1;
        int sueldomin = 0;

        do{

            sueldo = sc.nextInt();

            if(sueldo > sueldomax){
                sueldomax = sueldo;
                System.out.println("El sueldo maximo es "+sueldomax+" y el sueldo minimo es "+ sueldomin+".");
                sueldomin = sueldo;
            }else if(sueldo < sueldomax && sueldo < sueldomin ){
                sueldomin = sueldo;
                System.out.println("El sueldo maximo es "+sueldomax+ " y el sueldo minimo es "+sueldomin+".");
            }



        }while(sueldo != 0);

    }


}


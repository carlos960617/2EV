package com.company;

import java.util.Scanner;

public class T4_2$4productoPares {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce los numeros de los que quieras calcular la suma y producto \n" +
                "de los numeros pares que se comprendan entre ellos.");

        int a = sc.nextInt();

        int b = sc.nextInt();

       /*if (a%2 != 0){
            a +=1;
            while(a < b){
                c = a + 2;
            }
        }

        if (a%2 == 0){
            while(a < b){
                a += 2;
            }
        }*/

        /*int valora = sc.nextInt();
        int b = sc.nextInt();
        int a;

        for (a = valora; a<b; a+=2){

            System.out.println(a+"");

        }*/

        int sum = 0;
        int producto = 1;

        while (a < (b-2) && a < (b-1)){

            if(a%2 !=0){
                a += 1;
                sum += a;
                producto *= a;
            }

            if(a < (b-2) && a < (b-1)){
                a += 2;
                sum += a;
                producto *= a;
            }


        }

        System.out.println("La suma de los pares comprendidos entre los dos numeros es = "+sum+".\n" +
                "Y el producto es = "+producto+".");
    }
}

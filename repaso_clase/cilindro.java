package com.company.repaso_clase;

import java.util.Scanner;

public class cilindro {



    public static void volArea(int r, int a, char x){

        double resultflat;

        if(x == 'a'){

            resultflat = Math.PI * r * r * a;
            System.out.println("El area de tu cilindro es "+Math.round(resultflat*100.0)/100.0);

        }else if(x == 'v'){

            resultflat = 2*Math.PI * r * (r + a);
            System.out.println("El volumen de tu cilindro es "+Math.round(resultflat*100.0)/100.0);

        }

    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el radio y el area de tu cilindro");

        int r = sc.nextInt();

        int a = sc.nextInt();

        System.out.println("Introduce 'a' para averiguar su area o \n" +
                "'v' para averiguar su volumen. ");

        char x = sc.next().charAt(0);

        volArea(r, a, x);

    }
}

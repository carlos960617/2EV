package com.company.repaso_clase;

import java.util.Scanner;

public class conversionPersonalizada {

    public static double toBitCoin (double dinero, char currency){


        double bitcoin = 0;

        switch(currency){
            case 'd':

                bitcoin = dinero * 0.000017;
                break;

            case 'e':
                bitcoin = dinero * 0.000020;
                break;

            case 'r':
                bitcoin = dinero * 4289882.25;
                break;

            case 'y':

                bitcoin = dinero * 369223.87;
                break;

        }

        return bitcoin;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la cantidad de dinero");

        double cantidad = sc.nextDouble();

        System.out.println("Introduce la moneda\n" +
                "d = dolares\n" +
                "e = euros\n" +
                "y = yuanes\n" +
                "r = rupias");

        char moneda = sc.next().charAt(0);

        double cambio = toBitCoin(cantidad, moneda);

        System.out.println("La cantidad de "+cantidad+" \n" +
                "equivale a "+cambio+ " bitcoins.");







    }
}
